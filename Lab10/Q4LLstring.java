/*
 * Copy words from an Array into a LinkedList.
 * Choose some operations.
 * Sort and print it
 */

import java.io.*;
import java.util.*;
public class Q4LLstring {
	static public void main (String [] args){
		List <String> A = new ArrayList<>(Arrays.asList("mouse","shark","dog","cat"));
		LinkedList <String> L1 = new LinkedList <>();
		for (int i = 0; i < A.size(); i++) {
			L1.add(A.get(i));
		}
		System.out.println("Linked list L: " + L1);
		
		L1.remove(0);
		System.out.println("L with first value removed: " + L1);
		
		L1.set(0, "otter");
		System.out.println("L with first value set as otter: " + L1);
		
		Collections.sort(L1);
		System.out.println("New L sorted by name: " + L1);
	}
}
