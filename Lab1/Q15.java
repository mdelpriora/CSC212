//Given 2 sides of a right triangle find the hypotenuse (Pythagoras)

import java.util.*;
public class Q15 {
	public static void main (String [] args) { 
		Scanner in = new Scanner(System.in); 
		double a, b, c;
		System.out.println("Enter 2 sides of a right triangle? ");
		b = in.nextDouble(); 
		c = in.nextDouble();
		a = Math.sqrt(Math.pow(b,2) + Math.pow(c,2));
		System.out.println( "hypotenuse: " + a) ;
	}
}
