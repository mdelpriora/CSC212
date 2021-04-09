/*
 * Display characters that repeat in a word, but display them only once
 */
import java.util.Scanner;
public class Q13repeat {
	public static void main (String [] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a word");
		String word = in.nextLine();
		repeat(word);	
	}
	static void repeat(String word) {
		String repeat = "";
		for (int i = 0; i < word.length(); i++) {
			if (word.substring(i+1).indexOf(word.charAt(i)) != 1) {
				if (repeat.indexOf(word.charAt(i)) == -1) {
					repeat += word.charAt(i);
				}
			}
		}
		System.out.println("Your new word is " + repeat);
	}
}
