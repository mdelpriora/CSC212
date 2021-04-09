/*
 * Password check. If you are Ann or Bob or Cory the program says hello 
 * otherwise asks again your password. 
 */
import java.util.Scanner;
public class Q8password {
	public static void main (String [] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter your password");
		String word = in.nextLine().toLowerCase();
		
		do {
			System.out.println("This was incorrect, enter your password");
			word = in.nextLine().toLowerCase();
		}
		while ((!word.equals("ann") && !word.equals("bob") && !word.equals("cory")));
		
		
		System.out.println("Hello");
		
	}//main	
}//class
//enter password, password has to be ann bob or cory
//equalities for string is .equals