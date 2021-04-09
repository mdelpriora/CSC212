/*
 * Ask for your name.
 * Write it in reverse.
 */

import java.util.Scanner;
public class Q3reverse {
	public static void main (String [] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter your name");
		String name = in.nextLine();
		System.out.println("Your name backwards is:");
		for (int i = name.length()-1; i >= 0; i--) {
			System.out.print(name.charAt(i));
		}
		
		
	}
}
