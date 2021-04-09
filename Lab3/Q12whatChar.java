/*Enter a char and check if it a letter or a digit or an mathematical operation (+,-,/,*,%) or "no idea!".
 *Program should loop until you answer 'n' to "More(y/n)?"
 */

import java.util.*;
public class Q12whatChar {
	public static void main (String [] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a character");
		char ch = in.next().charAt(0);
		
		if (Character.isLetter(ch)){
			System.out.println(ch + " is a letter.");
		}
		else if (Character.isDigit(ch)){
			System.out.println(ch + " is a digit.");
		}
		else if (ch == '+' ||ch == '-' || ch == '*' || ch == '/'|| ch == '%' ){
			System.out.println(ch + " is a mathematical operation.");
		
		}
		else 
			System.out.println("Classification of " + ch + " is unknown.");
	}

}
