/*
 * Given two words display and count the letters that are in the same in the same position. 
 * Ask you want to continue. 
 */

import java.util.Scanner;
public class Q9samechar {
	public static void main (String [] args) {
		Scanner in=new Scanner(System.in);
		char op;
		do {
			position();
			System.out.println("Would you like to play again? y/n");
			op = in.next().charAt(0);
		}while (op == 'y' || op == 'Y');
		
		System.out.println("Bye");
	}//main
	static void position() {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter 2 words");
		String word1 = in.nextLine();
		String word2 = in.nextLine();
		int length1= word1.length();
		int length2= word2.length();
		int count = 0;
		int count1 = 0;
		if (length1 <= length2) {
			for (int i = 0; i < word1.length(); i++) {
				char char1 =word1.charAt(i);
				char char2 =word2.charAt(i);
				if (char1 == char2) {
					count++;
				}
			}
		System.out.println("There are " + count + " common letters in the same place");

		}//if
		else {
			for (int i = 0; i < word2.length(); i++) {
				char char1 =word1.charAt(i);
				char char2 =word2.charAt(i);
				if (char1 == char2) {
					count1++;
				}
			}//for
			System.out.println("There are " + count1 + " common letters in the same place");
		}//else
	}//position
}//class
