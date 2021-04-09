/*
 * Given a word (noun) in English, find its plural (add s)
 * also solve the 'fox' case, that is nouns ending in x. 
 * It is up to you if you wish to treat exceptions or not.
 */
import java.util.Scanner;
public class Q12plural {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a normal (not exception) noun");
		String noun = in.nextLine();
		int length = noun.length()-1;
		char lastch = noun.charAt(length);
		if (lastch =='x' || lastch == 'o' || lastch == 'h'){
			System.out.println(noun + " plural is " + noun + "es");
		}	
			else {
				
			System.out.println(noun + " plural is " + noun + "s");
		}
		
	}
}
