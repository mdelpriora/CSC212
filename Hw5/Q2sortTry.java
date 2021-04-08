/*
 * Generate a random array of n integers A[n] (with numbers from 0 to n/2) and display it. Then apply all the sortings algorithms you learned in class. 
 * Display the number of steps:
 */
import java.util.*;
public class Q2sortTry {
	static Scanner in=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("How many elements you want in your array");
		int n = in.nextInt();
		float [] A = new float [n];
		generate(A,n);
		System.out.println(Arrays.toString(A));
		
		sortBubble(A);
		System.out.println("Your array sorted using Bubble sort is:");
		System.out.println(Arrays.toString(A));
		
		sortSelection(A);
		System.out.println("Your array sorted using Selection sort is:");
		System.out.println(Arrays.toString(A));
	}
	static void generate(float [] A, int n) {
		for (int i = 0; i < n; i++) {
			A[i] = (float)(Math.random()*(n/2));
		}//for
	}//read
	static void sortBubble(float [] A) {
		int n = A.length;
		float temp = 0;
		int step = 0;
		for (int i = 0; i< n; i++) {//runs for one letter
			for (int j = 1; j< A.length; j++) {//compares all letters to the letter at i
				if (A[j] < A[j-1]) {//if letter at j < previous letter, replace previous with letter at j
				temp = A[j-1];
				A[j-1] = A[j];
				A[j] = temp;
				}//if
				step++;
			}//for
		}//for
		System.out.println("There were " + step + " steps");
	}//sortBubble
	static void sortSelection(float [] A) {
		int step = 0;
		for (int i = 0; i < A.length; i++) {
			int index = i;
			for (int j = i + 1; j < A.length;j++) {
				if (A[i] < A[index]) {
					index = j;
				}//if
				step++;
			}//for
			float smallNum = A[index];
			A[index] = A[i];
			A[i] =smallNum;
		}//for
		System.out.println("There were " + step + " steps");
	}//sortSelection
}
