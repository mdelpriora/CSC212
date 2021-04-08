//Write a program to display all powers of 2 till n ( ask for n)

import java.util.*;
public class Q10 {
	public static void main (String [] args) { 
		Scanner in = new Scanner(System.in); 
		System.out.println("Enter limit for powers of 3");
		int limit = in.nextInt();
		for (int i = 0 ; i <= limit ; i++ ) {
			System.out.print("\t3^" + i + " = " + Math.pow(3,i));
            if ( i % 7  == 0) System.out.println();
		
           
		}
	}
}

