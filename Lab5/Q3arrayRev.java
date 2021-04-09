/*
 * An array of doubles size 5 is given in your program. 
 * Print it and print it in reverse order.
 */
import java.util.*;
public class Q3arrayRev {
	public static void main(String[] args) {
		double [] array = new double [5];
		generate(array);
		System.out.println("The array is: " + Arrays.toString(array));
		System.out.println("The array backwards is: ");
		for (int i = array.length-1; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}
	}
	static void generate(double [] array) {//creates array
		for (int i = 0; i <array.length; i++) {
			array[i] = Math.random()*10;
		}
	}
}
