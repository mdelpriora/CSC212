/*
 * Write out to output on screen the results of a 12 by 12 multiplication table. 
 */

import java.util.*;
public class Q1multTable {
	public static void main(String[] args) {
		//int [][] A = {{1,2,3,4,5,6,7,9,10,11,12},{1,2,3,4,5,6,7,9,10,11,12}};
		int [][] B = new int [12][12];
		mult(B);
		print(B);
		
	}//main
	static void mult(int [][] B) {//M[i][j]
		int store = 0;
		for (int i = 1; i <= 12; i++) {
			for (int j = 1; j <= 12; j++) {
				store = i*j;
				B[i-1][j-1] = store;
			}//for
		}//for
	}//mult
	static void print(int [][] M) {//M[i][j]
		for (int i = 0; i < M.length; i++) {
			System.out.print(Arrays.toString(M[i]));
			System.out.println();
		}//for
	}//print
}//class
