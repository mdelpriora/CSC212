//Ask for 2 floating numbers and perform math operations: +, -, *, /

import java.util.Scanner;
public class Q6 {
	public static void main(String[] args) {
	
	Scanner in = new Scanner(System.in); 
	System.out.print("Basic operations. Enter two numbers? ");
	float n1 = in.nextFloat();
	float n2 = in.nextFloat();
	System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
	System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
	System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
	System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
	
	
	
	
	
	
	
	}
	
}
