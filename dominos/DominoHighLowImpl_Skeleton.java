package dominos;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class DominoHighLowImpl_Skeleton extends DominoBase {
	

	public static final String HIGH_LOW_STRING_SEPARATOR = ":";
	public static final int INDEX_OF_SUM = 0;
	public static final int INDEX_OF_DIFFERENCE = 1;
	private final String pipCountString;

	
	
	public DominoHighLowImpl_Skeleton(int highPipCount, int lowPipCount) {
		this.highPipCount = highPipCount;
		this.lowPipCount = lowPipCount;
		pipCountString = "" + highPipCount + HIGH_LOW_STRING_SEPARATOR + lowPipCount;
		validateHighLow();
	}

	public DominoHighLowImpl_Skeleton(String highLowString) {
		String[] split = highLowString.split(HIGH_LOW_STRING_SEPARATOR);
		assert split.length == 2:"Length must be two " + split.length;
		highPipCount = Integer.parseInt(split[0].trim());
		lowPipCount = Integer.parseInt(split[1].trim());
		pipCountString = "" + highPipCount + HIGH_LOW_STRING_SEPARATOR + lowPipCount;
		validateHighLow();

		//System.out.println(highLowString + " is valid");
	}

	

	public DominoHighLowImpl_Skeleton(int[] sumAndDifference) {
		assert sumAndDifference != null:"Null cannot be passed in";
		assert sumAndDifference.length == 2:"Length must be two";
		int sum = sumAndDifference[INDEX_OF_SUM];
		int difference = Math.abs(sumAndDifference[INDEX_OF_DIFFERENCE]);
		validateSumDifference(sum, difference);
			lowPipCount = (sum - difference) / 2;
			highPipCount = (sum + difference) / 2;
		
		assert sum == (highPipCount+lowPipCount):"Invalid sum/difference combo";
		pipCountString = "" + highPipCount + lowPipCount;
		validateHighLow();

	}

	public DominoHighLowImpl_Skeleton(List<Integer> highLowSet) {
		assert highLowSet != null;
		assert (highLowSet.size() == 2);
		Iterator<Integer>  itr = highLowSet.iterator();
		Integer i = itr.next();
		Integer j = itr.next();
		if(i > j) {
			highPipCount = i;
			lowPipCount = j;
		}
		else if(i == j) {
			highPipCount = i;
			lowPipCount = j;
		}
		else {
			highPipCount = j;
			lowPipCount = i;
		}
		pipCountString = "" + lowPipCount + highPipCount;

		validateHighLow();
		System.out.println(highLowSet + " is a valid input");
	}
 
	
	public static boolean isHighLowString(String str)
	{
		
		String[] split = str.split(HIGH_LOW_STRING_SEPARATOR);
		if(split.length != 2) {
			System.out.println("Length of input is invalid: " + str);
			return false;
		}
		int highPipCount; 
		int lowPipCount; 

		try{
			
			highPipCount = Integer.parseInt(split[0].trim());
			lowPipCount = Integer.parseInt(split[1].trim());
		}
		catch(Exception e){
			System.out.println(str + " :bad integer");
			return false;
		}
		if(highPipCount >= lowPipCount) {
			if(highPipCount > 6 || lowPipCount > 6) {
				System.out.println(str + ": Invalid constructor. The range of numbers on a domino is 0-6");
				return false;
			}
			if(highPipCount < 0 || lowPipCount < 0) {
				System.out.println(str + ": Invalid constructor. The range of numbers on a domino is 0-6");
				return false;
			}
			System.out.println(str + " is a valid input");
			return true;
		}
		else {
			System.out.println(str + ": High pip must be greater than or equal to low pip: invalid");
			return false;
		}
	}

	// part of pre: sumDinfference.length == 2
	// part of pre: sumdifference[INDEX OF SUM] >= sumDifference[INDEX OF
	// DIFFERENCE]

	// part of pre: 1<= highLowSet.size() <= 2
	// part of pre: ! highLowSet.contains(null)

}
