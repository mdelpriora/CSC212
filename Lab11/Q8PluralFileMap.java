/*
 * Using the map data structure write a program that given a word displays its plural.
 * You read the exceptions from a file called "PluralExp.txt":
 * mouse mice
 * man men
 * knife knives
 * fish fish 
 * ...
 * Your program:
 * Enter a word in English? fox
 * Plural: fox foxes
 * Continue(y/n)?
 */

import java.io.*;
import java.util.*;
public class Q8PluralFileMap {
	static Scanner in = new Scanner(System.in);
	public static void main (String [] args){
		Scanner fin = null;
		try  {
			fin = new Scanner(new File("PluralExp.txt")); 
		}//try
		catch (FileNotFoundException ex) { 
			System.out.print(ex); 
		}//catch
		
		HashMap <String,String> H = new HashMap <String,String>();
		while (fin.hasNext()){
			String s = fin.nextLine();
			String [] A = s.split(",");
			H.put(A[0], A[1]);
		}//while
		System.out.println("Exceptions: " + H + " \nSize: " + H.size());
		System.out.println("Enter word to find plural");
		String s1 = in.nextLine();
		plural(s1,H);
	}
	static void plural(String k, HashMap <String,String> H) {
		if (H.containsKey(k)) {
			System.out.println( H.get(k));
		}
		else {
		System.out.println(((k.charAt(k.length()-1))==('x')||(k.charAt(k.length()-1))==('o')) ? (k + "es") : (k + "s"));
	
		}//else
	}
}
