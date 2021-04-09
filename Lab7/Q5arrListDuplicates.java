/*
 * Generate an ArrayList n = 7 filled with digits. 
 * Display if the array has duplicates or not. 
 * If duplicates display them.
 */

import java.util.*;
public class Q5arrListDuplicates {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		List <Integer> L = new ArrayList <> ();
		
		generate(L);
		duplicates(L);
		
	}//main
	static void generate(List<Integer> L) {//generate random matrix
		for(int i = 0; i < 7; i++) {
			int v = (int)(Math.random()*20);
			L.add(v);
		}//for
		System.out.println("Your list is " + L);
	}//generate
	
	static void duplicates(List<Integer> L) {
		List <Integer> L2 = new ArrayList <> ();
		boolean f = true;
		for (int i = 0; i < L.size(); i++) {
			for(int j = i+1; j < L.size(); j++) 
				if(L.get(i) == L.get(j)) {
					int v = L.get(i);
					int first = L.indexOf(v);
					L2.add(L.get(first));
					f = false; //found repeating elements
				}//if
		}//for
		
		if (f == false) {
			System.out.println("This list contains the following duplicates:");
			System.out.println(L2);
		}//if
		else {
			System.out.println("This list does not contain duplicates");
		}//else if
	}//duplicates
}

