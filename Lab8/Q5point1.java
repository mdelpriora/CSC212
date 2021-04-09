/*
 * You have a point, [30,40] and ask the user to enter a different point.
 * You will add another method as the equality of Points.
 * boolean equals(Point P) { return (P.x == x && P.y == y);} in Point
 */
import java.util.*;
public class Q5point1 {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		point1 p = new point1(30,40);
		point1 pp = new point1();
		
	do {
		System.out.println("Enter a point that is not (30,40)");
		int x = in.nextInt();
		int y = in.nextInt();
		pp.setx(x);
		pp.sety(y);
		System.out.println("Your point is: " + pp.toString());
		if(p.equals(pp)) {
			System.out.println("Your point is the same as (30,40), try again");
		}//if
	}//do
		while(p.equals(pp));
		System.out.println("You have entered a different point, thank you.");
	}//main
}//class main

class point1{
	int x,y;
	public point1() {//default points
		
	}//point

	public point1(int x, int y) {
		this.x = x;
		this.y = y;
	}//point
	
	public void setx(int xx) {
		x = xx;
	}
	public void sety(int yy) {
		y= yy;
	}
	
	public String toString() {
		return x + "," + y;
	}//toString
	
	public boolean equal(point1 p) {
		return (p.x == x & p.y == y);
	}
}//class point