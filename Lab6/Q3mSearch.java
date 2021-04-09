/*
 * Ask user for entering a matrix n x n (n =3). 
 * Search if a certain element is found inside.
 */
import java.util.*;
public class Q3mSearch {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		char op = 'y';
	do {
		int [][] A = new int [3][3];
		generate(A);
		search(A);
		System.out.println("Do you want to continue? y/n");
		op = in.next().charAt(0);
	}
	while (op == 'y' || op == 'Y');
	System.out.println("Goodbye");
	
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
	
	static void search (int [][] A) {//searches for wanted number
		System.out.println("Enter number you want to search for");
		int n = in.nextInt();
		int count = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (A[i][j] == n) {
					count ++;
				}//for
			}//for
		}//for
		if (count > 0) {
			System.out.println(n + " was found in this matrix");
		}
		else {
			System.out.println(n + " was not found in this matrix");
		}
	}//search
}//class
