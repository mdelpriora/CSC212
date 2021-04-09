/*
 * Using the STACK data structure 
 * write a program that given a number in decimal representation 
 * will display its binary representation as a string
 */
import java.util.*; 
public class Q10MyDec2Bin {
	public static void main (String [] args){
		Scanner in = new Scanner(System.in); 
		Stack <Integer> Res = new Stack <Integer> ();  //result
		System.out.print("Enter an integer in base 10 ? ");
		int n = in.nextInt();//check if int
		base2(n,Res);
		System.out.print( n + " in base 2 is: " + result(Res));
	}
	 static void base2 (int n, Stack <Integer> S) {	// n = number
		if ( n < 2 ) 
			S.push(n);//pushes n onto stack if its less than 2
		else {
			S.push( n % 2 );//push remainder in Stack
			base2 ( n / 2,S);//find quotient and go over
		}
	}//base2
	static String result ( Stack <Integer>  S ) {
		String r = "";
		while (! S.empty() ) {
			r = r + Integer.toString(S.pop() );
		}//while
		return r;
	}//result
}
