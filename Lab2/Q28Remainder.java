//Ask for 2 integers. Find their remainder (recursive)

import java.util.*; 
public class Q28Remainder {
	public static void main (String [] args) { 	
		Scanner in = new Scanner(System.in); 
		System.out.println("Enter two integers, dividend then divisor");
		int n = in.nextInt();
		int m = in.nextInt();
		
		System.out.println("The remainder is " + rem(n, m));

	}
	static int rem (int n, int m) {
		if (m> n)
			return (n);
		else
			return (rem(n-m, m));
	}
	
}
