/*
 * Explore and use the String method int s.indexOf(substring), 
 * if found returns the first position,
 * if not returns -1.
 */
import java.util.Scanner;
public class Q11find {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		char op = 'y';
		do {
			substring();
			
			System.out.println("Do you wann a play again? y/n");
			op  = in.next().charAt(0);
		}while (op == 'Y' || op == 'Y');
		System.out.println("Goodbye");
	}
	static void substring() {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a string and the substring you want to search for");
		String word = in.nextLine();
		String sub = in.nextLine();
		
		int index = word.indexOf(sub);
		
		if (index !=-1) {
		System.out.println("The substring was found at index: " + index);
		}
		else {
			System.out.println("The substring was not found in the string");
		}
			
	} 
}
