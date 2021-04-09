// Ask 3 times for a letter and print it lower case if it is in upper case and vice versa.
//You have to check if it is a letter.
import java.util.*;
public class Q8changeCase {
	public static void main (String [] args) {
		Scanner in=new Scanner(System.in);
		
		for (int i = 0; i<3; i++) {
		System.out.println("Enter a letter in upper or lowercase");
		char l = in.next().charAt(0);
		System.out.println(changeletter(l));
		}//for		

	}//main
	static char changeletter(char l) {
		if (Character.isUpperCase(l)) 
			return(Character.toLowerCase(l));
		else
			return(Character.toUpperCase(l));
	}//change letter
}
