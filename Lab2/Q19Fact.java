//Factorial. Iterative and recursive

import java.util.*;
public class Q19Fact {
	public static void main (String [] args) { 
		Scanner in = new Scanner(System.in); 
		System.out.print("n! How many factorials? ");
		int many = in.nextInt();
	    for(int i=0 ; i < many ; i++) {
	       System.out.println(i + "! =  "  + fact(i));
	    }//for
	}//main
	static int fact( int n ) {
			int res = 1; //result
			for ( int i = 1; i <= n; i++ ) {
				res = res * i;  // same as   result  *= i;
			}
			return res;
		}//fact
	static int factRec (int n) {
		if (n == 1)
			return 1;
		else
			return (n * factRec(n-1)) ;
	}//factRec

}