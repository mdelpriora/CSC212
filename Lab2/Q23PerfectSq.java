//Ask for an integer and display if it is or not a perfect square

import java.util.*;
public class Q23PerfectSq {
	public static void main (String [] args) { 
		Scanner in = new Scanner(System.in); 
		System.out.println("Enter an integer");
		int n=in.nextInt();
		int sq=(int)Math.sqrt(n);
		if (sq*sq==n) {
			System.out.println(n + " is a perfect square");
		}
		else {
			System.out.println(n + " is not a perfect square");
		}
	}
}
