
import java.util.*;
public class Hw4guessWord_mdelpriora {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Pick a section:");
		System.out.println("1.Authors" + " 2.Rules" + " 3.Play");
		int op = in.nextInt();
		switch (op) {
		case 1:System.out.println("This game was brought to you by Mia Delpriora.");
		break;
		case 2:System.out.println("The computer has a secret word that you have to guess. You will enter your guess and the computer will tell you if it was correct.");
		break;
		case 3: game ();
		break;	
		default:System.out.println("Bad input");
			
		System.out.println("Guess the word");
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
		static String guess() {
			Scanner in = new Scanner(System.in);
			System.out.println("Guess the word");
			String guess = in.nextLine().toLowerCase();
			return guess;
		}
		
		static void game() {
			String word = "hello";
			Scanner in = new Scanner(System.in);
			String g = guess();
			
			if (g.equals(word)) {
				System.out.println("You guessed the correct word");
			}
				else {
					System.out.println("You did not guess the word");
					cont();
				}	
		}
}
