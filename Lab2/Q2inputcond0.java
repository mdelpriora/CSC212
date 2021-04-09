//Ask for an even integer between 10 and 20 and even. Say "thanks" or "Good bye" if it is not correct.

import java.util.*; 
public class Q2inputcond0 {
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer between 10 and 20");
		int n = input.nextInt();
		if (n>10 && n<20 && n%2==0) { 
			System.out.println("Your number is between 10 and 20 and is even");
		}	
			else 
			System.out.println("Your number is not between 10 and 20 and is odd");
		
	
				
		
			
	}
}
