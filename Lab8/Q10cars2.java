/*
 * Generate n cars with max speed between 100-180
 * and year of make 1990-2010.
 * Sort cars by max speed, and after that by year.
 */
import java.util.*;
public class Q10cars2 {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {	
		List <cars1> car = new ArrayList<>();
		read(car);
		sortspeed(car);
		sortyear(car);
	
	}//main
	
	static void read(List<cars1> A) {
		System.out.println("Enter how many cars there are");
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter maximum speed ");
			int speed = in.nextInt();
			System.out.println("Enter year car was made");
			int yr = in.nextInt();
			cars1 x = new cars1(i+1,speed,yr);
			A.add(x);
		}//for
	}//read
	static void sortspeed(List <cars1> A){
		cars1 hold = new cars1();
		boolean change = true;
		while(change) {
			change = false;
			for (int i = 0; i < A.size()-1; i++) {
				if(A.get(i).getspeed() > A.get(i+1).getspeed()){
					hold = A.get(i);
					A.set(i, A.get(i+1));
					A.set(i+1, hold);
					change = true;
				}//if
			}//for
		}//while
		System.out.println("Cars sorted by speed:");
		System.out.println(A);
	}//sortspeed
	
	static void sortyear(List <cars1> A){
		cars1 hold = new cars1();
		boolean change = true;
		while(change) {
			change = false;
			for (int i = 0; i < A.size()-1; i++) {
				if(A.get(i).getyear() > A.get(i+1).getyear()){//compares years
					hold = A.get(i);
					A.set(i, A.get(i+1));//sets current index as value at next index
					A.set(i+1, hold);//sets next index as value at current index
					change = true;
				}//if
			}//for
		}//while
		System.out.println("Cars sorted by year:");
		System.out.println(A);
	}//sortyear
}//class main

class cars1{
	int id;
	int speed;
	int year;
	
	public cars1() {}
	public cars1(int id, int speed, int year) {
		this.id = id ;
		setspeed(speed);
		setyear(year);
	}//cars
	
	public void setspeed (int s) {
		speed = (s >= 100 && s <= 180) ? s : 100; //sets default speed, 100
	}//setSpeed
	
	public void setyear(int y) {
		year = (y >= 1990 && y <= 2010) ? y : 1990; //sets default year, 1990
	}//setyear
	
	public int getspeed() {
		return speed;
	}//getspeed
	
	public int getyear() {
		return year;
	}//getyear
	
	public String toString() {
		return (id + "  " + speed + "  " + year);
	}//toString
}//class cars

