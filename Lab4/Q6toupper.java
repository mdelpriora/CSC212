/*
 * Given a word write it in capital letters and in lower case letters
 */
import java.util.Scanner;
public class Q6toupper {
	public static void main (String [] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("Enter an word");
	String word = in.nextLine();
	
	System.out.println("Word in uppercase: " + word.toUpperCase());
	System.out.println("Word in lowercase: " + word.toLowerCase());
	}
}
