/*
 * copy ints from an array into a linked list. 
 * Try LL operations:
 * remove() and L.set(int index, w)
 * sort it and print it
 */

import java.io.*;
import java.util.*;
public class Q3LLint {
	static public void main (String [] args){
		List <Integer> A = new ArrayList<>(Arrays.asList(10,20,50,40,90,80));
		LinkedList <Integer> L1 = new LinkedList <>();
		for (int i = 0; i < A.size(); i++) {
			L1.add(A.get(i));
		}
		System.out.println("Linked list L: " + L1);
		
		L1.remove(0);
		System.out.println("L with first value removed: " + L1);
		
		L1.set(0, 1000);
		System.out.println("L with first value set as 1000: " + L1);
		
		Collections.sort(L1);
		System.out.println("New L sorted: " + L1);
	}//main
}//class main
