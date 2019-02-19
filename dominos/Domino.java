package dominos;

import java.util.List;
import java.util.Set;

public interface Domino {

	public static final int MINIMUM_PIP_COUNT = 0;
	public static final int MAXIMUM_PIP_COUNT = 6;
	//part of post: MINIMUM_PIP_COUNT <= rv <= MAXIMUM_PIP_COUNT
	//part of post: getLowPipCount(); <= rv;
	
	public int getHighPipCount();
	public int getLowPipCount();
//	int DominoHighLowImpl_Skeleton(int highPipCount, int lowPipCount);x	
//	int DominoHighLowImpl_Skeleton(String highLowString);x
//	int DominoHighLowImpl_Skeleton(int[] sumDifference);x
//	int DominoHighLowImpl_Skeleton(Set<Integer> highLowSet)x;
//	int DominoHighLowSetImpl_Skeleton(String sumDifferenceString);
//	int DominoHighLowSetImpl_Skeleton(int lowPlus8TimesHigh);
//	int DominoLowDifferenceStringImpl_Skeleton(int lowPlus8TimesHigh);
//	int DominoLowDifferenceStringImpl_Skeleton(List<Integer> highSum);
	
	
	//Julie, think of it as lowPipCount + (8*highPipCount).

	//part of psot: MINIMUM_PIP_COUNT <= rv_ <= maximum pip count
	//part of post: rv <= getHighPipCount;
}
