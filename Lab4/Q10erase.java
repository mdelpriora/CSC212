/*
 * Write a program that takes a string and a character and erases all occurrences of the character in the string.
 * If not found, return the string. 
 */
import java.util.Scanner;
public class Q10erase {
	public static void main (String [] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a word and the character you want to erase");
		String word = in.nextLine();
		String ch = in.nextLine();
		
	
		if(word.indexOf(ch) != -1) {
				String newword =  word.replace(ch, "");
				System.out.println(newword);
		}
		else {
			System.out.println(ch + " was not found in " + word);		
		}
		
	}
		
}

