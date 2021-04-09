/*
 * The program asks you to enter a point, situated on the first diagonal of the canvas. 
 * Enter a point? 40 50 
 * Enter a point? 40 40 
 * Point is on the first diagonal. 
 */
import java.util.*;
public class Q4point0 {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter points x and y");
		int x = in.nextInt();
		int y = in.nextInt();
		point p = new point(x,y);
		System.out.println("Your point is: " + p.toString());
		p.check();
		
	}//main
}//class main

class point{
	int x,y;
	
	public point(int x, int y) {
		this.x = x;
		this.y = y;
	}//point
	public String toString() {
		return x + "," + y;
	}//toString
	public void check() {
		if (x==y) {
			System.out.println("Your point is on the first diagonal");
		}//if
		else {
			System.out.println("Your point is not on the first diagonal");
		}//else
	}//check
}//class point