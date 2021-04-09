/*
 * Generate a random n x n matrix and display its corners, 
 * the first diagonal, 
 * second diagonal
 */
import java.util.*;
public class Q2mdiagonal {
	public static void main(String[] args) {
		int [][] A = new int [3][3];
		generate(A);
		print(A);
		diagonal(A);
		corners(A);
		
	}//class
	
	static void generate(int [][] A) {//generate random matrix
		for(int i = 0; i < 3; i++) {
	    	for (int j = 0; j < 3; j++) {
			A[i][j] = (int)(Math.random()*10);
	    	}//for
		}//for
	}//generate
	
	static void print(int [][] A) {//M[i][j]
		for (int i = 0; i < 3; i++) {
			System.out.print(Arrays.toString(A[i]));
			System.out.println();
		}//for
	}//print
	static void corners(int [][] A) {
		System.out.print("Corners are: ");
		for(int i = 0; i < A.length; i++) {
			for(int j = 0; j < A.length; j++) {
				if (i == 0 && j == 0 || i == 0 && j == A.length-1) {
					System.out.print(A[i][j] + " ");
				}//if
				else if(i == A.length-1 && j == 0 || i == A.length-1 && j == A.length-1) {
					System.out.print(A[i][j] + " ");
				}//else if
			}//for
		}//for
	}//corners
	static void diagonal(int [][] A) {
		System.out.print("First diagonal: ");
		
		for(int i = 0; i < A.length; i++) {//prints first diagonal
			System.out.print(A[i][i]+ " ");
		}//for
		System.out.println();
		System.out.print("Second diagonal: ");
		for(int j = 0; j < A.length; j++) {//prints second diagonal
			System.out.print(A[j][A.length - 1 - j] + " ");
		}
		
	}//diagonal
}
