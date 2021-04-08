//Display all the integers till n together with their square roots.

import java.util.*;
public class Q8 {
	public static void main (String [] args) { 
				Scanner in = new Scanner(System.in); 
			    System.out.print("Limit of SQRT table?");
				int n = in.nextInt();
				for (int i = 0 ; i <= n ; i++) {
					System.out.println("sqrt(" + i + ")= " + Math.sqrt(i));
					if ( (n + 1) % 5 == 0) System.out.println();
		}
	}
}
