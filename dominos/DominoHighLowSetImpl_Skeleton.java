package dominos;

import java.util.Set;

public class DominoHighLowSetImpl_Skeleton implements Domino {

	int highPipCount; 
	int lowPipCount; 
	private Set<Integer> highLowSet;
	
	public DominoHighLowSetImpl_Skeleton(int highPipCount, int lowPipCount)
	{
		highLowSet.add(highPipCount);
		highLowSet.add(lowPipCount);
	}
	
	public static final String SUM_DIFFERENCE_DELIMITER = ",";
	public static boolean isSumDifferenceString(String str)
	{
		
		
		return false;
	}
	
	public DominoHighLowSetImpl_Skeleton(String sumDifferenceString)
	{
		highLowSet.add(getLowPipCount());
		highLowSet.add(getHighPipCount());
		
		
	}
	
	public static boolean isLowPlus8TimesHighInteger(int k) {
		return false;
//		if(lowPipCount + 8) * highPipCount) == something) {
//			return true;
//		}
//		else {
//			return false;
//		}
	}
	
	public DominoHighLowSetImpl_Skeleton(int lowPlus8TimesHigh)
	{
		lowPlus8TimesHigh = (lowPipCount + 8) * highPipCount;
	}

	@Override
	public int getHighPipCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getLowPipCount() {
		// TODO Auto-generated method stub
		return 0;
	}

}
