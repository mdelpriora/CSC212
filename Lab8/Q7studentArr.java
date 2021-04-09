/*
 * A student has a name and points (0-100)
 * Imagine in main() you ask for a list of students (names),
 * ask for points for each
 * Display sorted by points
 */

import java.util.*;
public class Q7studentArr {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		List <student> A = new ArrayList <> ();
	
		System.out.println("Enter how many students there are");
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter name");
			String name = in.next();
			System.out.println("Enter their points");
			int p = in.nextInt();
			student x = new student(name,p);
			A.add(x);
		}//for
		System.out.println(A);
		
		sort sort1 = new sort(A);
		
	}//main
}//class main

class student{
	public String name;
	public int points;
	student(String name, int points){
		this.name = name;
		this.points = points;
	}
	public String toString() {
		return name + " " + points;
	}//toString
	
	public int getpoints(){
		return points;
	}
}//class student

class comparescore implements Comparator <student>{
	public int compare(student x, student y) {
		return(Integer.valueOf(x.getpoints()).compareTo(y.getpoints()));
		//compares points of one student to the previous
	}//compare
}//class comparescore

class sort{
	sort(List <student> A) {	
		List <student> sorted = new ArrayList <> ();
		Collections.sort(A, new comparescore() {});
		System.out.println("Students sorted by score:");
		for(student s : A) {
			sorted.add(s);//adds student value to an array list
		}		
		System.out.println(sorted);
	}//sort
}//class sort
