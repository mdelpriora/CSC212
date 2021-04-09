/*
 * Write a program using maps where you load file "states.txt"
 * with state information as:
 * NH,New Hampshire,Manchester
 * MA,Massachusetts,Boston
 * VT,Vermont,Montpelier
 * 
 * Ask for code and display state name-capital
 */
import java.io.*;
import java.util.*;
public class Q7StatesFileMap {
	static Scanner in = new Scanner(System.in);
	public static void main (String [] args){
		Scanner fin = null;
		try  {
			fin = new Scanner(new File("states.txt")); 
		}//try
		catch (FileNotFoundException ex) { 
			System.out.print(ex); 
		}//catch
		
		HashMap <String,String> H = new HashMap <String,String>();
		while (fin.hasNext()){
			String s = fin.nextLine();
			String [] A = s.split(",");
			H.put(A[0], A[1] + " - " + A[2]);
		}
		fin.close();
		System.out.println("Map: " + H + " \nSize: " + H.size());
		System.out.println("Enter state abbreviation to find name and capital ");
		String n = in.nextLine().toUpperCase();
		
		if(H.get(n) != null) {
			System.out.println("Card " + n + ": "+ H.get(n));
		}
		else {
			System.out.println("You did not enter a valid state abbreviation");
		}
	}
}
