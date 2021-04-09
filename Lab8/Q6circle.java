/*
 * You define a circle as a center and a radius.
 * Write a program where you make a circle and print it,
 * prints its area and circumference.
 */

import java.util.*;
public class Q6circle {
	public static void main(String[] args) {
		
		points [] A = {new points(5,6), new points(6,7), new points(7,8)};
		//could use array list instead
		System.out.println("Points are: " + Arrays.toString(A));
		circle c = new circle(4,30,10);
		System.out.println("Center of circle: " + c.center.x + "," + c.center.y);
		System.out.println("Area of circle: " + c.area());
		System.out.println("Circumference of circle: " + c.circu());
	
	}//main 
}//main class

class points{//declares points input points as x and y
	int x,y;
	public points(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "[" + x + "," + y + "]";
	}
}//class point
class circle{
	points center = new points(0,0);//default values
	double radius;
	circle(int xx, int yy, double r){
		center.x = xx;
		//declares center from previously declared point in public point
		center.y = yy;
		radius = r;
	}
	circle(points c, double r){//constructors assumed public if not declared private
		center = c;
		radius = r;
	}
	public float area() {
		return (float)(Math.PI*Math.pow(radius, 2));
	}
	public float circu() {
		return (float)(2*Math.PI*radius);
	}
	
	public String toString() {
		return (center + " " + radius);
	}
	
}