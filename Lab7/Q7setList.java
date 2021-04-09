/*
 * Ask for two ArrayLists A and B with integers and ask the user to perform different set operations.
 *  When user enters values for A ad B the program makes sure there are no repeating elements
 */

import java.util.*;
public class Q7setList {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		
		List <Integer> A = new ArrayList <> ();
		List <Integer> B = new ArrayList <> ();	
		System.out.println("List A:");
		generate(A);
		System.out.println("List B:");
		generate(B);
		
		char cont = 'y';
		
		do {
			System.out.println("\nPick one: " + "\n1.Print" + "\n2.Print intersection" + "\n3.Print union" + "\n4.Print difference A-B" + "\n5.Check if disjoint" + "\n6.Check if A is included in B or B included in A" + "\n0.Exit");
			int op = in.nextInt();
			switch (op) {
			case 1: System.out.println("List A is: " + A);
					System.out.println("List B is: " + B);
				break;
			case 2: intersection(A,B);
				break;
			case 3: union(A,B);
				break;
			case 4: difference(A,B);
				break;
			case 5: if (disjoint(A,B) == true) {
						System.out.println("These lists are disjoint");
					}
					else {
						System.out.println("These lists are not disjoint");
					}
				break;
			case 6: if(included(A,B) == true) {
						System.out.print("List A is a subset of list B ");
					}
					else {
						System.out.print("List A is not a subset of list B ");
					}
					if(included(B,A) == true) {
						System.out.println("List B is a subset of list A ");
					}
					else {
						System.out.println("List B is not a subset of list A ");
			}
				break;
			case 0: System.out.println("Goodbye");	
		
			}
		System.out.println("\nDo you want to continue? y/n");
		cont = in.next().charAt(0);		
		}//do
		while (cont == 'y' || cont == 'Y');
		System.out.println("Goodbye");
	
	}//main
	
	static void generate(List<Integer> List) {//generate random matrix
		int n = 1;
		while(n != 0) {
			System.out.println("Enter a non repeated integer to add to list (0 = quit)");
			n = in.nextInt();
			if (!List.contains(n) && n!=0) {
				List.add(n);	
			}//if
			else if (List.contains(n) && n!=0){
			System.out.println("Enter a non repeated integer to add to list (0 = quit)");
			n = in.nextInt();
				if (!List.contains(n) && n!=0) {
					List.add(n);	
				}// if
			}//else if
		}//while		
	}//generate
	
	static void intersection(List<Integer> A, List<Integer> B) {
		List <Integer> R = new ArrayList<>();
		for (int i = 0; i < A.size()-1; i++) {
			if (A.contains(B.get(i))) {
				R.add(B.get(i));
			}//if
		}//for
		System.out.println("Intersection of A and B is: " + R);
	}//intersection
	
	static void union(List<Integer> A, List<Integer> B) {
		List <Integer> R = new ArrayList<>();
		for (int i = 0; i<A.size(); i++){
			R.add(A.get(i)); 
		}//add all elements of A to list R
		
		for (int j = 0; j<B.size(); j++){
			if (A.contains(B.get(j)) == false) //to avoid adding repeat elements
				R.add(B.get(j)); 
		}//add element from B if not in list A
		System.out.println("Union of A and B is: " + R);
	}//union
	
	static void difference(List<Integer> A, List<Integer> B) {
		List <Integer> R = new ArrayList<>();
		for (int i = 0; i < A.size(); i++) {
			if (!B.contains(A.get(i))) {
				R.add(A.get(i));
			}//if
		}//for
		for (int j = 0; j < B.size(); j++) {
			if(!A.contains(B.get(j))) {
				R.add(B.get(j));
			}//if
		}//for
		System.out.println("Difference of A and B is: " + R);
	}//difference
	
	static boolean disjoint(List<Integer> A, List<Integer> B) {
		for (int i = 0; i < A.size()-1; i++) {
			if(A.contains(B.get(i))) {
				return false;//is not disjoint
			}//if
		}//for
		return true;//is disjoint
	}//disjoint
	
	static boolean included (List<Integer> A, List<Integer> B) {
		for (int i = 0; i < A.size(); i++) {//runs through A
           if(!B.contains(A.get(i)))//if A(i) isn't in B it is false
                return false;
		}//for		
		return true;
	}//included
	
}//class
