/*
 * Write a program that checks if the sum of the elements of the first diagonal are equal with the sum of elements on the second diagonal.
 */
import java.util.*;
public class Q6magic {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		int [][] A = new int [3][3];
		generate(A);
		
		if (magic(A) == true) {
			System.out.println("This matrix is a magic quare");
		}
		else {
			System.out.println("This matrix is not a magic quare");
		}
	}
	static void generate(int [][] A) {//generate + printmatrix
		System.out.println("Enter " + Math.pow(3, 2) + " matrix elements");
		for(int i = 0; i < 3; i++) {
	    	for (int j = 0; j < 3; j++) {
			A[i][j] = in.nextInt();
	    	}//for
		}//for
		System.out.println("Your matrix is:"); 
	    for (int j = 0; j < 3; j++) {
			System.out.print(Arrays.toString(A[j]));
			System.out.println();
		}//for
	}//generate
	
	static int addline(int [][]A,int line) {
		int sum = 0;
		for (int i = 0; i < A.length; i++) {
			sum += A[line][i];
		}
		return sum;
	}//addline
	
	static boolean magic (int [][] A) {
		int sum1 = 0;
		int sum2 = 0;
	//DIAGONALS
		for(int i = 0; i < A.length; i++) {//sum of first diagonal
			sum1 += A[i][i];
		}//for
		for(int j = 0; j < A.length; j++) {//sum of second diagonal
			sum2 += A[j][A.length - 1 - j];
		}//for	
		if (sum1 != sum2) {
			return false;
		}//if
	//ROWS
		for (int i = 0; i < A.length; i++) {
			int rowsum = 0;
			for (int j = 0; j < A.length; j++) {
				rowsum += A[i][j];
			}//for
			if (rowsum != sum1)
				return false;
		}//for		
	//COLUMNS
		for (int i = 0; i < A.length; i++) {
			int columnsum = 0;
			for (int j = 0; j < A.length; j++) {
				columnsum += A[j][i];
			}//for
			if (columnsum != sum1)
				return false;
		}//for	
		
	return true;
		
	}//magic
}//class
