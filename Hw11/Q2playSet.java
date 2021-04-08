/*
 * Write a program Play sets Use/explore Java Set class: See Set0.java. 
 * Optional: Use Generics. 
 * The user has 2 sets and performs all important operations on them. 
 * Use a menu
 */

import java.util.*;
public class Q2playSet {
	static Scanner in = new Scanner(System.in);
	public static void main (String [] args){
		System.out.println("Enter size of array A");
		int n1 = in.nextInt();
		System.out.println("Enter size of array B");
		int n2 = in.nextInt();
		Integer A[] = new Integer [n1];
	    Integer B[] =  new Integer [n2];;
		
		do {
			generate(A,n1);
			generate(B,n2);
			System.out.println("If you entered repeating numbers within an array you will have to re-enter");
		}
		while(!repeats(A) &&!repeats(B));
		Set <Integer> s1 = new HashSet<Integer>(Arrays.asList(A));
		Set <Integer> s2 = new HashSet<Integer>(Arrays.asList(B));
		char cont = 'y';
		do {
			System.out.println("\nPick one: " + "\n1.Display sets" + "\n2.Intersection" + "\n3.Union" + 
					"\n4.Remove elements of s2 from s1" + "\n5.Does s2 contain s1?");
					
			int op = in.nextInt();
			switch (op) {
			case 1: //display sets
				System.out.println("Set s1: " + s1);
				System.out.println("Set s2: " + s2);
				break;
			case 2://Intersection
				System.out.print(s1 + " intersection " + s2);
				s1.retainAll(s2);
				System.out.println(" = " + s1);
				s1 = new HashSet<Integer>(Arrays.asList(A));//reset s1
				break;
			case 3://union
				System.out.print(s1 + " union: " + s2);
				s1.addAll(s2);
				System.out.println(" = " + s1);
				s1 = new HashSet<Integer>(Arrays.asList(A));//reset s1
				break;
			case 4://subtract s2 from s1
				System.out.print(s1+ " - " + s2);
				s1.removeAll(s2);
				System.out.println(" = " + s1);
				s1 = new HashSet<Integer>(Arrays.asList(A));//reset s1
				break;
			case 5://does s2 contain s1
				System.out.println(s1 + " is a subset of " + s2 + "?: " + s2.containsAll(s1));
				break;
			case 0:System.out.println("Goodbye");
			}//switch
			System.out.println("\nDo you want to continue? y/n");
			cont = in.next().charAt(0);		
			}//do
			while (cont == 'y' || cont == 'Y');
			System.out.println("Goodbye");
	   }//main
	
	static void generate(Integer [] a, int n) {
		System.out.println("Enter " + n + " numbers, non repeating");
		for (int i = 0; i < a.length; i++) { //Loops though elements of a
			a[i] = in.nextInt(); //sets index of a
		} //for
	} //generate
	
	static boolean repeats(Integer [] a) {
		for (int i = 0; i < a.length; i++) { //Loops through all elements
			for (int j = i + 1; j < a.length; j++) { //Loops through remaining elements
				if (a[i] == a[j])
					return (false); //Repeating element found
			} //for
		} //for
		return (true);//No repeating elements
	} //repeats
}

