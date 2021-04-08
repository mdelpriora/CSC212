

import java.util.*;
public class Q2TicTacToe {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		char cont = 'y';
		
	do {
		System.out.println("\nPick one: " + "\n1.Directions" + "\n2.Game" + "\n3.Exit");
		int op = in.nextInt();
		
		switch(op) {
		case 1: 
			break;
		case 2: int [][] A = new int [3][3];
				generate(A);
				diagonalprint(A);
				boolean row = rows(A);
				boolean column = columns(A);
				boolean diag = diagonal(A);
				if (row == true || column == true || diag == true) {
					System.out.println("You have 3 in a row, you win");
				}//if
				else {
					System.out.println("You do not have 3 in a row, you lost");
				}//else		
			break;
		case 3: System.out.println("You have exited");
			break;
		default: System.out.println("Enter a valid option");
		
		}//switch
		System.out.println("\nDo you want to continue? y/n");
		cont = in.next().charAt(0);			
	}//do
	while (cont == 'y' || cont == 'Y');
	System.out.println("Goodbye");
		
	}//main
	static void generate(int [][] A) {//generate + printmatrix
		for(int i = 0; i < A.length-1; i++) {
	    	for (int j = 0; j < A.length-1; j++) {
			A[i][j] = (int)(Math.random()*2);
	    	}//for
		}//for
		System.out.println("Your matrix is:"); 
	    for (int j = 0; j < A.length; j++) {
			System.out.print(Arrays.toString(A[j]));
			System.out.println();
		}//for
	}//generate
	static boolean rows(int [][] A) {
		for(int i = 0; i < A.length-1; i++) {
			if (!(A[A.length-1][i] == A[A.length-1][i+1])) {
			return false;
			}//if
		}//for
		return true;
	}//rows
	static boolean columns(int [][]A) {
		for(int i = 0; i < A.length-1; i++) {
			if (!(A[i][A.length-1] == A[i+1][A.length-1])) {
			return false;
			}//if
		}//for
		return true;
	}//columns
	static boolean diagonal(int [][]A) {
		int sum1=0;
		int sum2=0;
		for (int i = 0; i < A.length-1; i++) {
			sum1 += A[i][i];
		}//for
		for (int j = 0; j < A.length-1; j++) {
			sum2 += A[j][(A.length-1)-j];
		}//for
		
		if (sum1==0 || sum1 == 3 || sum2 ==3 || sum2==0) {
			return true;
		}//if
		else {
			return false;
		}//else
	}//diagonal
	static void diagonalprint(int [][]A) {
		System.out.print("First diagonal: ");
		for(int i = 0; i < A.length; i++) {//prints first diagonal
			System.out.print(A[i][i]+ " ");
		}//for
		System.out.println();
		System.out.print("Second diagonal: ");
		for(int j = 0; j < A.length; j++) {//prints second diagonal
			System.out.print(A[j][A.length - 1 - j] + " ");
		}//for
		System.out.println();
	}//diagonalprint
}//class
