/*
 * Given an array of random integers.
 * Reorganize them in such a way that the first half becomes the second half and the second half becomes the first.
 */
import java.util.*;
public class Q15butterfly {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter an even array length");
		int n = in.nextInt();
		int [] A = new int [n];
		generate(A);
		System.out.println("Your array is: " + Arrays.toString(A));
		butterfly(A);
		System.out.println("Your array  butterflied is: " + Arrays.toString(A));
	}//main
	static void generate(int [] Array) {
		for (int i = 0; i <Array.length; i++) {
			Array[i] = (int)(Math.random()*50);
		}//for
	}//generate
	
	static void butterfly (int []Array) {
		for (int i = 0; i < Array.length/2; i++) {//loop for half of array
			int temp = Array[i];
			Array[i]=Array[i + Array.length/2];//replaces element at i with middle element
			Array[i + Array.length/2] = temp; //replaces element i starting from middle with original i element
		}//for
	}//butterly
}
