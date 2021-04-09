//Display table for logarithm in base 10.

import java.util.*; 
public class Q1Logtable {
	public static void main (String [] args) { 
		Scanner in = new Scanner(System.in); 
		System.out.print("Logarithm in base 10. Enter limit? ");
		int limit = in.nextInt(); //check input
		for (int i = 0 ; i <= limit ; i++ ) {
			System.out.print("log10(" + i + ")=" + (float)Math.log10(i) +"\t");
            if ( (i + 1 )% 5  == 0) System.out.println(); // write on 5 columns
		}//for
		System.out.println("Logarithm in base 2");
		for (int i = 0 ; i <= limit ; i++ ) {
			System.out.print("\tlog2(" + i + ")=" + mylog2(i));
            if ( (i + 1 )% 5  == 0) System.out.println(); // write on 5 columns
		}
	}
	static float mylog2(int n){//change base from 10 to 2
		return (float)( Math.log10(n)/Math.log10(2) );
	}
}
