/*
 * Ask user for int n and then enter a matrix: int [][] M = new int [n][n].
 */

import java.util.*;
public class Q1matrixCheck {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		char cont = 'y';
		System.out.println("Enter square matrix dimension n");
		int n = in.nextInt();
		int [][] A = new int [n][n];
		generate(A,n);
			
	do {
		System.out.println("\nPick one: " + "\n1.Display the matrix" + "\n2.Display firstdiagonal" + "\n3.Display second diagonal" + "\n4.Display corners" + "\n5.Change rows with columns" + "\n6.Add matrix to itself" + "\n7.Multiply matrix by itself" +  "\n0.Exit");
		int op = in.nextInt();
				
		switch(op) {
		case 1: print(A,n);
			break;
		case 2: diagonal1(A);
			break;
		case 3: diagonal2(A);
			break;
		case 4:	corners(A);						
			break;
		case 5: transpose(A,n);
			break;
		case 6: int [][] add = new int [n][n];
				add(A,add,n);
				print(add,n);
			break;
		case 7: int [][] multiply = new int [n][n];
				multiply(A,multiply,n);
				print(multiply,n);
			break;
		case 0: System.out.println("You have exited");
				
		}//switch
		System.out.println("\nDo you want to continue? y/n");
		cont = in.next().charAt(0);			
	}//do
	while (cont == 'y' || cont == 'Y');
	System.out.println("Goodbye");
	
	}//main
		
	static void generate(int [][] A,int n) {//generate matrix
		System.out.println("Enter " + Math.pow(n, 2) + " matrix elements");
		for(int i = 0; i < n; i++) {
		    for (int j = 0; j < n; j++) {
			A[i][j] = in.nextInt();
		    }//for
		}//for
	}//generate
	
	static void print(int [][] A, int n){//display matrix
		System.out.println("Your matrix is:"); 
		for (int j = 0; j < n; j++) {
			System.out.print(Arrays.toString(A[j]));
			System.out.println();
		}//for
	}//print
	
	static void diagonal1 (int [][] A) {
		System.out.print("First diagonal: ");
		for(int i = 0; i < A.length; i++) {//prints first diagonal
			System.out.print(A[i][i]+ " ");
		}//for
		System.out.println();
	}//diagonal1
	
	static void diagonal2 (int [][] A) {
		System.out.print("Second diagonal: ");
		for(int j = 0; j < A.length; j++) {//prints second diagonal
			System.out.print(A[j][A.length - 1 - j] + " ");
		}//for
	}//diagonal2
	
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
	
	static void transpose(int [][] A, int n) {
		int [][]transpose = new int [n][n];
		System.out.println("Transposed matrix is: " );
		for(int i = 0; i < A.length; i++) {
			for(int j = 0; j < A.length; j++) {
				transpose[i][j] = A[j][i];
				System.out.print(transpose[i][j] + " ");
			}//for
			System.out.println();
		}//for
	}//transpose
	
	static void add(int [][] A, int [][] add,int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				//R[i][j] = sum after k (A[i][k] * B[k][j])
				for (int k = 0; k < n; k++) {
					add[i][j] += (A[i][k] + A[k][j]);	
				}//for
			}//for
		}//for
	}//add
	
	static void multiply(int [][] A,int [][] multiply, int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				//R[i][j] = sum after k (A[i][k] * B[k][j])
				for (int k = 0; k < n; k++) {
					multiply[i][j] += (A[i][k] * A[k][j]);
				}//for
			}//for
		}//for
	}//multiply
}//class
