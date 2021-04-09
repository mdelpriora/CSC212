/*
 * Ask the user for an even list of integers 
 * check if it is a palindrome using a Stack.
 */
import java.io.*;
import java.util.*;
public class Q4palinStack {
	static Scanner in = new Scanner(System.in);
	public static void main (String [] args){
		ArrayList <Integer> A = new ArrayList <> ();
		generate(A);
		pal(A);
		
	}//main
	static void generate(ArrayList <Integer> L) {
		int n;
		do {
		System.out.println("Enter how many integers (even amount)");
		n = in.nextInt();
		}
		while(n % 2 !=0);
		System.out.println("Enter " + n + " integers");
		for(int i = 0; i < n; i++) {
			int num = in.nextInt();
			L.add(num);
		}//for
	}//generate
	
	static void pal(ArrayList <Integer> L){
		ArrayList<Integer> L2 = (ArrayList<Integer>)L.clone();
		Stack <Integer> s = new Stack <>();
		for (int i = 0; i < L2.size(); i++) {
			s.push(L2.get(i));//pushes value of L at i onto stack
		}//for
		int i = 0;
		while(!s.isEmpty()) {
			L2.set(i,s.pop());
			i++;
		}//while	
		
		if(L.equals(L2)) {
			System.out.println(L + " is a palindrome");
		}
		else {
			System.out.println(L + " is not a palindrome");
		}
	}//pal	
}//Clsss main
