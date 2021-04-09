/*
 * Generate a random array of n integers in a certain range(start,end) without repeats.
 * You will use this for tests in sorting
 * Use: Collections.shuffle(ArrList)
 */

import java.util.*;
public class Q4genArraySet {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		ArrayList <Integer> A = new ArrayList<>();
		int n, s, e;
		do {
			System.out.print("Enter n: ");
			n = in.nextInt(); //Length
			System.out.print("Enter start number: ");
			s = in.nextInt(); //Start number
			System.out.print("Enter end number: ");
			e = in.nextInt() + 1; //End number
		} while (e - s < n); //Makes sure range is smaller than n 
		generate(A, n, s, e);
		System.out.println(A);
	} //main
	static void generate (ArrayList<Integer> A, int n, int s, int e) { //Length n, range (s, e), no repeats
		int num = 0;
		do {
			num = (int) (Math.random() * (e-s)) + s;//creates range of numbers between e and s
			if (!A.contains(num)) //Prevents repeats
				A.add(num);//Adds unique element
		} while (A.size() < n);//ends when reached length n
	} //generate
} //class
	
