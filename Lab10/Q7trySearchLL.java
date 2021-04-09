/*
 * Compare search algorithms
 * Do linear search + binary search (with sorted list) on linked list
 * Generate arraylist of random ints
 * ask for n
 * sort it
 * find runtime 
 */

import java.io.*;
import java.util.*;
public class Q7trySearchLL {
	static Scanner in = new Scanner(System.in);
	public static void main (String [] args){
		int [] sizes = {100, 200, 400, 800, 1600, 3200, 6400};
		System.out.println("Size\tLinear\tBinary");
		for (int n : sizes) {
			System.out.print(n);
			trySearch(n);
		} //for
	} //main
	static void trySearch (int n) {
		long t1; //Start time
		long t2; //End time
		LinkedList <Integer> L = new LinkedList <> (); //New LinkedList
		generate(L, n);
		int w = (int) (Math.random() * 1000) + 1; //Random number 1-1000
		
		t1 = System.currentTimeMillis(); //Start time, linear
		linear(L, w);
		t2 = System.currentTimeMillis(); //End time, linear
		System.out.print("\t" + (t2-t1));
		
		Collections.sort(L);
		t1 =  System.currentTimeMillis(); //Start time, binary
		binary(L, w, 0, L.size() - 1);
		t2 =  System.currentTimeMillis(); //End time, binary
		System.out.println("\t" + (t2-t1));
	} //trySearch
	static void generate (LinkedList <Integer> L, int n) { //Fills array with random number 1-100
		for (int i = 0; i < n; i++) {
			L.add((int) (Math.random() * 1000) + 1); //Adds random number 1-1000
		} //for
	} //generate
	static boolean linear (LinkedList<Integer> L, int w) {
		for (int val : L) {
			if (val == w)
				return (true);
		} //for
		return (false);
	} //linearSearch
	static boolean binary(LinkedList <Integer> L, int w, int low, int high) {
		if (low > high)
			return (false);
		int m = (low + high) / 2;
		if (w == L.get(m))
			return (true);
		if (w < L.get(m))
			return (binary(L, w, low, m - 1));
		else
			return(binary(L, w, m + 1, high));
	} //binSearch
} //class