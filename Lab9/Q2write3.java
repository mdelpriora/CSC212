/*
 * Write numbers from the user in a file (myints.txt).
 * Stop when user inputs 0.
 */
import java.io.*;
import java.util.*;
public class Q2write3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PrintWriter fout = null;
		try {  
			fout = new PrintWriter("myints.txt");
		}
		catch (IOException ex) { 
			System.out.print(ex); 
		}
		int n = 1;
		while(n != 0) {
			System.out.println("Enter an integer to add to list myints.txt (0 = quit)");
			n = in.nextInt();
			if (n != 0) {
				fout.write(Integer.toString(n) + "\n");
			}//if
		}//while
		fout.close();
		System.out.println("Please check file myints.txt");
	}
}
