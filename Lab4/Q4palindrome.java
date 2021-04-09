/*
 * Ask for a word and check if palindrome.
 * af
 */

import java.util.Scanner;
public class Q4palindrome {
	public static void main (String [] args) {
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter a word");
		String word = in.nextLine();
		ispalin(word);
		
	}//main
	static void ispalin(String word) {
		int length = word.length();
		String reverse = "";
		for (int i = length - 1 ; i>=0; i--) {
			reverse = reverse + word.charAt(i);
			
		}
		if (reverse.equalsIgnoreCase(word)) {
			System.out.println(word + " is a palindrome");
		}
		else {
			System.out.println(word + " is not a palindrome");
		}
	}
			
	
}//class
