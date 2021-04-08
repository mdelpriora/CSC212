/*
 * Choose a game using an array of numbers. Send me YOUR Version of a game. 
 * See below two possible ideas.
 */
import java.util.*;
public class Q3gameArray {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		//lottery
		int cont = 'y';
	
	do {
		System.out.println("Pick one: " + "\n1.Directions" + "\n2.Game" + "\n3.Exit");
		int op = in.nextInt();
		
		switch(op) {
		case 1: 
			System.out.println("Six balls are randomly selected, each labeled with a number between 0 and 50");
			System.out.println("You will enter six numbers and if they match the numbers of the six balls, you win"); 
			break;
		case 2: 
			System.out.println("Enter 6 integers between 0 and 50");
			game();
			break;
		case 3: System.out.println("Goodbye");
			break;
		default: System.out.println("You did not enter a valid option");
	
		}//switch
		System.out.println("Do you want to continue? y/n");
		cont = in.next().charAt(0);	
	}//do
	while (cont == 'y' || cont =='Y');
	
	System.out.println("Goodbye");
	}//main
	static void game(){
		int [] lottery = new int [6];
		lot(lottery);
		Arrays.sort(lottery);
		
		int [] A = new int [6];
		generate(A);
		Arrays.sort(A);
		
		if(Arrays.equals(A, lottery)) {
			System.out.println("YOU WON THE LOTTERY");
		}
		else {
			System.out.println("You did not win the lottery");
		}
	}
	static void generate(int [] Array) {
		for (int i = 0; i <Array.length; i++) {
			Array[i] = (int)(Math.random()*50);
		}//for
	}//generate
	static void lot(int [] Array) {
		for (int i = 0; i <Array.length; i++) {
			Array[i] = in.nextInt();
		}//for
	}//generate
}
