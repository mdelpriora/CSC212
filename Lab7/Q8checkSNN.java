/*
 * A String S represents a SSN and should have this format: DDDDDDDDD that is 9 digits.
 * Write a function that checks if a string is a correct SSN.
 */

import java.util.*;
public class Q8checkSNN {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your social security number");
		String s = in.nextLine();
		
		ssn(s);
		
	}//main
	
	static void ssn(String s) {
		if (s.length() == 9) {
			System.out.println("You have entered a social security number");
		}//if
		else {
			System.out.println("You have not entered a social security number");
		}//else
	}//ssn
}//class
