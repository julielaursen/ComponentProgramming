package dominos;

import java.util.Iterator;
import java.util.List;

public class DominoLowDifferenceStringImpl_Skeleton extends DominoBase {
	
	private String lowDifferenceString;
	public int sum;
	private static final char LOW_DIFFERENCE_DELIMITER = '*';
	public static final int INDEX_OF_HIGH = 0;
	public static final int INDEX_OF_SUM = 1;
	private final String pipCountString;


	
	public DominoLowDifferenceStringImpl_Skeleton(String lowPlus8TimesHighString)
	{
		int lowPlus8TimesHigh = 0;
		assert lowPlus8TimesHighString != null:"Null cannot be passed in";
		try {
			lowPlus8TimesHigh = Integer.parseInt(lowPlus8TimesHighString);
		}catch(NumberFormatException e) {
			assert false:"Bad number";
		}
		assert isLowPlus8TimesHighInteger(lowPlus8TimesHigh):"Does not meet lowPipCount + (8*highPipCount)";
		highPipCount = Math.abs(lowPlus8TimesHigh / 8);
		lowPipCount = Math.abs(lowPlus8TimesHigh % 8);
		pipCountString = "" + highPipCount + lowPipCount;
		validateHighLow();
		
	}
	
	public boolean isLowPlus8TimesHighInteger(int lowPlus8TimesHigh) {
		if(lowPlus8TimesHigh < 0) {
			return false;
		}
		if(lowPlus8TimesHigh > 54) {
			return false;
		}
		return true;
	}
	
	public DominoLowDifferenceStringImpl_Skeleton(List<Integer> highSum)
	{
		assert highSum != null;
		assert (highSum.size() == 2);
		Iterator<Integer>  itr = highSum.iterator();
		Integer i = itr.next();
		Integer j = itr.next();
		if(i > j) {
			sum = i;
			highPipCount = j;
		}
		else if(i == j) {
			sum = i + j;
			highPipCount = j;
		}
		else {
			sum = j;
			highPipCount = i;
		}
		lowPipCount = sum - highPipCount;	
		pipCountString = "" + highPipCount + lowPipCount;
		validateHighLow();
		System.out.println(highSum + " is a valid input, lowPipCount is " + lowPipCount);

	//}
	}
}
