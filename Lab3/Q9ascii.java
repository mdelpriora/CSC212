// Ask for a character and display its ASCII code.
//Ask for Continue(y/n)?

import java.util.*;
public class Q9ascii {
	public static void main (String [] args) {
		Scanner in=new Scanner(System.in);
		char control = 'Y';
		
		do {
		System.out.println("Enter a letter");
		System.out.println(ascii(in.nextLine().charAt(0)));
		System.out.println("Continue? Y/N");
		control = in.nextLine().charAt(0);
		}
		while (Character.toLowerCase(control) != 'n');
		
	    }//main
	    
		static int ascii (char ch) {
	    	 return ((int) ch); //gives ascii code
	
	     }//ascii
}

