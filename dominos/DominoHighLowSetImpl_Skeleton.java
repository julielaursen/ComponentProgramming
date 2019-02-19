package dominos;

import java.util.Set;

public class DominoHighLowSetImpl_Skeleton extends DominoBase {

	public static final String SUM_DIFFERENCE_DELIMITER = ",";
	private Set<Integer> highLowSet;
	public static final int INDEX_OF_SUM = 0;
	public static final int INDEX_OF_DIFFERENCE = 1;
	private final String pipCountString;
	
	public DominoHighLowSetImpl_Skeleton(int highPipCount, int lowPipCount)
	{
		this.highPipCount = highPipCount;
		this.lowPipCount = lowPipCount;
		highLowSet.add(highPipCount);
		highLowSet.add(lowPipCount);
		pipCountString = "" + highPipCount + lowPipCount;

	}
	
	public static boolean isSumDifferenceString(String str)
	{
		return false;
	}
	
	public DominoHighLowSetImpl_Skeleton(String sumDifferenceString)
	{	
		assert sumDifferenceString != null:"Null cannot be passed in";
		String[] split = sumDifferenceString.split(SUM_DIFFERENCE_DELIMITER);
		assert split.length == 2:"Length must be two " + split.length;
		int sum = Integer.parseInt(split[0].trim());
		int difference = Math.abs(Integer.parseInt(split[1].trim()));
		validateSumDifference(sum, difference);
			lowPipCount = (sum - difference) / 2;
			highPipCount = (sum + difference) / 2;
		
		assert sum == (highPipCount+lowPipCount):"Invalid sum/difference combo";
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
	
	public DominoHighLowSetImpl_Skeleton(int lowPlus8TimesHigh)
	{
		assert isLowPlus8TimesHighInteger(lowPlus8TimesHigh):"Does not meet lowPipCount + (8*highPipCount)";
		highPipCount = Math.abs(lowPlus8TimesHigh / 8);
		lowPipCount = Math.abs(lowPlus8TimesHigh % 8);
		pipCountString = "" + highPipCount + lowPipCount;
		validateHighLow();
		

	}


}
