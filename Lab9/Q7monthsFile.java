/*
 * Read 2 files jan.txt and feb.txt with expenses regarding n=3 items.
 * Put all the information in just one file called "expenses.txt" 
 * File names are in an Array: String [] Files= {"jan.txt","feb.txt"};
 * Design the program in such a way that you can add more months and the program works.
 */

import java.io.*;
import java.util.*;
public class Q7monthsFile {
	static Scanner in = new Scanner(System.in);
	static Scanner fin = null;
	static PrintWriter fout = null;
	public static void main(String[] args) {
	
		int n = 3;
		String [] Files= {"jan.txt","feb.txt"};
		
		char cont = 'y';
		do {
			System.out.println("\nPick one: " + "\n1.Read files" + "\n2.Add a file" + "\n0.Exit");
			int op = in.nextInt();
			switch (op) {
			case 1:	read();//prints list
				break;
			case 2: add();//adds friend to list
				break;
			case 0: System.out.println("Goodbye");	
			
			}
		System.out.println("\nDo you want to continue? y/n");
		cont = in.next().charAt(0);		
		}//do
		while (cont == 'y' || cont == 'Y');
		System.out.println("Goodbye");
		expense();
	}//main
	public static void read() {
		System.out.println("What month do you want to look at? (jan.txt,feb.txt etc)");
		String filename = in.next().toLowerCase();
		try  {
			fin = new Scanner(new File(filename)); //finds 
			}//try
			catch (FileNotFoundException ex) { 
				System.out.print(filename + " not found"); 
				System.exit(1); 
			}//catch
			while (fin.hasNext()){ //check if end of file
				String s = fin.nextLine();
				System.out.println(s);
			}//while
	}//read
	public static void add() {
		System.out.println("Enter new filename");
		String filename = in.next().toLowerCase();
		try  {
			fout = new PrintWriter(filename + ".txt");//adds to
		}//try
		catch (IOException ex) { 
			System.out.print(ex);  
		}//catch
		for(int i = 0; i < 3; i++){
            System.out.print("Enter the expense dollar value: ");
            float exp = in.nextFloat();
            fout.write(exp + "\n");
        }//for
        fout.close();
	}//add
	
	public static void expense() {
		int cont = 'y';
		do {
		System.out.print("Enter the file you want to add to expenses.txt: ");
        String filename = in.next();
        try{
            fin = new Scanner(new File(filename + ".txt"));
        }catch(FileNotFoundException ex){
            System.out.println(ex);
        }
        while(fin.hasNext()){
            float f = fin.nextFloat();
            fout.write(f + "\n");
        }
        System.out.print("Add another file to expenses.txt? (y/n): ");
        cont = in.next().charAt(0);
    
		}
		while (cont == 'y' || cont == 'Y');
    System.out.print("Now printing expenses.txt...");
    try{
        fin = new Scanner(new File("expenses.txt"));
    }catch(FileNotFoundException ex){
        System.out.println(ex);
    }
    while(fin.hasNext()){
        Float s = fin.nextFloat();
        System.out.println(s + " ");
    }
    System.out.print("End of File.");
    fout.close();
		
		
	}//expense
}//class main
