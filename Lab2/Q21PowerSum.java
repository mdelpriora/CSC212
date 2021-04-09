// Recursion sum and power

import java.util.Scanner;
public class Q21PowerSum {
	public static void main (String [] args) { 
	    Scanner in = new Scanner(System.in);
        System.out.print("Sum of first n ints. Enter n? ");		
		int n = in.nextInt();
		System.out.println("Sum of first " + n + " ints: " + mysum(n));
	
	 System.out.print("Enter an number (base)? ");  
		   float b = in.nextFloat();
		   System.out.print("Enter exponent? ");  
		   int n1 = in.nextInt();
		   System.out.println("Recursive: " + b + "^" + n + " = " + powerRec(b,n));
		   System.out.println("Iterative: " + b + "^" + n + " = " + powerIt(b,n));
	
	}//main
	 
	
	static int mysum (int n) { // recursion
		if ( n == 0 )	
			return 0;
		else 	
			return  n + mysum(n-1);
	}//mysum
		  
	static float powerRec ( float a, int n1 ) {
			if (n1 == 0)
				return 1;
			else
				return (a * powerRec (a, n1-1)) ;
		}//powerRec
	
	static float powerIt ( float a, int n1 ) {
			float res = 1;
			for (int i = 0 ; i < n1 ; i++) {
				res = res * a ;
			}
			return res;
		}//power
}
