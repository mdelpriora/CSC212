/*
 * Check if a given matrix is a unit matrix
 */
import java.util.*;
public class Q4checkUnit {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		
		int [][] A = new int [3][3];
		generate(A);
		unit(A);
		
		
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
	static void unit (int [][] A) {
		int flag = 0;
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if((i == j && A[i][i]!=1)||(i!=j && A[i][j] !=0)){
				//Diagonal != 1 or other elements != 0, flag 
					flag = 1;
					break;
				}//if
			}//for
			if(flag == 1) {//if ever flag = 1, skip to end
				break;
			}//if
		}//for
		
		if (flag == 1) {//conditions not satisfied
		System.out.println("This matrix is not a unit matrix");
		}//if
		else {
			System.out.println("This matrix is a unit matrix");
		}//else
	}//diagonal
}//class
