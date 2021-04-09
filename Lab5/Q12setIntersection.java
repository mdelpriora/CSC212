/*
 * Enter 2 sets of integers (assume they have non -repeating elements).
 * Build their intersection as the third array
 */
import java.util.*;
public class Q12setIntersection {
	static Scanner in=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("How many elements you want in array A");
		int n = in.nextInt();
		System.out.println("Enter " + n +  " non repeating integer elements for array A");
		int [] A = new int [n];
		generate(A);
		
		System.out.println("How many elements you want in array B");
		int n1 = in.nextInt();
		System.out.println("Enter " + n1 +  " non repeating integer elements for array B");
		int [] B = new int [n1];
		generate(B);
		
		intersection(A,B);
		
	}

	static void intersection(int [] A, int [] B) {
		int [] C = new int [A.length + B.length];
		System.out.println("These arrays both contain numbers:  ");
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < B.length; j++) {
				if (A[i] == B[j]) {
					C[j] = A[i];
				System.out.println(C[j]);
				}//if
			}//for
		}//for
	}//intersection
	
	static void generate(int [] Array) {//creates array
		for (int i = 0; i <Array.length; i++) {
			Array[i] = in.nextInt();
		}//for
	}//generate
}
