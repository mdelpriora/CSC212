/*The Goldbach Conjecture asserts that every even integer is the sum of two prime numbers. 
 * Write a program that receives an integer from the user, 
 * checks to make sure that it is even, 
 * then finds two prime numbers that sum to the number.
*/

import java.util.*; 
public class Q27Goldbach {
	public static void main (String [] args) { 	
		
		Scanner in = new Scanner(System.in); 
		int n;
		
		do {
		System.out.print("Enter an even number");
		n = in.nextInt();
		}//do
		while (n%2 != 0);
		prime(n);
		}//main

	
	static void prime (int n) {
		for (int i = 2; i <= n; i++) {
			if (isprime(i) && isprime(n-i)) {
				System.out.println(n + " = " + i + " + " + (n-i));
				break;
				}//if
				
			}//for
		}//void
	
	
	static boolean isprime (int num) { //checks if a number is prime
		if (num == 1) //special case of 1
			return (false);
		if (num == 2) //special case of 2
			return (true);
		for (int i = 2; i <= Math.sqrt(num); i++) //checks all possible factors
		{
			if (num % i == 0) //if num has a factor, it is not prime
				return (false);
		}	
		return (true);
	} //isPrime
	}

