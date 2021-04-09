/*
 * Write a program that asks the user to input integers until you type 0 and then prints a menu with the following options: 
 * Print array and its size, maximum and quit(0). 
 */
import java.util.*;
public class Q3maxMenu {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		List <Integer> L = new ArrayList <> ();
		char cont = 'y';
		int n = 1;	
		
		while(n != 0) {
			System.out.println("Enter an integer to add to list L (0 = quit)");
			n = in.nextInt();
			if (n != 0) {
			L.add(n);	
			}
		}//while
		
		do {
			System.out.println("\nPick one: " + "\n1.Print" + "\n2.Print maximum" + "\n0.Exit");
			int op = in.nextInt();
			switch (op) {
			case 1: System.out.println("Your list is: " + L);
					System.out.println("List length: " + L.size());
				break;
			case 2: max(L);
				break;
			case 0: System.out.println("Goodbye");	
		
			}
		System.out.println("\nDo you want to continue? y/n");
		cont = in.next().charAt(0);		
		}//do
		while (cont == 'y' || cont == 'Y');
		System.out.println("Goodbye");
	
	}//main
	static void max(List<Integer> L) {
		Collections.sort(L);
		int max = L.get(L.size()-1);
		//int maxi = Collections.max(L);
		System.out.println("Your sorted list is: " + L);
		System.out.println("The max integer in this list is: " + max);
	}//max
}//class
