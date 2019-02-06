package utils;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class IntegerUtilsImpl implements IntegerUtils_Laursen {

	public static void main(String[] a){ 
		int k = 98;
		int l = 0;
		int p = -2;
		int q = 1;
		int r = -1;
		int s = 5;
		int t = 2;
		int m = 9;
		int n = 12;
		int o = 4;
		int[] intArray = {39, 41, 41};
		int target = 41;
		int b = 7;
		int c = 50;
		int firstnum = 9;
		int secondnum = 4;
		Integer arr[] = {2,4,6,8,10};
		Set<Integer> set = new HashSet<>(Arrays.asList(arr));
		
		
//		isEven(k);
//		isEven(l);
//		isEven(p);
//		isOdd(s);
//		isOdd(q);
//		isOdd(r);
//		isPrime(s);
//		isPrime(t);
//		isPrime(q);
//		greatestCommonFactor(m, n);
//		getGreatestConstrainedMultiple(b, c);
//		isSorted(intArray);
//		reverse(k);
//		getMinimum(intArray);
//		getSmallestIndexofMatch(intArray, target); 
//		getIntegerH(firstnum, secondnum);
		getMaximum(set);
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
        while (m == 0) {
            m = 0;
        }
        if (n > m) {
            gcd = n % m;
            System.out.println("gcd is: " + gcd);
            System.out.println("Middle of the road");
        }
        if (m > n) {
        	gcd = m % n;
        	System.out.println("gcd is: " + gcd);
        	System.out.println("Middle of the road");
        }
        //not reaching this code
        if ((m == -1 && n == 1) || (m == 1 && n == -1)) {
        	System.out.println("Corner case");
        }
        
        if (m == 0 && n == 0) {
        	System.out.println("Degenerate case");
        }
        return gcd;
	}
	
	public static int getGreatestConstrainedMultiple(int n, int m) {
		System.out.println("The result of the greatest constrainted multiple method: ");
		//not sure how to code this
		//ex greatestConstrained multiple of (7, 50) = 49
		// greatest Constrained multiple of (2, 100) = 100
		//greatest constrained multiple of (3, 19) = 18
		int counter = 0;
		for(int i = 0; i < m; i++) {
			if ((n * i) < m) {
				//store n * i in a temp variable
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
	
	public static int getIntegerH(int x, int y) {
		int n = x * 4;  //36
		int m = x * 3; //27
		for(int i = m; i < n; i++) {
				if(i % 5 == y && i / 3 == x) {
					System.out.println(i);
				}		
		}
		//integer H example: (9, 4) = 29
		//(20, 1) = 61
		//(0,0) = 0
		//the first digit is the number that 29 can be divided int
		//Math.max(arg0, arg1)
		//corner case would be one integer in the array
		//example: ({2,4,6,8,10}) = 10
		//example: (1, 17, 22, 48, 19) = 48
		return 0;
	}
	
	public static int getMaximum(Set<Integer> set) {
		//System.out.println(set);
		System.out.println("Item " + Collections.max(set) + " in the set, middle of the road case");
		for(int i = 0; i < set.size(); i++) {
			System.out.println();
		}
		return 0;
		
	}
	
	public static int getMinimum(int []array) {
		System.out.println("Results of the 'getMinimum' method: ");
		//corner case would be one integer in the array
		int min = array[0];
		if(array.length == 1) {
			System.out.println("Corner Case");
			return min;
		}
		for (int i=0; i < array.length; i++) {
			if(array[i] < min) {
				min = array[i];
				System.out.println(min);
			}
		}
		System.out.println("Middle of the road");
		System.out.println(min);
		return min;
	}
	
	public static int isSorted(int []array) {
		System.out.println("Results of the 'isSorted' method: ");
		//corner case would be one integer in the array
		//https://study.com/academy/lesson/how-to-sort-an-array-in-java.html
		int temp;
		for (int i = 1; i < array.length; i++) {
			for (int j = i; j > 0; j--) {
				if (array[j] < array [j - 1]) {
					temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
				}
			}
		}
		if (Array.getLength(array) == 1) {
			System.out.println("Corner Case");
		}
		for (int i = 0; i < Array.getLength(array); i++) {
			System.out.println(array[i]);
		}
		return 0;
	} 
	
	public static int getSmallestIndexofMatch(int[] intArray, int target) {
		System.out.println("Results of the 'getSmallestIndexOfMatch' method: ");
		// get smallest index that matches a number
		//ex) [2, 4, 6, 8, 10], 6 -> 2
		//ex) [2, 2, 2, 2, 2], 2 -> 0
 		
		if(intArray.length == 1) { //and number is in that array
			System.out.println("Corner Case, min is index[0]");
			return target;
		}
		for (int i=0; i < intArray.length; i++) {
			if(intArray[i] == target) {
				System.out.println("Middle of the road case");
				System.out.println("The number " + intArray[i] + " is in index " + i);
				break;
			}
		}
		return target;
	}
	
	public static int reverse(int k) {
		System.out.println("Results of the reverse method: ");
		int reversedNum = 0;
	      //System.out.println("Enter an integer to reverse");
	      //Scanner in = new Scanner(System.in);
	      //k = in.nextInt();
	      if(k != 0)
	      {
	    	  if (k == 10) {
	  			System.out.println("Corner case");
	  			return k;
	  		}
	    	  if (k > 0 && k < 10) {
	    		  System.out.println("Degenerate case");
	    		  return k;
	    	  }
	    	  else {
	    		  //this code is wrong, needs to be redone
	    		    for (int i = k; i !=0; i /= 10) {
	    		    	reversedNum = reversedNum * 10 + i % 10;
	    		    }
	          System.out.println(reversedNum);
	  		  return reversedNum;
	    	  }
	      }
		return reversedNum;
	}
	
	int sumthing(long k) {
		//takes the sum of all the digits in the integer
		//takes the sum of those digits
		//ex) 29 = 2 + 9 = 11 = 1 + 1 = 2
		//sumthing(7) -> 7
		//sumthing(14) -> 5
		//sumthing(29) -> 2
		int m = 0;
		
		while(k > 0) {
			//do something
		}
		return 0;
	}
}

