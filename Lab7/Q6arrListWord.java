/*
 * You have an array (ArrayList) of n=5 names.
 * Display a random name
 */
import java.util.*;
public class Q6arrListWord {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		List <String> L = new ArrayList <> (Arrays.asList("Aang","Sokka","Katara","Zuko","Toph"));
		print(L);
	
		
	}//main
	static void print(List<String> L) {//generate random matrix
		System.out.println("Press enter for a randomly generated ATLA gang member");
		in.nextLine();
		int i = (int)(Math.random()*5);
		System.out.println(L.get(i));
	}//generate
}//class
