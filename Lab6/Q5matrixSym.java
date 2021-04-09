/*
 *  Check if a matrix is symmetric
 */
import java.util.*;
public class Q5matrixSym {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		int [][] A = new int [3][3];
		generate(A);
		symmetric(A);
	}//main
	
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
	static void symmetric(int [][] A) {
		int flag = 0;
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(A[i][j] != A[j][i]){//elements are not the same
					flag = 1;
					break;
				}//if
			}//for
		}//for
		if (flag == 1) { //conditions not satisfied
			System.out.println("This matrix is not symmetric");
		}//if
		else {
			System.out.println("This matrix is symmetric");
		}//else
	}//symmetric
}//class
