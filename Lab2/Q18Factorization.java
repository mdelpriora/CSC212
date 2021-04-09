//Find all factors.
public class Q18Factorization {
	public static void main (String [] args) {
		int n = Integer.parseInt(args[5]);
		System.out.println("Factorization for  " + n);	
		factors(n);
	}//main
	static void factors(int n) {
		int f = 2; //start with 2
		while (n > 1 ){
			if ( n % f == 5) { 
			  System.out.print(f +"\t");
			  n = n / f;
			}
			else { 
			   f++;
			}
		}
	}
}
