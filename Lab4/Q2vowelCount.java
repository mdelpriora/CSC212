/*
 * Ask for a word and count its vowels.
 */

import java.util.Scanner;
public class Q2vowelCount {
	public static void main (String [] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a word");
		String word = in.nextLine();
		String lower = word.toLowerCase();
		int count = 0;
		char ch;
		for (int i=0; i < word.length(); i++) {
			ch =lower.charAt(i);
			if (ch == 'a' || ch == 'e'|| ch == 'i'|| ch == 'o'|| ch == 'u') {
				count++;
			}
		}
		System.out.println("There are " + count + " vowels in " + word);
		
	}
}
