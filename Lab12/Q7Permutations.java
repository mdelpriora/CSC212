/*
 * For a random given array
 * try different permutations of the initial arrays
 * see how the tree changes as height (display height).
 */
import java.util.*;
public class Q7Permutations {
	static Scanner in = new Scanner(System.in);
	public static void main(String [] args){ 
		ArrayList <Integer> A = new ArrayList<>();
		int n, s, e;
		do {
			System.out.print("Enter n: ");
			n = in.nextInt(); //Length
			System.out.print("Enter start number: ");
			s = in.nextInt(); //Start number
			System.out.print("Enter end number: ");
			e = in.nextInt() + 1; //End number
		} while (e - s < n); //Makes sure range is smaller than n 
		generate(A, n, s, e);
		
		for (int j = 0; j < 10; j++) { //Tests 10 version
			Collections.shuffle(A); //Shuffles array
			System.out.print(A); //Prints version
			Nodes root = new Nodes(A.get(0)); 
			for (int i = 1; i < n; i++) { //Builds tree
				root.createNode(A.get(i));
			} //for
			System.out.println("\tHeight: " + height(root)); //Displays height
		} //for
	}//main
	static void generate (ArrayList<Integer> A, int n, int s, int e) { //Length n, range (s, e), no repeats
		int num = 0;
		do {
			num = (int) (Math.random() * (e-s)) + s;//creates range of numbers between e and s
			if (!A.contains(num)) //Prevents repeats
				A.add(num);//Adds unique element
		} while (A.size() < n);//ends when reached length n
	} //generate
	
	static int height (Nodes m) {
		int h = 0;
		if (m.left == null && m.right == null)
			return 0;
		else if (m.left == null) //right is defined
			h = height(m.right) + 1;
		else if (m.right == null) //left is defined
			h = height(m.left) + 1;
		else 
			h = Math.max(height(m.right),height(m.left)) + 1;
		return h;
	}//height
 } //class