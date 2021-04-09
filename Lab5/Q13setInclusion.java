/*
 * Check if an array (as a set) is included in another array (as a set)
 */

import java.util.Scanner;
public class Q13setInclusion {
	static Scanner in = new Scanner(System.in);
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

		if(included(A, B) == true) 
		{ System.out.print("Array B is a subset of arr1[] ");}
        else {System.out.print("Array B is not a subset of arr1[]"); }
		
		if(included(B, A) == true) 
		{ System.out.print("\nArray A is a subset of arr1[] ");}
        else { System.out.print("\nArray A is not a subset of arr1[]");}
	}//main
	
	static void generate(int [] Array) {//creates array
		for (int i = 0; i <Array.length; i++) {
			Array[i] = in.nextInt();
		}//for
	}//generate
	
	static boolean included (int [] A, int [] B) {
		int i = 0;
		int j = 0;
		for (i = 0; i < A.length; i ++) {
			for (j = 0; j< B.length; j++) 
				if (A[i] == B[j]) 
					break;
				if (j == A.length) 
					return false;//2nd array is not present in first array
		}//for
		return true;
	}//included
}
