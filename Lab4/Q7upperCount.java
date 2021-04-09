/*
 * Count the number of uppercase and lowercase letters in a word
 * Ask for a word. 
 * Ask a couple of times ("Continue(y/n)?" use a do loop)
 */
import java.util.Scanner;
public class Q7upperCount {
	public static void main (String [] args) {
		Scanner in=new Scanner(System.in);
		String word ;
		char op;
		char ch=1;
		int count=0;
		int count1=0;
		
		do {
			
			uplow();
			System.out.println("Would you like to play again? y/n");
			op = in.next().charAt(0);
		}while (op == 'y' || op == 'Y');
		
		System.out.println("Bye");
		
	}//main
	static void uplow() {
		Scanner in=new Scanner(System.in);
		String word ;
		char op;
		char ch=1;
		int count=0;
		int count1=0;
		
		System.out.println("Enter an word");		
		word = in.nextLine();
		for (int i = 0; i<word.length(); i++) {		
			ch = word.charAt(i);
			if (Character.isUpperCase(ch)) {
				count++;
			}//if
			else {
				count1++;
			}//else
		}//for
		System.out.println("There were " + count + " uppercase letters");
		System.out.println("There were " + count1 + " lowercase letters");
	
		}
	}
		
