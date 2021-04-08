/*Build an Oracle (see Delphi- Greece).
 * Imagine at least 5 possible answers. 
 * You ask any question (in your mind) and randomly it chooses some answers. 
 * Use a switch().
 * Based on magic 8 ball 
*/

import java.util.*;
public class Hw3_oracle {
	public static void main (String [] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Think of a yes or no queston then press enter when ready for an answer");
		in.nextLine();
		int op = (int) (Math.random()*18);
				
		switch (op) {
		case 1: 
			System.out.println("It is certain.");
			break;
		case 2: 
			System.out.println("It is decidedly so.");
			break;
		case 3: 
			System.out.println("Without a doubt.");
			break;
		case 4: 
			System.out.println(" Yes – definitely.");
			break;	
		case 5: 
			System.out.println("You may rely on it.");
			break;
		case 6: 
			System.out.println("As I see it, yes.");
			break;
		case 7: 
			System.out.println("Most likely.");
			break;
		case 8: 
			System.out.println("Outlook is good.");
			break;
		case 9: 
			System.out.println("Yes.");
			break;
		case 10:
			System.out.println("Signs point to yes.");
			break;	
		case 11: 
			System.out.println("Cannot predict now.");
			break;
		case 12: 
			System.out.println("Ask again later.");
			break;
		case 13:
			System.out.println("Better not tell you now.");
			break;
		case 14: 
			System.out.println("Don't count on it.");
			break;	
		case 15: 
			System.out.println("My reply is no.");
			break;
		case 16: 
			System.out.println("My sources say no.");
			break;
		case 17:
			System.out.println("Outlook not so good.");
			break;
		case 18: 
			System.out.println("Very doubtful");
			break;
		
		}
	}
}
