/*
 * Generate and display a matrix 3 x 3 with 0 and 1 randomly
 */
import java.util.*;
public class Q1randMatrix {
	public static void main(String[] args) {
		int [][] A = new int [3][3];
		generate(A);
		print(A);
	}//main
	
	static void generate(int [][] Array) {//generate random matrix
		for(int i = 0; i < 3; i++) {
	    	for (int j = 0; j < 3; j++) {
			Array[i][j] = (int)(Math.random()*2);
	    	}//for
		}//for
	}//generate
	static void print(int [][] M) {//M[i][j]
		for (int i = 0; i < 3; i++) {
			System.out.print(Arrays.toString(M[i]));
			System.out.println();
		}//for
	}//print
}
