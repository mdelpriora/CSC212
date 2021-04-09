/*Given a letter display its position in the alphabet
 * (A has position 1)
 */

import java.util.*;
public class Q11position {
	public static void main (String [] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a letter");
		char ch = in.next().charAt(0);
		int upper = ((int)ch) - 64;
		int lower = ((int)ch) - 96;
		
		if ((int) ch >= 65 && (int)ch <= 90) {
			System.out.println(ch + " has position " + upper + " in the alphabet.");
		}
		else {
			if ((int) ch >= 97 && (int)ch <= 122) {
			System.out.println(ch + " has position " + lower + " in the alphabet.");
			}
			else {
				System.out.println("You did not enter a letter.");
			}
		}
		
	}
}
