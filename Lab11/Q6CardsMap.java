/*
 * Write a program using maps where you have a map of all card names and their internal representation.
 * Use it in displaying a random card with its full name.
 */
import java.util.*;
public class Q6CardsMap {
	static Scanner in = new Scanner(System.in);
	final static String face[] = {"one","two","three","four","five","six",
			"seven","eight","nine","jack","queen","king"};//array
	final static Character f []= {'1','2','3','4','5','6','7','8','9','j','q','k'};//array	
	public static void main (String [] args){
		HashMap <Character,String> H = new HashMap <Character,String>();
		
		for (int i = 0; i < face.length; i++) {
			H.put(f[i], face[i]);//put is equivalent to adding
			//makes pair and puts into hash map
			//mix of key and value - puts (key,variable)
		}
		System.out.println("Map: " + H + " \nSize: " + H.size());
		System.out.println("Enter card abbreviation to find association");
		char n = Character.toLowerCase(in.next().charAt(0));
	
		if(H.get(n) != null) {
			System.out.println("Card " + n + ": "+ H.get(n));
		}
		else {
			System.out.println("You did not enter a valid card abbreviation");
		}
	}//main
}//class main
