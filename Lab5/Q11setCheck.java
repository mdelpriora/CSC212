/*
 * Check if an array of integers has repeating elements
 * that is if it is a set or not.
 */

import java.util.*;
public class Q11setCheck {
	static Scanner in=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("How many elements you want in your array");
		int n = in.nextInt();
		System.out.println("Enter " + n +  " non repeating integer elements for array A");
		int [] A = new int [n];
		generate(A);

		if (repeat(A) == false) {
			System.out.println("This array has repeating elements");
		}//if
		else {
			System.out.println("This array does not have repeating elements");
		}//else
	}//main
	static boolean repeat(int [] Array) {
		for (int i = 0; i < Array.length; i++) {
			for(int j = i+1; j < Array.length; j++) 
				if(Array[i] == Array[j]) {
				return false; //found repeating elements
				}//if
		}//for
		return true;//didn't find repeating elements
	}//repeat
	static void generate(int [] Array) {//creates array A
		for (int i = 0; i < Array.length; i++) {
			Array[i] = in.nextInt();
		}//for
	}//generate

}
