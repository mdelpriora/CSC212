/*
 * You have the file myints.txt (with random ints).
 * Ask the user for the filename and 
 * print on the screen only the primes numbers.
 */

import java.io.*;
import java.util.*;
public class Q4prime {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Scanner fin = null;
		
		System.out.println("Enter file name you are looking for");
		String file = in.nextLine();
		try  {
			fin = new Scanner(new File(file)); 
		}
		catch (FileNotFoundException ex) { 
			System.out.print(file + "not found"); 
			System.exit(1); 
		}
		System.out.println("The prime numbers in " + file + " are displayed below"); 
		while ( fin.hasNext() ){ //check if end of file
			String s = fin.nextLine();
			int n = Integer.parseInt(s);
			if(prime(n))
				System.out.println(s);
			
		}//while
	}//main
	
	static boolean prime(int n) {
		if(n == 2) return true;
		if (n % 2 == 0) return false; //check if even
		for (int i = 3; i < Math.sqrt(n) ; i = i + 2) {
			if (n % i == 0) return false; //Found factor: Not prime
		}//for
		return true;
	}//prime
}//class main
