package dominos;

import java.util.Iterator;
import java.util.Set;

public class DominoHighLowImpl_Skeleton implements Domino {

	public static final String HIGH_LOW_STRING_SEPARATOR = ":";
	public static final int INDEX_OF_SUM = 0;
	public static final int INDEX_OF_DIFFERENCE = 1;
	private final int highPipCount;
	private final int lowPipCount;
	private static int MIN_PIP_COUNT = 0;
	private static int MAX_PIP_COUNT = 6;
	private final String pipCountString;

	public DominoHighLowImpl_Skeleton(int highPipCount, int lowPipCount) {
		this.highPipCount = highPipCount;
		this.lowPipCount = lowPipCount;
		pipCountString = "" + highPipCount + HIGH_LOW_STRING_SEPARATOR + lowPipCount;
		validateHighLow();
	}

	public DominoHighLowImpl_Skeleton(String highLowString) {
		System.out.println(highLowString);
		String[] split = highLowString.split(HIGH_LOW_STRING_SEPARATOR);
		assert split.length != 2;
		highPipCount = Integer.parseInt(split[0].trim());
		lowPipCount = Integer.parseInt(split[1].trim());
		pipCountString = "" + highPipCount + HIGH_LOW_STRING_SEPARATOR + lowPipCount;
		validateHighLow();
	}

	private void validateHighLow() {
		assert MIN_PIP_COUNT <= lowPipCount:" Low count cannot be less than the min count";
		assert lowPipCount <= MAX_PIP_COUNT:"Low count cannot be more than the max count ";
		assert MIN_PIP_COUNT <= highPipCount: "High count cannot be less than the min count";
		assert highPipCount <= MAX_PIP_COUNT:"High count cannot be more than the max count";
		assert lowPipCount <= highPipCount:"High count cannot be less than the low count";
	}

	public DominoHighLowImpl_Skeleton(int[] sumAndDifference) {
		assert sumAndDifference != null;
		assert sumAndDifference.length == 2;
		int sum = sumAndDifference[INDEX_OF_SUM];
		int difference = sumAndDifference[INDEX_OF_DIFFERENCE];
		assert 2 * MIN_PIP_COUNT <= sum;
		assert sum <= 2 * MAX_PIP_COUNT;
		assert -(MAX_PIP_COUNT - MIN_PIP_COUNT) <= difference;
		assert difference <= (MAX_PIP_COUNT - MIN_PIP_COUNT);
		assert difference <= sum;

		if (difference >= 0) {
			lowPipCount = (sum - difference) / 2;
			highPipCount = (sum + difference) / 2;
		} else {
			lowPipCount = (sum + difference) / 2;
			highPipCount = (sum - difference) / 2;
		}
		pipCountString = "" + lowPipCount + highPipCount;
		validateHighLow();

	}

	public DominoHighLowImpl_Skeleton(Set<Integer> highLowSet) {
		assert highLowSet != null;
		assert (highLowSet.size() == 2);
		System.out.println(highLowSet.size());
		Iterator<Integer>  itr = highLowSet.iterator();
		Integer i = itr.next();
		Integer j = itr.next();
		if(i > j) {
			highPipCount = i;
			lowPipCount = j;
		}
		else {
			highPipCount = j;
			lowPipCount = i;
		}
		pipCountString = "" + lowPipCount + highPipCount;

		validateHighLow();

	}

	@Override
	public int getHighPipCount() {
		return highPipCount;
	}

	@Override
	public int getLowPipCount() {
		return lowPipCount;
	}

	// part of pre: sumDinfference.length == 2
	// part of pre: sumdifference[INDEX OF SUM] >= sumDifference[INDEX OF
	// DIFFERENCE]

	// part of pre: 1<= highLowSet.size() <= 2
	// part of pre: ! highLowSet.contains(null)

}
