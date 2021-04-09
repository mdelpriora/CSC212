/*
 * Read a text file (names.txt) and 
 * add all words in a LinkedList then sort them
 */
import java.io.*;
import java.util.*;
public class Q5LLfile {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Scanner fin = null;
		LinkedList <String> L = new LinkedList <>();
	
		String file = "animals.txt";
		
		try  {
			fin = new Scanner(new File(file)); 
		}//try
		catch (FileNotFoundException ex) { 
			System.out.print(file + " not found"); 
			System.exit(1); 
		}//catch
		
		while (fin.hasNext()){
			L.add(fin.nextLine());
		}
		fin.close();
		
		System.out.println(L);
	}//main
}//class main
