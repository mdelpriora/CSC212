/*
 *  Player has: first name, last name and points (int points).
 *  Use a menu. Read data from file "players.csv".
 *  Prepare the file first: start from an excel file: "players.xlsx" 
 *  and save it as *.csv.
 *  MENU:
Display players and points 
How many players
List all your players with names starting with a specific letter. Ex: "M"
Display players sorted by Points
SEARCH. Find a player with a certain name.
Filter // Display only players that have certain points (>= 100) and add them to a new file called: playersSelected.txt
Imagine another question
 */

import java.io.*;
import java.util.*;
public class Q1players {
	static Scanner in = new Scanner(System.in);
	static Scanner fin = null;
	public static void main(String[] args) {
		List <player> A = new ArrayList<>();
		Scanner fin = null;
		try  {
			fin = new Scanner(new File("Players.csv")); //finds 
			}//try
			catch (FileNotFoundException ex) { 
				System.out.print("Players.csv not found"); 
				System.exit(1); 
			}//catch
			while (fin.hasNext()){ //check if end of file
				String s = fin.nextLine();
				String [] list = s.split(",");
				String n = list[0];
				String l = list[1];
				int p = Integer.parseInt(list[2]);
				player x = new player(n,l,p);
				A.add(x);
			}//while
			//split string by comma
			//HAVE TO PUT FILE IN SAME PLACE CODE IS RUNNING---SEE CONSOLE
		char cont = 'y';

		do {
			System.out.println("\nPick one: " + "\n1.Display players and points " + "\n2.Display how many players there are" + "\n3.List all  players with names starting with a specific letter" + "\n4.Display players sorted by points." + "\n5.Find a player with a certain name" + "\n6.Filter players based on points" + "\n0.Exit");
			int op = in.nextInt();
			switch (op) {
			case 1:	display(A);//shoes list
				break;
			case 2: number(A);//number of players
				break;
			case 3: list(A);//list players with starting letter
				break;
			case 4: sortpoints(A);//sorts players by point
				break;
			case 5: search(A);//find player with certain name
				break;
			case 6: filter(A);//outputs players with > certain # of points
				break;
			case 0: System.out.println("Goodbye");	
		
			}
		System.out.println("\nDo you want to continue? y/n");
		cont = in.next().charAt(0);		
		}//do
		while (cont == 'y' || cont == 'Y');
		System.out.println("Goodbye");
				
	}//main
	
	public static void display(List <player> A) {
		System.out.println(A);
	}//display
	
	public static void number(List <player> A) {
		int count = 0;
		for (int i = 0; i < A.size(); i++){ //check if end of file
			count++;
		}//while
		System.out.println("There are " + count + " players in this file"); 
	}//number
	
	public static void list(List <player> A) {
		System.out.println("Enter first letter of first name to find players whos names strt with given letter"); 
		char c = Character.toUpperCase(in.next().charAt(0));
		System.out.println("The following player's names start with " + c);
		for (int i = 0; i < A.size(); i++){ //check if end of file
			if(c == A.get(i).getname().charAt(0)) {
				System.out.println(A.get(i));
			}	
		}//while
	}//list
	
	static void sortpoints(List <player> A) {	
		List <player> sortedp = new ArrayList <> ();
		Collections.sort(A, new comparepoints() {});
		System.out.println("Objects sorted by price:");
		for(player s : A) {
			sortedp.add(s);//adds student value to an array list
		}		
		System.out.println(sortedp);
	}//sort
	
	static void search(List <player> A) {
		System.out.println("Enter first name to find player"); 
		String s = in.next().toLowerCase();
		System.out.println("Player is shown below");
		for (int i = 0; i < A.size(); i++){ //check if end of file
			if(s.equals(A.get(i).getname().toLowerCase())) {
				System.out.println(A.get(i));
			}	//if
		}//for
	}//search
	
	static void filter(List <player> A) {
		System.out.println("Players with at least 110 points are shown below");
		for (int i = 0; i < A.size(); i++) {
			if(110 <= A.get(i).getpoints()) {
				System.out.println(A.get(i));
			}//if
		}//for
	}//filter

}//class

class player{
	public String name;
	public String last;
	public int points;
	public player() {
		//empty constructor
	}
	public double price;
	player(String n, String l, int p ){
		this.name = n;
		this.last = l;
		this.points = p;
	}//ob
	public String toString() {
		return name + " " + last + " " + points;
	}
	public String getname() {
		return name;
	}
	public String getlast(){
		return last;
	}
	public int getpoints(){
		return points;
	}
}//class player

class comparepoints implements Comparator <player>{
	public int compare(player x, player y) {
		return(Integer.valueOf(x.getpoints()).compareTo(y.getpoints()));
		//compares price of one student to the previous
	}//compare
}//class comparepoint








