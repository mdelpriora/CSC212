/*
 * Ask the user for a list of names and print them in reverse
 * af(Mia D)
 */
import java.util.*;
import java.util.Stack;
public class Q3revNames {
	static Scanner in = new Scanner(System.in);
	public static void main (String [] args){	
		List <String> L = new ArrayList <> ();
		generate(L);
		System.out.println("Array A: " + L);
		rev(L);
		System.out.println("Array A reversed: " + L );

	}//main
	static void rev(List <String> A){
		Stack <String> s = new Stack <>();
		for (int i = 0; i < A.size(); i++) {
			s.push(A.get(i));//pushes value of A at i onto stack
		}//for
		
		int i = 0;
		while(!s.isEmpty()) {
			A.set(i,s.pop());
			i++;
		}
	}//rev
	static void generate(List <String> L ) {
		System.out.println("How many names do you want to enter?");
		int n = in.nextInt();
		System.out.println("Enter " + n + " names");
		for (int i = 0; i < n; i++) {
			String name = in.nextLine();
			L.add(name);
		}//for
	}//generate
}//class main
