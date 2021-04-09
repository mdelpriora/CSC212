//Recursion. Greatest Common Divisor

import java.util.*; 
public class Q22Gcd {
	public static void main (String [] args) { 
		Scanner in = new Scanner(System.in); 
		System.out.print("Greatest common divisor. Enter two ints n,m? ");	
		int n = in.nextInt();
		int m = in.nextInt();
		if (( n == 0 )  || (m == 0) ) 
			System.out.println("wrong input");
        else
		  System.out.println("gcd( " + n + "," + m + ")= " + gcd(n,m)
		     + "\n gcdslow= " + gcdslow(n,m)
		     + "\n gcdslow2= " + gcdslow2(n,m));
   	}//main
	public static int gcd( int n, int m ) {
		int r = n % m;  // find r = remainder
		//cout << n << " divided by " << m << " remainder= " << r << endl;
		if ( r == 0 )	
			return m;  // m divides n then m is gcd
		else	 
			return gcd(m,r);	// if not find gcd(m, rem(n,m))
	}//gcd
	public static int gcdslow(int n, int m) {
		int factor = 1;
		for (int i = 2 ; i <= m ; i++) {
			if ((m % i== 0) && (n % i == 0))
			   factor = i;  // computes all factors
		}
		return factor; // the last (greatest) is selected
	}//gcdslow
	public static int gcdslow2 (int n, int m) {
		for (int i = m ; i >= 2 ; i--) {
			if ( m % i == 0  &&  n % i == 0)  return i;
		}
		return 1; // there is no common divisor
	}//gcdslow2
	int lcm (int n,int m) { // least common multiple
		return  ( n * m ) / gcd(n,m) ;
	}//lcm

}
