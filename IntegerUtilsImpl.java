package utils;

import java.lang.reflect.Array;
import java.util.Scanner;

public class IntegerUtilsImpl implements IntegerUtils_Laursen {

	public static void main(String[] a){ 
		int k = 98;
		int m = 9;
		int n = 12;
		int[] intArray = {45, 41};

		isEven(k);
		isOdd(k);
		isPrime(k);
		greatestCommonFactor(m, n);
		isSorted(intArray);
		reverse(k);
    }
	
    Scanner console = new Scanner(System.in);
 
    //this only worked after i removed @Override, why
	public static boolean isEven(int k) {
		System.out.println("The results of the 'isEven' method: ");
		if (k % 2 == 0 && k != 0 && k > 0) {
			System.out.println("Middle of the road case");
			return true;
		}
		if (k == 0) {
			System.out.println("Corner case");
			return true;
		}
		if (k % 2 == 0 && k < 0) {
			System.out.println("Degenerate case");
		}
		System.out.println("The number entered was not even");
		return false;
	}

	public static boolean isOdd(int k) {
		System.out.println("The results of the 'isOdd' method: ");
		if (k % 2 != 0 && k != 1 && k > 0) {
			System.out.println("Middle of the road case");
			return true;
		}
		if (k == 1) {
			System.out.println("Corner case");
			return true;
		}
		if (k % 2 != 0 && k < 0) {
			System.out.println("Degenerate case");
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
				System.out.println("The number entered was not prime");
				return false;
			}
			if (k != 2 && k != 1) {
				System.out.println("Middle of the road");
				return true;
			}
		}
		if (k == 2) {
			System.out.println("Corner case");
			return true;
		}
		if (k == 1) {
			System.out.println("Degenerate case");
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
		//not sure how to code this
		//ex greatestConstrained multiple of (7, 50) = 49
		// greatest Constrained multiple of (2, 100) = 100
		//greatest constrained multiple of (3, 19) = 18
		if (m == 2 && n == 4) {
			System.out.println("Corner case");
		}
		if (m == 0 && n == 1) {
			System.out.println("Degenerate case");
		}
		return 0;

	}
	
	int getIntegerH() {
		//may be able to skip this
		return 0;
	}

	int getMaximum() {
		//Math.max(arg0, arg1)
		//corner case would be one integer in the array
		//example: ({2,4,6,8,10}) = 10
		//example: (1, 17, 22, 48, 19) = 48
		return 0;
	}
	
	int getMinimum() {
		//corner case would be one integer in the array
		int min = intArray[0];
		for (int i=0; i < intArray.length; i++) {
			if(intArray[i]<min) {
				min = intArray[i];
			}
		}
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
	
	public static int getSmallestIndexofMatch() {
		return 0;
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
	
	int sumthing() {
		//sumthing(7) -> 7
		//sumthing(14) -> 5
		//sumthing(29) -> 2
		return 0;
	}
}

