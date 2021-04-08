/*
 * Ask for two arrays A[] and B[] with non - repeating integers and ask the user to perform different set operations. 
 * If you enter an array with repeating elements the program will ask you to enter another array until you get it right
 * The program will loop until you type 0.
 */
import java.util.*;
public class Q1setCheck {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		char cont = 'y';
		boolean r;
		boolean rb;
		int A[];
		int B[];		
		do {
		System.out.println("Enter how many elements you want in array A");
		int n = in.nextInt();
		System.out.println("If you enter repeating elements in the same array you will have to re enter both arrays");
		System.out.println("Enter " + n + " non repeating integer elements for array A");
		A = new int [n];
		generate(A);
		r = repeat(A);
		
		System.out.println("Enter how many elements you want in array B");
		int n1 = in.nextInt();
		System.out.println("\nEnter " + n1 + " non repeating elements for array B");
		B = new int [n1];
		generate(B);
		rb = repeat(B);
		}
		while (rb == false || r == false);
			
	do {
		System.out.println("\nPick one: " + "\n1.Display the sets" + "\n2.Display intersection" + "\n3.Display union" + "\n4.Display difference A-B" + "\n5.Check if disjoint" + "\n6.Check if either array is included in the other" + "\n0.Exit");
		int op = in.nextInt();
		
		switch(op) {
		case 1: 
				System.out.println("Array A: " + Arrays.toString(A));
				System.out.println("Array B: " + Arrays.toString(B));	
			break;
		case 2:
				intersection(A,B);
	
			break;
		case 3: 
				Arrays.sort(A);
				Arrays.sort(B);
				System.out.println("These two arrays unioned is:");
				union (A,B);
			break;
		case 4:	

				System.out.println("The following are the numbers that aren't present in both arrays ");
				difference(A,B);
				
			break;
		case 5:
				disjoint(A,B);
			
			break;
		case 6:
				if(included(A, B) == true) 
				{ System.out.print("Array B is a subset of arr1[] ");}
		        else {System.out.print("Array B is not a subset of arr1[]"); }
				
				if(included(B, A) == true) 
				{ System.out.print("\nArray A is a subset of arr1[] ");}
		        else { System.out.print("\nArray A is not a subset of arr1[]");}
			break;
		case 0: System.out.println("You have exited");
		
		}
		System.out.println("\nDo you want to continue? y/n");
		cont = in.next().charAt(0);
		
	}while (cont == 'y' || cont == 'Y');
	System.out.println("Goodbye");
	}//main
	
	static void generate(int [] Array) {//creates array
		for (int i = 0; i <Array.length; i++) {
			Array[i] = in.nextInt();
		}//for
	}//generate
	static boolean repeat(int Array[]) {
		for (int i = 0; i < Array.length; i++) {
			for(int j = i+1; j < Array.length; j++) 
				if(Array[i] == Array[j]) {
				return false; //found repeating elements
				}//if
		}//for
		return true;//didn't find repeating elements
	}//repeat
	static void intersection(int [] A, int [] B) {
		int [] C = new int [A.length + B.length];
		System.out.println("These arrays both contain numbers:  ");
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < B.length; j++) {
				if (A[i] == B[j]) {
					C[j] = A[i];
				System.out.println(C[j]);
				}//if
			}//for
		}//for
	}//intersection
	static void union (int [] A, int [] B) {
		int i = 0;
		int j = 0;
		while (i < A.length && j < B.length) {
			if (A[i] < B[j]) {
				System.out.print(A[i]+ " ");
				i++;
			}//if
			else if (B[j] < A[i]) {
				System.out.print(B[j]+ " ");
				j++;
			}//else if
			else {
				System.out.print(A[i]+ " ");
				i++;
				j++;
			}//else
		}//while
		
		while (i < A.length) {
            System.out.print(A[i] + " ");
            i++;
        }//while
		
		while (j < B.length) {
	        System.out.print(B[j] + " ");
	        j++;
	    }//while
	}//union
	static void difference (int [] A, int [] B) {//FIX
		int i = 0, j = 0; 
	    while (i < A.length && j < B.length){ 
	        if (A[i] < B[j]){  // Print smaller element and move ahead in array with smaller element 
	            System.out.print(A[i]+" "); 
	            i++; 
	        }//if
	        else if (B[j] < A[i]){ 
	            System.out.print(B[j]+" "); 
	            j++; 
	        }//else if
	        else{// If both elements are the same, continue for both arrays.  
	            i++; 
	            j++; 
	        }//else 
	    }//while 
	}//difference

	static void disjoint (int [] A, int [] B) {//whether arrays have a common element
		int count = 0;
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < B.length; j++) {
				if(A[i] == B[j]) {
					count++;
				}//if
			}//for
		}//for
		if (count >=1) {
			System.out.println("Arrays are not disjoint.");
		}
		else {
		    System.out.println("Array are disjoint.");
		}
	}//disjoint
	
	static boolean included (int [] A, int [] B) {
		int i = 0;
		int j = 0;
		for (i = 0; i < A.length; i ++) {
			for (j = 0; j< B.length; j++) 
				if (A[i] == B[j]) 
					break;
				if (j == A.length) 
					return false;//2nd array is not present in first array
		}//for
		return true;
	}//included
}
