//Ask for an integer n. Find 2^n. Hint: use Math.pow(2,n)

import java.util.*;
public class Q9 {
	public static void main (String [] args) { 
		Scanner in = new Scanner(System.in); 
		System.out.println("Enter number");
		int n = in.nextInt();
		System.out.print("\t2^" + n + " = " + Math.pow(2,n));
			
		}
			
	}
	

