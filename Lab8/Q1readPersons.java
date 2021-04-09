/*
 * Finish class exercise: Person2.java 
 * Read an array of persons (private name,private age) from the user. 
 */
import java.util.*;
public class Q1readPersons {
	static Scanner in = new Scanner(System.in);
	public static void main(String [] args) {//anything in here gets run
		//Person p1 = new Person("Ada",29);		
		//System.out.print(p1);
		
		List <Person> A = new ArrayList <> ();
		read(A);
		
	}//main
	static void read (List <Person> A) {
		System.out.println("Enter how many people you want to enter");
		int n = in.nextInt();
		for (int i = 0; i < n ; i++){
			System.out.println("Enter name");
			String s = in.next();
			System.out.println("Enter age");
			int a = in.nextInt();
			Person X = new Person(s,a);
			A.add(X);
		}//for
		System.out.println(A);
	}//read
}//class main


class Person {//new class, takes input from main
	String name; int age;
	
	public Person(String name, int age){ //constructor
			this.name = name; 
			this.age = age;
	}//method
	
	public String toString() { 
		return name + " " + age; 
	}//toString
	
}//class person
