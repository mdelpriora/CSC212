/*Ask for your name. 
 *Write each letter 3 times.
 */

import java.util.Scanner;
public class Q1name3 {
	public static void main (String [] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("Enter a name");
	String name = in.nextLine(); 
	
	for (int i = 0; i < name.length(); i++) {
		for(int l=0;  l<3; l++) {
		System.out.println(name.charAt(i));
		
		}
	}
	}	
}
