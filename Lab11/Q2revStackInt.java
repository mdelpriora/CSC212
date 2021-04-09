/*
 * Using the STACK data structure write a program that reverses an Array of ints 
 * using the same space for the Array. 
 * A={1,2,3} A will become {3,2,1}
 * Idea: push it and then pop in a Stack
 */
import java.util.*;
public class Q2revStackInt {
	public static void main (String [] args){
		Integer [] A = {1,2,3};
		System.out.println("Array A: " + Arrays.toString(A));
		rev(A);
		//System.out.println("Array A reversed: " + Arrays.toString(A));

	}//main
	static <T> void rev(T A[]){
		Stack <T> s = new Stack <>();
		for (int i = 0; i < A.length; i++) {
			s.push(A[i]);//pushes value of A at i onto stack
		}//for
		int i = 0;
		while(!s.isEmpty()) {
			A[i] = s.pop();	
			i++;
		}
		System.out.println("Array A reversed: " + Arrays.toString(A));
	}//rev
}//class main
