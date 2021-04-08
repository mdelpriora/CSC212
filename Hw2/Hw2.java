//Game guessing a number
import java.util.*;

public class Hw2 {
	public static void main (String [] arg) {
		Scanner in=new Scanner(System.in);	

		System.out.println("Pick a section:");
		System.out.println("1.Authors" + " 2.Rules" + " 3.Play");
		int op=in.nextInt();
				
		switch (op) {
		case 1:System.out.println("This game was brought to you by Mia Delpriora.");
		break;
		case 2:System.out.println("You will think of a number between 0 and 10 then the computer will guess");
		break;
		case 3: game ();
		break;	
		default:System.out.println("Bad input");
			
		}

	}
	static int roll() { //1,2,3,4,5,6
        return (int) (Math.random() * 10) +1;
	}
	static void game() {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Think of n integer and press enter when ready");
		in.nextLine();
		int d = roll();
		System.out.println(d);
		System.out.println("Enter 1 if the number was correct and 2 if incorrect");
		int response= in.nextInt();
		
		if (response != 1 && response != 2) { 
			System.out.println("You did not enter a valid response, start over");
		}
			
		else { 
			if (response == 1) {
				System.out.println("The computer has quessed your number");
			}//if
			else {
				while (response == 2) {
					d=(int) (Math.random()*10);
					System.out.println("The computer guessed: " + d);
					System.out.println("Enter 1 if the number was correct and 2 if incorrect");
					response= in.nextInt();
						if (response == 1) {
							System.out.println("The computer has quessed your number");
						}//if
			}//while
				if (response != 2) { 
					System.out.println("You did not enter a valid response, start over");
				}//if
			}//else
		}//else
	}
}

		



	