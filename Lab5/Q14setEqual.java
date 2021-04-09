/*
 * Check if 2 sets are equal.
 * Assume arrays and sizes are given in the program.
 */
import java.util.*;
public class Q14setEqual {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("How many elements you want in your arrays");
		int n = in.nextInt();
		
		System.out.println("Enter " + n +  " non repeating integer elements for array A");
		int [] A = new int [n];
		generate(A);
		Arrays.sort(A);
		
		System.out.println("Enter " + n +  " non repeating integer elements for array B");
		int [] B = new int [n];
		generate(B);
		Arrays.sort(B);
		
		
	if (Arrays.equals(A, B)) {
		System.out.println("These arrays are equal");
	}
	else {
		System.out.println("These arrays are not equal");
	}
	}//main
	
	static void generate(int [] Array) {//creates array
		for (int i = 0; i <Array.length; i++) {
			Array[i] = in.nextInt();
		}//for
	}//generate
}
