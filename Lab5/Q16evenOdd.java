/*
 * Given an array of random integers, size n. 
 * Reorganize it in such a way that the even integers come first and then the odd numbers, preserving their initial order in the list.
 */
import java.util.*;
public class Q16evenOdd {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter an even array length then press enter");
		int n = in.nextInt();
		int [] A = new int [n];
		generate(A);
		System.out.println("Your array is: " + Arrays.toString(A));
		evenodd(A);
		System.out.println("Your array with even numbers first is: " + Arrays.toString(A));
	}//main
	static void generate(int [] Array) {
		for (int i = 0; i <Array.length; i++) {
			Array[i] = (int)(Math.random()*50);
		}//for
	}//generate
	static void evenodd (int []Array) {
		int temp = 0;
		boolean change = true; 
		while (change) {
			change = false;
			for (int i = 0; i< Array.length-1; i++) {//runs for one letter
				if (Array[i]%2 == 1 && Array[i+1]%2 == 0) {//if there is an odd followed by an even number
					temp = Array[i];
					Array[i] = Array[i+1];
					Array[i+1] = temp;
					change = true;
				}//if
			}//for
		}//while
	}//evenodd
}
