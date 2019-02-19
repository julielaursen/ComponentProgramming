package dominos;

import java.util.ArrayList;
import java.util.HashSet;

public class DominoImpl_Test {

	//private DominoHighLowImpl_Skeleton generator = new DominoHighLowImpl_Skeleton(6, 4);

	public static void main(String args[]) {
		Domino domino = null;
//		try {
//			Domino dom = new DominoHighLowImpl_Skeleton("6:2");
//			System.out.println("Domino created: " + dom.getHighPipCount() + " " + dom.getLowPipCount());
//		} catch (Throwable e) {
//			System.out.println(e.getMessage());
//		}
//		try {
//			Domino dom = new DominoHighLowImpl_Skeleton("9:2");
//			System.out.println("Domino created: " + dom.getHighPipCount() + " " + dom.getLowPipCount());
//		} catch (Throwable e) {
//			System.out.println(e.getMessage());
//		}
//		try {
//			Domino dom = new DominoHighLowImpl_Skeleton("2:9");
//			System.out.println("Domino created: " + dom.getHighPipCount() + " " + dom.getLowPipCount());
//		} catch (Throwable e) {
//			System.out.println(e.getMessage());
//		}
//		try {
//			Domino dom = new DominoHighLowImpl_Skeleton("2:4");
//			System.out.println("Domino created: " + dom.getHighPipCount() + " " + dom.getLowPipCount());
//		} catch (Throwable e) {
//			System.out.println(e.getMessage());
//		}
//		try {
//			Domino dom = new DominoHighLowImpl_Skeleton("3:3");
//			System.out.println("Domino created: " + dom.getHighPipCount() + " " + dom.getLowPipCount());
//		} catch (Throwable e) {
//			System.out.println(e.getMessage());
//		}
//		try {
//			Domino dom = new DominoHighLowImpl_Skeleton("0:0");
//			System.out.println("Domino created: " + dom.getHighPipCount() + " " + dom.getLowPipCount());
//		} catch (Throwable e) {
//			System.out.println(e.getMessage());
//		}
//		try {
//			Domino dom = new DominoHighLowImpl_Skeleton("0,0");
//			System.out.println("Domino created: " + dom.getHighPipCount() + " " + dom.getLowPipCount());
//		} catch (Throwable e) {
//			System.out.println(e.getMessage());
//		}
//		try {
//			Domino dom = new DominoHighLowImpl_Skeleton("x:3");
//			System.out.println("Domino created: " + dom.getHighPipCount() + " " + dom.getLowPipCount());
//		} catch (Throwable e) {
//			System.out.println(e.getMessage());
//		}
//		try {
//			Domino dom = new DominoHighLowImpl_Skeleton("2.1:3");
//			System.out.println("Domino created: " + dom.getHighPipCount() + " " + dom.getLowPipCount());
//		} catch (Throwable e) {
//			System.out.println(e.getMessage());
//		}
//		try {
//			Domino dom = new DominoHighLowImpl_Skeleton("-1:-1");
//			System.out.println("Domino created: " + dom.getHighPipCount() + " " + dom.getLowPipCount());
//		} catch (Throwable e) {
//			System.out.println(e.getMessage());
//		}
//		try {
//			Domino dom = new DominoHighLowImpl_Skeleton("0:0");
//			System.out.println("Domino created: " + dom.getHighPipCount() + " " + dom.getLowPipCount());
//		} catch (Throwable e) {
//			System.out.println(e.getMessage());
//		}
//		try {
//			Domino dom = new DominoHighLowImpl_Skeleton(new int[] {10,-2});
//			System.out.println("Domino created: " + dom.getHighPipCount() + " " + dom.getLowPipCount());
//		} catch (Throwable e) {
//			System.out.println(e.getMessage());
//		}
//
//		try {
//			Domino dom = new DominoHighLowImpl_Skeleton(new int[] { 6, 0 });
//			System.out.println("Domino created: " + dom.getHighPipCount() + " " + dom.getLowPipCount());
//		} catch (Throwable e) {
//			System.out.println(e.getMessage());
//		}
//		try {
//			Domino dom = new DominoHighLowImpl_Skeleton(new int[] { 3, 3 });
//			System.out.println("Domino created: " + dom.getHighPipCount() + " " + dom.getLowPipCount());
//		} catch (Throwable e) {
//			System.out.println(e.getMessage());
//		}
//		try {
//			Domino dom = new DominoHighLowImpl_Skeleton(new int[] { -9, 0 });
//			System.out.println("Domino created: " + dom.getHighPipCount() + " " + dom.getLowPipCount());
//		} catch (Throwable e) {
//			System.out.println("Error = " + e.getMessage());
//		}
//		try {
//			Domino dom = new DominoHighLowImpl_Skeleton(new int[] { 0, 0 });
//			System.out.println("Domino created: " + dom.getHighPipCount() + " " + dom.getLowPipCount());
//		} catch (Throwable e) {
//			System.out.println(e.getMessage());
//		}
//		try {
//			Domino dom = new DominoHighLowImpl_Skeleton(new int[] { -1, 0 });
//		} catch (Throwable e) {
//			System.out.println("Error = " + e.getMessage());
//		}
		try {
			Domino dominoSet = new DominoHighLowImpl_Skeleton(new ArrayList<Integer>() {
				{
					add(6);
					add(4);
				}
			});
		} catch (Throwable e) {
			System.out.println("Error = " + e.getMessage());
		}
//
//		try {
//			Domino dominoSet = new DominoHighLowImpl_Skeleton(new ArrayList<Integer>() {
//				{
//					add(9);
//					add(4);
//				}
//			});
//		} catch (Throwable e) {
//			System.out.println("Error = " + e.getMessage());
//		}
//
//		try {
//			Domino dominoSet = new DominoHighLowImpl_Skeleton(new ArrayList<Integer>() {
//				{
//					add(3);
//					add(2);
//				}
//			});
//		} catch (Throwable e) {
//			System.out.println("Error = " + e.getMessage());
//		}
//		try {
//			Domino dominoSet = new DominoHighLowImpl_Skeleton(new ArrayList<Integer>() {
//				{
//					add(5);
//					add(2);
//				}
//			});
//		} catch (Throwable e) {
//			System.out.println("Error = " + e.getMessage());
//		}
//		try {
//			new DominoHighLowImpl_Skeleton(new ArrayList<Integer>(){
//			{
//				add(0);
//				add(0);
//			}
//		});
//		}catch (Throwable e) {
//			System.out.println("Error " + e.getMessage());
//			e.printStackTrace();
//		}
//		try {
//			Domino dominoSet = new DominoHighLowImpl_Skeleton(new ArrayList<Integer>() {
//				{
//					add(-1);
//					add(1);
//				}
//			});
//		} catch (Throwable e) {
//			System.out.println("Error " + e.getMessage());
//		}
//		try {
//			Domino dominoSet = new DominoHighLowSetImpl_Skeleton("2,1");
//			System.out.println("Domino created: " + dominoSet.getHighPipCount() + " " + dominoSet.getLowPipCount());
//		}
//		catch(Throwable e) {
//			System.out.println("Error " + e.getMessage());
//		}
//		try {
//			Domino dominoSet = new DominoHighLowSetImpl_Skeleton("7,3");
//			System.out.println("Domino created: " + dominoSet.getHighPipCount() + " " + dominoSet.getLowPipCount());
//		}
//		catch(Throwable e) {
//			System.out.println("Error " + e.getMessage());
//		}
//		try {
//			Domino dominoSet = new DominoHighLowSetImpl_Skeleton("10,-2");
//			System.out.println("Domino created: " + dominoSet.getHighPipCount() + " " + dominoSet.getLowPipCount());
//		}
//		catch(Throwable e) {
//			System.out.println("Error " + e.getMessage());
//		}
//		try {
//			Domino domino2 = new DominoHighLowSetImpl_Skeleton(45);
//			System.out.println("Domino created: " + domino2.getHighPipCount() + " " + domino2.getLowPipCount());
//		}
//		catch(Throwable e) {
//			System.out.println("Error " + e.getMessage());
//		}
//		try {
//			Domino domino2 = new DominoHighLowSetImpl_Skeleton(46);
//			System.out.println("Domino created: " + domino2.getHighPipCount() + " " + domino2.getLowPipCount());
//		}
//		catch(Throwable e) {
//			System.out.println("Error " + e.getMessage());
//		}
//		try {
//			Domino domino2 = new DominoHighLowSetImpl_Skeleton(-45);
//			System.out.println("Domino created: " + domino2.getHighPipCount() + " " + domino2.getLowPipCount());
//		}
//		catch(Throwable e) {
//			System.out.println("Error " + e.getMessage());
//		}
//		try {
//			Domino domino2 = new DominoHighLowSetImpl_Skeleton(0);
//			System.out.println("Domino created: " + domino2.getHighPipCount() + " " + domino2.getLowPipCount());
//		}
//		catch(Throwable e) {
//			System.out.println("Error " + e.getMessage());
//		}
//		try {
//			Domino domino2 = new DominoHighLowSetImpl_Skeleton(54);
//			System.out.println("Domino created: " + domino2.getHighPipCount() + " " + domino2.getLowPipCount());
//		}
//		catch(Throwable e) {
//			System.out.println("Error " + e.getMessage());
//		}
//		try {
//			Domino domino2 = new DominoHighLowSetImpl_Skeleton(55);
//			System.out.println("Domino created: " + domino2.getHighPipCount() + " " + domino2.getLowPipCount());
//		}
//		catch(Throwable e) {
//			System.out.println("Error " + e.getMessage());
//		}
//		try {
//			Domino domino2 = new DominoLowDifferenceStringImpl_Skeleton("45");
//			System.out.println("Domino created: " + domino2.getHighPipCount() + " " + domino2.getLowPipCount());
//		}
//		catch(Throwable e) {
//			System.out.println("Error " + e.getMessage());
//		}
//		try {
//			Domino domino2 = new DominoLowDifferenceStringImpl_Skeleton("46");
//			System.out.println("Domino created: " + domino2.getHighPipCount() + " " + domino2.getLowPipCount());
//		}
//		catch(Throwable e) {
//			System.out.println("Error " + e.getMessage());
//		}
//		try {
//			Domino domino2 = new DominoLowDifferenceStringImpl_Skeleton("-45");
//			System.out.println("Domino created: " + domino2.getHighPipCount() + " " + domino2.getLowPipCount());
//		}
//		catch(Throwable e) {
//			System.out.println("Error " + e.getMessage());
//		}
//		try {
//			Domino domino2 = new DominoLowDifferenceStringImpl_Skeleton("0");
//			System.out.println("Domino created: " + domino2.getHighPipCount() + " " + domino2.getLowPipCount());
//		}
//		catch(Throwable e) {
//			System.out.println("Error " + e.getMessage());
//		}
//		try {
//			Domino domino2 = new DominoLowDifferenceStringImpl_Skeleton("54");
//			System.out.println("Domino created: " + domino2.getHighPipCount() + " " + domino2.getLowPipCount());
//		}
//		catch(Throwable e) {
//			System.out.println("Error " + e.getMessage());
//		}
//		try {
//			Domino domino2 = new DominoLowDifferenceStringImpl_Skeleton("55");
//			System.out.println("Domino created: " + domino2.getHighPipCount() + " " + domino2.getLowPipCount());
//		}
//		catch(Throwable e) {
//			System.out.println("Error " + e.getMessage());
//		}
//}
//
//	
		try {
			Domino dominoSum = new DominoLowDifferenceStringImpl_Skeleton(new ArrayList<Integer>(){
			{
				add(6);
				add(10);
			}
		});
			} catch (Throwable e) {
			System.out.println("Error = " + e.getMessage());
		}
		try {
			Domino dominoSum = new DominoLowDifferenceStringImpl_Skeleton(new ArrayList<Integer>(){
			{
				add(5);
				add(10);
			}
		});
			} catch (Throwable e) {
			System.out.println("Error = " + e.getMessage());
		}
	try {
		Domino dominoSum = new DominoLowDifferenceStringImpl_Skeleton(new ArrayList<Integer>(){
		{
			add(6);
			add(6);
		}
	});
		} catch (Throwable e) {
		System.out.println("Error = " + e.getMessage());
	}

	try {
		Domino dominoSum = new DominoLowDifferenceStringImpl_Skeleton(new ArrayList<Integer>(){
		{
			add(0);
			add(0);
		}
	});
		} catch (Throwable e) {
		System.out.println("Error = " + e.getMessage());
	}
	try {
		Domino dominoSum = new DominoLowDifferenceStringImpl_Skeleton(new ArrayList<Integer>(){
		{
			add(9);
			add(0);
		}
	});
		} catch (Throwable e) {
		System.out.println("Error = " + e.getMessage());
	}
	try {
		Domino dominoSum = new DominoLowDifferenceStringImpl_Skeleton(new ArrayList<Integer>(){
		{
			add(-1);
			add(0);
		}
	});
		} catch (Throwable e) {
		System.out.println("Error = " + e.getMessage());
	}

}
}