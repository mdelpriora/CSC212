//Ask for 2 numbers find maximum

import java.util.*; 
public class Q3Max1 {
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int n1 = input.nextInt();
		int n2 = input.nextInt();

		if (n1==n2) {
			System.out.println("These numbers are equal");
		}
		else
			if(n1>n2) {
			System.out.println("The max is " + n1);
			}
			else
				System.out.println("The max is " + n2);
				

			
		
		
		
	}
}