//Find all the factors of a given integer and add them

import java.util.*; 
public class Q4Divisors{
	public static void main (String [] args) { 
	Scanner in = new Scanner(System.in); 
	System.out.println("Enter an integer");
	int n = in.nextInt();
	System.out.println("Factors of  " + n + " are:");	
	factors(n);
}//main
static void factors(int n) {
	
	int sum=0;
	for (int i=1; i<=n; i++) {
		if ( n % i == 0) { 
			System.out.println(i + " ");
			sum = sum+ i;
		}
	
		}
		System.out.println("The sum of these factors is: " + sum);

	

	}
}
