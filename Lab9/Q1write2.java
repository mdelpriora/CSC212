/*
 * WRITE in a file: myints.txt, n random integers between 0 and 100. 
 * Ask for n.
 */
import java.io.*;
import java.util.*;
public class Q1write2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PrintWriter fout = null;
		try { 
			File ff = new File("myints.txt");
			if(ff.createNewFile()) {
				System.out.println("File created: " + ff.getName());
			}//if
			else {
				System.out.println("File already exists.");//System.exit(1);
				fout = new PrintWriter(ff);
			}//else
		}//try
		catch (IOException ex) { 
			System.out.print(ex); 
		}//catch
		System.out.println("Enter how many integer you want");
		int n = in.nextInt();
		for (int i = 0; i < n ; i++){
			//fout.write(Integer.toString(i * 10) + "\n");
			fout.write(Integer.toString((int)(Math.random()*100)) + "\n");
		}
		fout.close();
		System.out.println("Please check file myints.txt");
	}//main
}//class main
