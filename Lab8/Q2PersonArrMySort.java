/*
 * A person has first and last name, last name and age.
 * Enter n=3 persons and display them sorted by their age.
 * Use any sort you have learned
 */
import java.util.*;
public class Q2PersonArrMySort {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		
		List <Persons> A = new ArrayList <> ();
		read(A);
		System.out.println("Search 0 person in " + A + search(A.get(0),A));
		//mySort(A);
		System.out.println("Sort by age" + A); 
		
	}//main
	
	static void read(List <Persons> A){
		for (int i = 0; i < 2 ; i++ ){	//	read Person
			System.out.print("Enter name? "); 
			String s = in.next();
			System.out.print("Enter age");  	    
			int age = in.nextInt();
			A.add(new Persons(s,age));
		}//for
	}//read
	
	static void sort (List <Persons> A){
		List <Persons> R = new ArrayList <> ();
		for ( int i = 0; i < A.size() - 1; i++ ) {
		}//for
	}//sort
	
	static boolean search(Persons W, List <Persons> A) {
		for (int i=0; i < A.size() ; i++){
			if (W.equals(A.get(i))) return true;
		}	
		return false;
	}//search
	
}//clsss main

class Persons {//new class, takes input from main
	private String name; 
	private int age;

	public Persons(String name, int age){ //constructor
			this.name = name; 
			this.age = age;
	}//method
	
	public int getAge() {
		return age;
	}//getage
	
	public String toString() { 
		return name + " " + age; 
	}//toString
	
}//class person

