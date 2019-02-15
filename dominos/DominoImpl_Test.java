package dominos;

import java.util.HashSet;

public class DominoImpl_Test  {

	private DominoHighLowImpl_Skeleton generator = new DominoHighLowImpl_Skeleton(6, 4);
	
	public static void main(String args[]) {
		Domino domino = null;
		isHighLowString("6:2");
		isHighLowString("9:2");
		isHighLowString("2:9");
		isHighLowString("2:4");
		isHighLowString("3:3");
		isHighLowString("0:0");
		isHighLowString("0,0");
		isHighLowString("x: 3");
		isHighLowString("2.1: 3");
		isHighLowString("-1:-1");
		isHighLowString("0 :0");
		Domino dominoSet = new DominoHighLowImpl_Skeleton(new HashSet<Integer>(){{
			add(6);
			add(4);
		}});
		dominoSet = new DominoHighLowImpl_Skeleton(new HashSet<Integer>(){{
			add(9);
			add(4);
		}});

	}
	public static final String HIGH_LOW_STRING_SEPARATOR = ":";

		
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
	
}
