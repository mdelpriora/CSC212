/*
 * Read and print an array of n = 5 integers and find its minimum.
 */
import java.util.*;
public class Q8arrayMin {
	static Scanner in=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter  5 elements");
		double [] array = new double [5];
		generate(array);
		Arrays.sort(array);
		System.out.println("Your array is: " +  Arrays.toString(array));
		System.out.println("The minimum in this array is: " + array[0]);
	}
	static void generate(double [] array) {//creates array
		for (int i = 0; i <array.length; i++) {
			array[i] = in.nextInt();
		}
	}
}
