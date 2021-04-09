/*
 * Perform tests on sorting an array using a binary sorting tree
 * Compare running time with whatever sort your wish 
 * (bubble sort, insert sort).
 */
import java.util.*;
public class Q6BinSortTreeTest {
	public static void main(String [] args){ 
		int n = 1000000; //Number of elements
		ArrayList <Integer> A =  new ArrayList <> ();
		generate(A, n);	
		Collections.shuffle(A); //Shuffles elements
		ArrayList <Integer> A1 = new ArrayList <Integer> (A);//Copy of A
		//System.out.println(A); 
		long T1 = System.currentTimeMillis(); //Start time, tree
		Nodes root = new Nodes(A.get(0)); //Builds binary sorting tree
		for (int i = 1 ; i < A.size() ; i++){
			 root.createNode(A.get(i));
		} //for
		long T2 = System.currentTimeMillis(); //End time, tree
 		//System.out.println("Print tree inOrder(LNR): "); 	
		//root.inOrder();
		System.out.println("Running Time Tree: " + (T2-T1)); //Time, tree sort
		T1 = System.currentTimeMillis();  //Start time, java
		Collections.sort(A1); //Java sort
		T2 = System.currentTimeMillis(); //End time, java
		//System.out.println("Java Sort: " + A1); 
		System.out.print("Running Time Java: " + (T2-T1)); //Time, java sort
	}//main
	static void generate( ArrayList <Integer> A, int n){ //n =size array
		for (int i = 0 ; i < n ; i++){
			 A.add(i,i + 1);
		} 
		Collections.shuffle(A);	
	}//generate
}//class
