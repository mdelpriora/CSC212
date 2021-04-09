/*
 * Check if an array of integers of constant size n=5 is a palindrome.
 */
import java.util.*;
public class Q4palindrome {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		
		int [] A = new int [5];//array
		int [] B = new int [5];//reversed
		
		System.out.println("Enter 5 elements then press enter");
	
		for (int i = 0; i < 5; i++) {
			A[i] = in.nextInt();
			B[4-i]= A[i];
		}
		
		System.out.println("Your array:  " + Arrays.toString(A));
		System.out.println("Your array reversed:  " + Arrays.toString(B));
		
		if(Arrays.equals(A, B)) {
			System.out.println("This array is a palindrome");
		}
		else {
			System.out.println("This array is not a palindrome");
			}
		}
}
