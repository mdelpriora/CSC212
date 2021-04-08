import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 *  Count and display all the lines where your find the word:
 *  "love" or "Love" or "LOVE".
 *   Display also the frequency. 
 *   Improve your program. 
 *   Can you find frequencies for more words and compare?
 */
public class Q2Gutenberg {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		List <String> A = new ArrayList<>();
		Scanner fin = null;
		try  {
			fin = new Scanner(new File("gutenberg.txt")); //finds 
			}//try
			catch (FileNotFoundException ex) { 
				System.out.print("gutenberg.txt not found"); 
				System.exit(1); 
			}//catch
			while (fin.hasNext()){ //check if end of file
				String s = fin.nextLine();
				A.add(s);
			}//while
			 
			String l = "love ";
			System.out.println("All ");
			int count = 0;
			for (int i = 0; i < A.size(); i++){ //check if end of file
				if((A.get(i).toLowerCase().contains(l))) {
					System.out.println(A.get(i) + "\t");
					count++;
				}//if
			}//for
			System.out.println();
			System.out.println("There are " + count + " lines that contain the word 'love'");
			
	}//main
}//class main
