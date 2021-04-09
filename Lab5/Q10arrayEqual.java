/*
 * Check if two arrays of integers A[], B[] same size, 
 * entered by the user are equal as sets (order does not matter).
 * Repeat till the user says "no" to "Continue(y/n)?"
 */
import java.util.*;
public class Q10arrayEqual {
	static Scanner in=new Scanner(System.in);
	public static void main(String[] args) {
	
		char op = 'y';
	
	do {
		System.out.println("How many elements you want in your arrays");
		int n = in.nextInt();
		System.out.println("Enter " + n + " elements");
		int [] A = new int [n];
		generate(A);
		System.out.println("Enter " + n + " elements");
		int [] B = new int [n];
		generate(B);
		
		Arrays.sort(A);
		Arrays.sort(B);
		
		if (Arrays.equals(A,B)) {
			System.out.println("These arrays are equal");
		}
		else{
			System.out.println("These arrays are not equal");
		}
		System.out.println("Continue? y/n");
		op = in.next().charAt(0);
	}
	while (op == 'y' || op == 'Y');
	}
	static void generate(int [] Array) {//creates array A
		for (int i = 0; i < Array.length; i++) {
			Array[i] = in.nextInt();
		}//for
	}//generate
	
}
