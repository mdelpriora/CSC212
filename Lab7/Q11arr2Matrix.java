/*
 * You have an array with n = k * k numbers.
 * Fill a matrix k x k with these numbers.
 */

import java.util.*;
public class Q11arr2Matrix {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter the length of your array as a perfect square and does not equal one");
		int n = in.nextInt();
		
		while(Math.sqrt(n) != (int)Math.sqrt(n) || n == 1) {
			System.out.println("Your input was not a perfect square or is equal to one, enter again");
			n = in.nextInt();
		}
	
		System.out.println("Enter " + n + " elements");
		int [] A = new int [n];
		generate(A);
		matrix(A,n);
	}
	static void generate(int [] Array) {//creates array A
		for (int i = 0; i < Array.length; i++) {
			Array[i] = in.nextInt();
		}//for
	}//generate
	static void matrix (int [] Array, int n) {
		int k = (int) Math.sqrt(n);
		int [][] matrix = new int [k][k];
		
		for(int i = 0; i < k; i++) {
		    for (int j = 0; j < k; j++) {
			matrix[i][j] = Array[i*k + j];//matrix index = length*index + j
		    }//for
		}//for
		
		System.out.println("The following is your array as a matrix");
		for (int row [] : matrix) {
			System.out.println(Arrays.toString(row));
		}//for
		System.out.println();
	}//matrix
	
}
