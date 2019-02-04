package utils;

import java.util.Scanner;

public class IntegerUtilsImpl implements IntegerUtils_Laursen {

	public static void main(String[] a){ 
		int k = 5;
		int m = 9;
		int n = 12;
		isEven(k);
		isOdd(k);
		isPrime(k);
		greatestCommonFactor(m, n);
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
        while (n > m) {
            gcd = m % n;
            System.out.println("gcd is: " + gcd);
            System.out.println("Middle of the road");
        }
        if ((m == -1 && n == 1) || (m == 1 && n == -1)) {
        	System.out.println("Corner case");
        }
        
        if (m == 0 && n == 0) {
        	System.out.println("Degenerate case");
        }
        return gcd;
	}
	
	int getGreatestConstraintedMultiple() {
		//not sure how to code this
		
		if (m == 2 && n == 4) {
			System.out.println("Corner case");
		}
		if (m == 0 && n == 1) {
			System.out.println("Degenerate case");
		}
		return 0;

	}
	
	int getIntegerH() {
		return 0;
	}

	int getMaximum() {
		//Math.max(arg0, arg1)
		//corner case would be one integer in the array
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
	
	int isSorted() {
		//corner case would be one integer in the array
		return 0;
	}
	
	int getSmallestIndexofMatch() {
		return 0;
	}
	
	int reverse() {
		int n, reverse = 0;
        
	      System.out.println("Enter an integer to reverse");
	      Scanner in = new Scanner(System.in);
	      n = in.nextInt();
	         
	      while(n != 0)
	      {
	    	  if (n == 10) {
	  			System.out.println("Corner case");
	  		}
	    	  if (n > 0 && n < 10) {
	    		  System.out.println("Degenerate case");
	    	  }
	          reverse = reverse * 10;
	          reverse = reverse + n%10;
	          n = n/10;
	  		  return n;
	      }
		return n;
	}
	
	int sumthing() {
		return 0;
	}
}

