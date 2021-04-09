// Given a letter display the previous letter and the letter after in the alphabet:

import java.util.*;
public class Q10before {
	public static void main (String [] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a lowercase letter");
		char ch = in.next().charAt(0);
		char previous;
		char future;
		int ascii;
		
		ascii = (int)ch;
		previous = (char) (ascii -1); 
		future = (char) (ascii +1);
		
		if (ascii>97 && ascii <122) {
		System.out.println("You entered " + ch);
		System.out.println("The letter before is " + previous);
		System.out.println("The letter after is " + future);
		}
		else
			if (ascii==97) {	
				System.out.println("You entered " + ch);
				System.out.println("There is no letter before");
				System.out.println("The letter after is " + future);
			}
			if (ascii == 122) {	
				System.out.println("You entered " + ch);
				System.out.println("The letter after is " + previous);
				System.out.println("There is no letter after");
			}
		
			
		}
		
	}

