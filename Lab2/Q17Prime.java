//Check if a number is prime. List the first n=100 prime numbers.

import java.util.*;
public class Q17Prime {
	public static void main (String [] arg) {
		Scanner in = new Scanner(System.in); 
		System.out.println("Enter a number");
		double i;
		double n = in.nextInt();
		double m=n/2;
		if (n<=1) {
			System.out.println(n + " is not a prime number");
		}
			else {
				for (i=2; i <=m; i++) {
					if(n%i==0) {
					System.out.println(n + " is not a prime number");
					
					
					}
				}
				
			}
		
	
	
	
	}
}
