/*
 * Ask for word. Produce a word with first letter changed (swap) with last.
 */
import java.util.Scanner;
public class Q5swap {
	public static void main (String [] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a word");
		String word = in.nextLine();
		
		int length = word.length();
		char zero = word.charAt(0);
		String end = word.substring(1,length);
		
		System.out.println(end + zero);
	}
}
