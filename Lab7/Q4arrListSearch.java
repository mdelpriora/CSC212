/*
 * Generate an ArrayList n = 5 filled with random ints in [1,20]. 
 * Ask user to enter a number and the program should return -1 if not found,
 * if found display the position and delete it!.
 */
import java.util.*;
public class Q4arrListSearch {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		List <Integer> L = new ArrayList <> ();
		List <Integer> L2 = new ArrayList <> (L);
		generate(L);
		repeat(L);
		
		
	}//main
	static void generate(List<Integer> L) {//generate random matrix
		for(int i = 0; i < 5; i++) {
			int v = (int)(Math.random()*20);
			L.add(v);
		}//for
		System.out.println(L);
	}//generate
	static void repeat(List<Integer> L) {
	//find way to keep original indices before listing
		int count = 0;
		System.out.println("Enter a number to search for");
		int n = in.nextInt();
		
		for(int i = 0; i < L.size();i++) {
			if (L.indexOf(n) != -1) {	
				count++;
				if(L.indexOf(n) == 0) {
					System.out.println("Index of " + n + ": " + (L.indexOf(n)));
					int remove = L.remove(L.indexOf(n));
					System.out.println("Number removed: " + remove);
				}//if
				else {
					System.out.println("Index of " + n + ": " + (L.indexOf(n)+count-1));
					int remove = L.remove(L.indexOf(n));
					System.out.println("Number removed: " + remove);
				}
			}//if	
		}//for
		System.out.println("New list: " + L);
	}//repeat
}//class
