/*
Remove the "throw new run time exception line from any method body and replace it with 
a correct method body.
Do not change one byte of any method signature in the interface
Make sure this is using java 1.8 or later
Document each method with a general description and at least three concrete examples,
one middle of the road, one corner case and one extreme case
Your interface must be in package named utils
Do not change any method signatures in the interface
Every class, interface and enum should be properly documented
Test middle of the road, corner cases, and extreme cases

*/

package utils;

import java.util.Set;

public interface IntegerUtils_Laursen {
	
	int k = 0;
	int m = 0;
	int n = 0;
	int maximum = 0;
	int h_q_3 = 0;
	int h_r_5 = 0;
	int[] intArray = new int[10];
	
	public static boolean isEven(int k) {
		return false;
	}
	
	public static boolean isOdd(int k) {
		return false;
	}
	
	public static boolean isPrime(int k)
	{
		throw new RuntimeException("Not implemented!");
	}
	
	public static int greatestCommonFactor(int m, int n)
	{
		throw new RuntimeException("Not implemented!");
	}
	
	public static int getGreatestConstraintedMultiple(int k, int maximum)
	{
		throw new RuntimeException("Not implemented!");
	}
	
	public static int getIntegerH(int h_q_3, int h_r_5)
	{
		throw new RuntimeException("Not implemented!");
	}
	
	public static int getMaximum(Set<Integer> integerSet)
	{
		throw new RuntimeException("Not implemented!");
	}
	
	public static int getMinimum(int[] intArray)
	{
		throw new RuntimeException("not implemented!");
	}
	
	public static boolean isSorted(int[] intArray)
	{
		throw new RuntimeException("not implemented!");
	}
	
	public static int getSmallestIndexofMatch(int[] intArray, int target)
	{
		throw new RuntimeException("not implemented!");
	}
	
	public static int reverse(int k)
	{
		throw new RuntimeException("not implemented!");
	}
	
	public static int sumthing(long k)
	{
		throw new RuntimeException("not implemented!");
	}



	

}
