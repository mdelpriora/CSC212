/*
 * Given a word X display each character on a different line with its ASCII code. 
 */

import java.util.*;
public class Q9asciiLine {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a word");
		String s = in.nextLine();
		
		ascii(s);
	}
	static void ascii (String s) {
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			System.out.println("Ascii code of " + c + " is " +  ((int) c) );
		}
    }//ascii
}
