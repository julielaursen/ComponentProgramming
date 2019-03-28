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


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public interface IntegerUtils_Laursen {
	

	public static void main(String[] a){ 
		
		int[] intArray = {39, 41, 41, 45};
		int[] intArray2 = {41};
		int[] intArray3 = {2, 2, 2, 2};
		int target = 41;
		Integer arr[] = {2,4,6,8,10};
		Set<Integer> set = new HashSet<>(Arrays.asList(arr));
		Integer arr2[] = {2};
		Set<Integer> set2 = new HashSet<>(Arrays.asList(arr2));
		Integer arr3[] = {2,2,2};
		Set<Integer> set3 = new HashSet<>(Arrays.asList(arr3));
		
		isEven(98);
		isEven(0);
		isEven(-2);
		isOdd(5);
		isOdd(1);
		isOdd(-1);
		isPrime(5);
		isPrime(2);
		isPrime(1);
		isPrime(0);
		greatestCommonFactor(9, 12);
		greatestCommonFactor(1, -1);
		greatestCommonFactor(3, 3);
		greatestCommonFactor(0, 0);
		getGreatestConstrainedMultiple(7, 50);
		getGreatestConstrainedMultiple(50, 50);
		getGreatestConstrainedMultiple(2, 4);
		getGreatestConstrainedMultiple(0, 1);
		getGreatestConstrainedMultiple(0, 0);
		isSorted(intArray);
		isSorted(intArray2);
		reverse(98);
		reverse(5);
		reverse(10);
		reverse(1234);
		getMinimum(intArray);
		getMinimum(intArray2);
		getMinimum(intArray3);
		getMaximum(set);
		getMaximum(set2);
		getMaximum(set3);
		getSmallestIndexofMatch(intArray, target); 
		getSmallestIndexofMatch(intArray2, target);
		getIntegerH(9, 4);
		getIntegerH(20, 1);
		getIntegerH(9, 9);
		getIntegerH(9, 1);
		getIntegerH(0, 0);
		getSumthing(291);
		getSumthing(12);
		getSumthing(8);
		getSumthing(0);
    }
	
    Scanner console = new Scanner(System.in);
 
	public static boolean isEven(int k) {
		System.out.println("The results of the 'isEven' method: ");
		if (k % 2 == 0 && k != 0 && k > 0) {
			System.out.println("Number " + k + " = Middle of the road case");
			return true;
		}
		if (k == 0) {
			System.out.println("Number " + k + " = Corner case");
			return true;
		}
		if (k % 2 == 0 && k < 0) {
			System.out.println("Number " + k + " = Degenerate case");
			return true;
		} else {
			System.out.println("The number entered was not even");
		}
		return false;
	}

	public static boolean isOdd(int k) {
		System.out.println("The results of the 'isOdd' method: ");
		if (k % 2 != 0 && k != 1 && k > 0) {
			System.out.println("Number " + k + " = Middle of the road case");
			return true;
		}
		if (k == 1) {
			System.out.println("Number " + k + " = Corner case");
			return true;
		}
		if (k % 2 != 0 && k < 0) {
			System.out.println("Number " + k + " = Degenerate case");
			return true;
		} else {
			System.out.println("The number entered was not odd");
		}
		return false;
	}

	public static boolean isPrime(int k) {
		System.out.println("The results of the 'isPrime' method: ");
		for (int i = 2; i < k; i++) {
			if (k % i == 0) {
				System.out.println("Number " + k + " = The number entered was not prime");
				return false;
			}
			if (k != 2 && k != 1) {
				System.out.println("Number " + k + " = Middle of the road");
				return true;
			}
		}
		if (k == 2) {
			System.out.println("Number " + k + " = Corner case");
			return true;
		}
		if (k == 1) {
			System.out.println("Number " + k + " = Degenerate case");
			return true;
		}
		if (k == 0) {
			System.out.println("The number entered was not prime");
			return false;
		}
		return false;
	}
	
	public static int greatestCommonFactor(int n, int m) {
		System.out.println("Results of the 'greatestCommonFactor' method: ");
        int gcd = 0;
        
        if ((m == -1 && n == 1) || (m == 1 && n == -1)) {
        	gcd = 1;
        	System.out.println("Number " + gcd + " Corner case");
        }
        else if (m == 0 && n == 0) {
        	System.out.println("Number " + gcd + " Degenerate case");
        }
        else if (n > m) {
            gcd = n % m;
            System.out.println("Number " + gcd + " Middle of the road");
        }
        else if (m > n) {
        	gcd = m % n;
            System.out.println("Number " + gcd + " Middle of the road");
        }       
        else if(m == n) {
        	gcd = m;
        	System.out.println("Number " + gcd + " Middle of the road");
        }
        return gcd;
	}
	
	public static int getGreatestConstrainedMultiple(int n, int m) {
		System.out.println("The result of the greatest constrainted multiple method: ");
		int counter = 0;
		for(int i = 0; i <= m; i++) {
			if ((n * i) <= m) {
				counter = n * i;
			}
		}
		System.out.println("Middle of the road case: " + counter);
		if (m == 2 && n == 4) {
			System.out.println("Corner case");
		}
		if (m == 0 && n == 1) {
			System.out.println("Degenerate case");
		}
		return 0;

	}
	
	public static int isSorted(int []array) {
		System.out.println("Results of the 'isSorted' method: ");
		int temp;
		if (Array.getLength(array) == 1) {
			System.out.println("Array of length one, Corner Case");
		}
		else {
		for (int i = 1; i < array.length; i++) {
			for (int j = i; j > 0; j--) {
				if (array[j] < array [j - 1]) {
					temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
				}
			}
		}
			System.out.println("Middle of the road case");
		}
		
		return 0;
	} 
	

	public static int reverse(int k) {
		System.out.println("Results of the reverse method: ");
		int reversedNum = 0;
		if (k != 0) {
			if (k == 10) {
				reversedNum = reversedNum * 10 + 10 % 10;
				System.out.println("Number " + k + " Corner case");
				return k;
			}
			if (k > 0 && k < 10) {
				System.out.println("One digit. Degenerate case");
				return k;
			} else {
				for (int i = k; i != 0; i /= 10) {
					reversedNum = reversedNum * 10 + i % 10;
				}
				System.out.println(reversedNum);
				return reversedNum;
			}
		}

		return reversedNum;
	}
	
	
	public static int getMinimum(int []array) {
		System.out.println("Results of the 'getMinimum' method: ");
		int min = array[0];
		if(array.length == 1) {
			System.out.println("One index array, Corner Case");
			return min;
		}
		for (int i=0; i < array.length; i++) {
			if(array[i] < min) {
				min = array[i];
				System.out.println(min);
			}
		}
		System.out.println("Number " + min + " = Middle of the road");
		return min;
	}
	
	public static int getIntegerH(int x, int y) {
		System.out.println("The result of the getIntegerH method:");
		boolean flag = true;

		int n = x * 4;  //36
		int m = x * 3; //27
		if (x == y) {
			flag = true;
		}
			for (int i = m; i < n; i++) {
				if(i % 5 == y && i / 3 == x) {
					System.out.println(i);
					flag = false;
				}
			}
			if (flag == true) {
				System.out.println("No such number");
		}
		
		return 0;
	}
	
	public static int getMaximum(Set<Integer> set) {
		System.out.println("Results of the 'getMaximum' method: ");
		int x = 0;
		if(set.size() == 1) {
			System.out.println("Corner case");
		}
		for(int i = 0; i < set.size(); i++) {
			x = Collections.max(set);
		}
		System.out.println("Item " + x + " in the set, middle of the road case");
		return 0;
	}
	
	public static int getSmallestIndexofMatch(int[] intArray, int target) {
		System.out.println("Results of the 'getSmallestIndexOfMatch' method: ");
	
		if(intArray.length == 1) { 
			System.out.println("Corner Case, length of one");
			return target;
		}
		for (int i=0; i < intArray.length; i++) {
			if(intArray[i] == target) {
				System.out.println("Middle of the road case. The number " + intArray[i] + " is in index " + i);
				break;
			}
		}
		return target;
	}
	
	public static long getSumthing(long kk) {
		System.out.println("Result of the getSumthing method:" );
		if(kk < 10) {
        	System.out.println("Number " + kk + " Corner Case");
        } 
		if(kk > 10) {
		while (kk > 9) {
            long sum = 0;
        	sum = sum + kk % 10; //9
            kk = kk / 10; //2
            kk = sum + kk;
        }
		 
        System.out.println("Middle of the road case: " + kk);
      	}
		return kk;
	}
}


	


