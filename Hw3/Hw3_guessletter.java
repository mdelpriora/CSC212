/*Computer knows a secret letter you have to guess it. 
 * It is up to you to design to game! Keep it simple. 
 * Make a menu (help, author, game). The program ask if you want to run the program once more: Again(y/n)?
 */

import java.util.*;
public class Hw3_guessletter {
	public static void main (String [] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Pick a section:");
		System.out.println("1.Authors" + " 2.Rules" + " 3.Play");
		int op = in.nextInt();
		
		
		switch (op) {
		case 1:System.out.println("This game was brought to you by Mia Delpriora.");
		break;
		case 2:System.out.println("The computer will generate a random letter. You will enter your guess.");
		break;
		case 3: game ();
		break;	
		default:System.out.println("Bad input");
			
		System.out.println("Guess the letter");
		}
	}
	

	
	static void cont() {
		Scanner in = new Scanner(System.in);
		System.out.println("would you like to try again? (y/n)");
		char cont = in.next().charAt(0);
		if (cont == 'y' || cont == 'Y'){
			game();
		}
		if (cont != 'y' && cont != 'Y');{
			System.out.println("Goodbye");
		}
	}
	static char guess() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your guess as a lowercase letter");
		char guess = in.next().charAt(0);
		return guess;
	}
	
	static void game() {
		char letter = 'p';
		Scanner in = new Scanner(System.in);
		char g = guess();
		
		if (g == letter) {
			System.out.println("You guesed the correct letter");
		}
		else if ((int)g < 97 || (int) g >122) {
				System.out.println("You did not input a lowercase letter");
		}
			else {//((int)g >= 97 && (int) g <= 122)
				System.out.println("You did not guess the letter");
				cont();
			}	

		//else { 
			//System.out.println("Goodbye");
	}
}
		


	
