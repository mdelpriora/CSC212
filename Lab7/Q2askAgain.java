/*
 * Write a program that asks you to enter an int in [5,10] 
 * and if you do not enter the right input it asks you again.
 */
import java.util.*;
public class Q2askAgain {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Enter an integer 5<= n <=10");
	int n = in.nextInt();
	
	while(n < 5 || n > 10) {
		System.out.println("Enter an integer 5<= n <=10");
		n = in.nextInt();
	}//while
	System.out.println("You entered " + n + " which is within the bounds");

	
	}
}
