/*
 * Compare sorting algorithms on the same data structure
 * Generate a LinkedList of random ints (ask for size n) and sort it. 
 * Record runtime in a Spreadsheet table
 * 
 * CONTAINS BOTH LINKED LIST AND ARRAY
 * (Q8 and Q9)
 */

import java.util.*;
public class Q8trySortLL {
	static Scanner in = new Scanner(System.in);
	public static void main (String [] args){
		LinkedList <Integer> L = new LinkedList <> ();
		ArrayList <Integer> A = new ArrayList <> ();
		int [] sizes = {10, 20, 40, 80, 160, 320, 640, 1280};
		System.out.println("Linked List\nSize\tBubble\tInsert\tJava\tMerge");
		for (int n : sizes) {
			System.out.print(n);
			generate(L, A, n);
			trySortLL(L, n);
		} //for
		System.out.println();
		System.out.println("ArrayList\nSize\tBubble\tInsert\tJava\tMerge");
		for (int n : sizes) {
			System.out.print(n);
			trySortArr(A, n);
		} //for
	} //main
	static void trySortLL (LinkedList <Integer> L1, int n) {
		LinkedList L = new LinkedList <Integer> (L1);//makes a copy of original
		long t1; //Start time
		long t2; //End time
		t1 = System.currentTimeMillis(); //Start time, bubble
		bubble(L, n);
		t2 = System.currentTimeMillis(); //End time, bubble
		System.out.print("\t" + (t2-t1));
		L = new LinkedList <Integer> (L);//makes a copy of original
		t1 =  System.currentTimeMillis(); //Start time, insert
		insert(L, n);
		t2 =  System.currentTimeMillis(); //End time, insert
		System.out.print("\t" + (t2-t1));
		L = new LinkedList <Integer > (L);//makes a copy of original
		t1 = System.currentTimeMillis(); //Start time, java
		Collections.sort(L);
		t2 = System.currentTimeMillis(); //End time, java
		System.out.print("\t" + (t2-t1));
		L = new LinkedList <Integer > (L);//makes a copy of original
		t1 =  System.currentTimeMillis(); //Start time, merge
		mergeL(L);
		t2 =  System.currentTimeMillis(); //End time, merge
		System.out.println("\t" + (t2-t1));
	} //trySearchLL
	static void trySortArr (ArrayList <Integer> A, int n) {
		ArrayList A1 = new ArrayList <Integer> (A);//makes a copy of original
		long t1; //Start time
		long t2; //End time
		t1 = System.currentTimeMillis(); //Start time, bubble
		bubble(A1, n);
		t2 = System.currentTimeMillis(); //End time, bubble
		System.out.print("\t" + (t2-t1));
		A1 = new ArrayList <Integer> (A);//makes a copy of original
		t1 =  System.currentTimeMillis(); //Start time, insert
		insert(A, n);
		t2 =  System.currentTimeMillis(); //End time, insert
		System.out.print("\t" + (t2-t1));
		A1 = new ArrayList <Integer > (A);//makes a copy of original
		t1 = System.currentTimeMillis(); //Start time, java
		Collections.sort(A1);//java sort
		t2 = System.currentTimeMillis(); //End time, java
		System.out.print("\t" + (t2-t1));
		A1 = new ArrayList <Integer > (A);//makes a copy of original
		t1 =  System.currentTimeMillis(); //Start time, merge
		mergeA(A1);
		t2 =  System.currentTimeMillis(); //End time, merge
		System.out.println("\t" + (t2-t1));
	} //trySearchArr
	static void generate (LinkedList <Integer> L, ArrayList <Integer> A, int n) { //Fills array with random number 1-100
		for (int i = 0; i < n; i++) {
			int x = (int) (Math.random() * 100) + 1;
			L.add(x);
			A.add(x);
		} //for
	} //generate
	static void bubble (List L, int n) { //Bubble sort
		int temp;
		boolean change = true;
		while (change) {//Prevents excessive looping
			change = false;
			for (int i = 0; i < n-1; i++) {
				if ((int) L.get(i) > (int) L.get(i+1)) {//If out of order, swaps elements 
					temp = (int) L.get(i);
					L.set(i, L.get(i+1));
					L.set(i+1, temp);
					change = true; 
				} //if
			} //for
		} //while
	} //bubble
	static void insert(List<Integer> L, int n) {//Insertion sort
		for (int j = 1; j < n; j++) { 
            int val = L.get(j); 
            int i = j-1; 
            while (i > -1 && L.get(i) > val) { 
                L.set(i+1, L.get(i)); 
                i--; 
            } //while
            L.set(i+1, val); 
        } //for
	} //insert
	static List <Integer> mergeL(List <Integer> L) { //From week 7 on website
		List <Integer> L1 = new LinkedList<Integer> ();
		List <Integer> L2 = new LinkedList<Integer> ();// divide L in two lists
		if ( L.size() == 1) return L; //Base case
		else {
			int m = L.size() / 2; //divide L in 2 parts L1 and L2
			for (int i = 0; i < m; i++)         {  L1.add(L.get(i)); }
			for (int i = m; i < L.size(); i++)  {  L2.add(L.get(i)); }
			return interLeaveL(L, mergeL(L1),mergeL(L2));
		}//if
	}//mergeL
	static List <Integer> interLeaveL(List <Integer> L, List <Integer> L1, List <Integer> L2) {
		L = new LinkedList <Integer> (); 
		int i = 0, j = 0; //i iterator for L1 ; j  for L2
		//take one item from each, compare and put smallest in result R
		while (i < L1.size() && j < L2.size()) {
			if ( L1.get(i) < L2.get(j) ) {
					L.add(L1.get(i)); 
					i++; //put the smallest in Result and look forward in V1
			}
			else { 	L.add(L2.get(j));    
					j++; // and change position - go further
			}
		}//while
		while ( i < L1.size() ) { L.add(L1.get(i)); i++;} // copy rest of V1 if left
		while ( j < L2.size() ) { L.add(L2.get(j)); j++; } // copy rest of V2 if left in R
		return L;
	}// interLeaveL
	static List <Integer> mergeA(List <Integer> L) {
		List <Integer> L1 = new ArrayList<Integer> ();
		List <Integer> L2 = new ArrayList<Integer> ();// divide L in two lists
		if ( L.size() == 1) return L; //Base case
		else {
			int m = L.size() / 2; //divide L in 2 parts L1 and L2
			for (int i = 0; i < m; i++)         {  L1.add(L.get(i)); }
			for (int i = m; i < L.size(); i++)  {  L2.add(L.get(i)); }
			return interLeaveA(L, mergeA(L1),mergeA(L2));
		}//if
	}//mergeA
	static List <Integer> interLeaveA(List <Integer> L, List <Integer> L1, List <Integer> L2) {
		L = new ArrayList <Integer> (); 
		int i = 0, j = 0; //i iterator for L1 ; j  for L2
		//take one item from each, compare and put smallest in result R
		while (i < L1.size() && j < L2.size()) {
			if ( L1.get(i) < L2.get(j) ) {
					L.add(L1.get(i)); 
					i++; //put the smallest in Result and look forward in V1
			}
			else { 	L.add(L2.get(j));    
					j++; // and change position - go further
			}
		}//while
		while ( i < L1.size() ) { L.add(L1.get(i)); i++;} // copy rest of V1 if left
		while ( j < L2.size() ) { L.add(L2.get(j)); j++; } // copy rest of V2 if left in R
		return L;
	}// interLeaveA
} //class