/*
 * PRINT on the screen file: myints.txt.
 */
import java.io.*;
import java.util.*;
public class Q3read0 {
	public static void main(String[] args) {
		Scanner fin = null;
		try  {
			fin = new Scanner(new File("myints.txt")); 
		}
		catch (FileNotFoundException ex) { 
			System.out.print("myints.txt not found"); 
			System.exit(1); 
		}
		System.out.println("The contents of myints.txt is displayed below"); 
		while (fin.hasNext()){ //check if end of file
			String s = fin.nextLine();
			System.out.println(s);
		}//while
	}//main
}//class main
