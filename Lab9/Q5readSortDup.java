/*
 * Read a file (file is myints.txt) with numbers 
 * and display them sorted without duplicates.
 * Count duplicates. 
 */
import java.io.*;
import java.util.*;
public class Q5readSortDup {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Scanner fin = null;
		
		System.out.println("Enter file name you are looking for");
		String file = in.nextLine();
		try  {
			fin = new Scanner(new File(file)); 
		}//try
		catch (FileNotFoundException ex) { 
			System.out.print(file + "not found"); 
			System.exit(1); 
		}//catch
		List <Integer> A = new ArrayList<>();
		System.out.println("Contents of " + file + " are displayed below"); 
		while (fin.hasNext()){ //check if end of file
			String s = fin.nextLine();
			int n = Integer.parseInt(s);
			A.add(n);
		}//while
		sort(A);
		duplicate(A);
	
	}//main
	static void sort(List <Integer> A) {
		int hold; //temp variable to help switch
        boolean change = true;
        while (change){
            change = false;
            //V.set(index,w)
            for (int i = 0; i < A.size() - 1; i++){
                if (A.get(i) > A.get(i+1)) {
                    hold = A.get(i);
                    A.set(i, A.get(i+1));
                    A.set(i+1, hold);
                    change = true;
                } //else change = false;
            }//for
        }//while   
        System.out.println(A);
	}//sort
	
	static void duplicate(List <Integer> A) {
		int d = 0;// duplicates
		for(int i = 0; i < A.size() - 1; i++){
			if (A.get(i) == A.get(i+1)) {
				d++;
			}//if
		}//for
		System.out.println("There are " + d + " duplciates");
		
	}//duplicate
	

}//class main
