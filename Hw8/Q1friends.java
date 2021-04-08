/*
 * Organize your program with a menu. 
 * Enter from the user n friends with name (just first) and birthday (month and day): 
 * John 3 12 Ann 2 29
 */
import java.util.*;
public class Q1friends {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		char cont = 'y';
		List <friend> A = new ArrayList <> ();
		
		System.out.println("Enter how many friends are there are");
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter name in all lowercase");
			String name = in.next();
			System.out.println("Enter their birth month");
			int month = in.nextInt();
			System.out.println("Enter their birth day");
			int day = in.nextInt();
			friend x = new friend(name,month, day);
			A.add(x);
		}//for
		System.out.println(A);
		
		do {
			System.out.println("\nPick one: " + "\n1.Display all your friends and how many" + "\n2.Add a friend" + "\n3.Ask for a friend and display their birthday" + "\n4.Delete a friend" + "\n5.Print all friends born on a certain day or month (or both)" + "\n6.Sort friends after their first name" + "\n0.Exit");
			int op = in.nextInt();
			switch (op) {
			case 1:	System.out.println(A);//prints list
				break;
			case 2: add(A);//adds friend to list
				break;
			case 3: ask(A);//ask for a friend and display's their birthday
				break;
			case 4: delete(A);//deletes a friend from the list then displays the new list
				break;
			case 5: friendof(A);//prints all friends born on a an entered day or month (or both)
				break;
			case 6: sortname(A);
				break;
			case 0: System.out.println("Goodbye");	
		
			}
		System.out.println("\nDo you want to continue? y/n");
		cont = in.next().charAt(0);		
		}//do
		while (cont == 'y' || cont == 'Y');
		System.out.println("Goodbye");
	
	}//main
	
	static void add(List <friend> A){
		System.out.println("Enter new friend!");
		System.out.println("Enter name");
		String name = in.next();
		System.out.println("Enter their birth month");
		int month = in.nextInt();
		System.out.println("Enter their birth day");
		int day = in.nextInt();
		friend x = new friend(name,month, day);
		A.add(x);
		
		System.out.println(A);
	}
	static void ask(List <friend> A) {
		System.out.println("Enter friend you would like to search for in lowercase");
		String nm = in.next();
		for(int i = 0; i < A.size(); i++){
			if(nm.equals(A.get(i).getname())){
				System.out.println(nm + "'s birthday is: " + Integer.valueOf(A.get(i).getmonth()) + " " + (A.get(i).getday()));
			}//if
		}//for
	}//ask
	
	static void delete(List <friend>A) {
		System.out.println("Enter friend you would like to delete");
		String nm = in.next();
		for(int i = 0; i < A.size(); i++){
			if(nm.equals(A.get(i).getname())){
				int index = A.indexOf(A.get(i));
				A.remove(index);
			}//if
		}//for
		System.out.println("Updated list: " + A);
	}//delete
	
	static void friendof(List <friend>A) {
		int month,day;
		System.out.println("Enter whether you would like to look at month(m), day(d) or both(b)");
		char ch = in.next().charAt(0); 
		
		if(ch == 'm') {
			System.out.println("Enter a month");
			month  = in.nextInt();
			for(int i = 0; i < A.size(); i++){
				if(A.get(i).getmonth() == month){
					System.out.println(A.get(i).getname() + " has this birth month");
				}//if
			}//for
		}//if
		
		else if(ch == 'd') {
			System.out.println("Enter a day");
			day  = in.nextInt();
			for(int i = 0; i < A.size(); i++){
				if(A.get(i).getday() == day){
					System.out.println(A.get(i).getname() + " has this birth day");
				}//if
			}//for
		}//else if
		
		else if(ch == 'b') {
			System.out.println("Enter a month");
			month  = in.nextInt();
			System.out.println("Enter a day");
			day  = in.nextInt();
			for(int i = 0; i < A.size(); i++){
				if(A.get(i).getmonth() == month && A.get(i).getday() == day){
					System.out.println(A.get(i).getname() + " has this birthday");
				}//if
			}//for
		}//else if
		else {
			System.out.println("You did not enter a valid option");
		}//else	
	}//friendof
	
	static void sortname(List <friend>A) {
		friend hold = new friend();
		boolean change = true;

		while(change){
			change = false;
			for(int i = 0; i < A.size()-1; i++){//run through list
				if(A.get(i).getname().charAt(0) == A.get(i + 1).getname().charAt(0)){
				//if first letter is the same
					if(A.get(i).getname().charAt(1) > A.get(i + 1).getname().charAt(1)){
					//if 2nd letter of name at index I is after 2nd letter of name at nxt index
						hold = A.get(i);
						A.set(i,A.get(i + 1));
						A.set(i+1, hold);
						change = true;
						//switches values of 2 positions
					}//if
					else{
						if(A.get(i).getname().charAt(2) > A.get(i + 1).getname().charAt(2)){
						//if 3rd letter of name at index I is after 3rd letter of name at nxt index
							hold = A.get(i);
							A.set(i,A.get(i + 1));
							A.set(i+1, hold);
							change = true;
						}//if
					}//else
				}//if
				else{//if first letters are not the same
					if(A.get(i).getname().charAt(0) > A.get(i + 1).getname().charAt(0)){
						hold = A.get(i);
						A.set(i,A.get(i + 1));
						A.set(i+1, hold);
						change = true;
					}//if
					else{
						if(A.get(i).getname().charAt(2) > A.get(i + 1).getname().charAt(2)){
						//if 3rd letter of name at index I is after 3rd letter of name at nxt index
							hold = A.get(i);
							A.set(i,A.get(i + 1));
							A.set(i+1, hold);
							change = true;
						}//if
					}//else
				}//else
			}//for
		}//while
		System.out.println("Cars sorted by speed:");
		System.out.println(A);
	}
}//class main

class friend{
	public String name;
	public int month;
	public int day;
	friend (){}
	friend(String name, int month, int day){
		this.name = name;
		this.month = month;
		this.day = day;
	}
	public String getname() {
		return name;
	}
	public int getmonth(){
		return month;
	}
	public int getday() {
		return day;
	}
	public String toString() {
		return name + " " + month +  " " + day;
	}//toString
}//class friend




