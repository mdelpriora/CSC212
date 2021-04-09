/*
 * Generate n=5 cars with ID and max speed.
 * Sort the cars by speed
 */

import java.util.*;
public class Q9cars0 {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {	
		List <cars> car = new ArrayList<>();
		read(car);
		sort(car);
	}//main
	
	static void read(List<cars> A) {
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter maximum speed");
			int speed = in.nextInt();
			cars x = new cars(i+1,speed);//car id is index +1, at index 0, id =1
			A.add(x);
		}//for
	}//read
	static void sort(List <cars> A){
		cars hold = new cars();
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
	}//sort
}//class main	

class cars {
	int id;
	int speed;
	
	public cars() {}
	public cars(int id, int speed) {
		this.id = id ;
		this.speed =speed;
	}
	
	public int getspeed() {
		return speed;
	}
	
	public String toString() {
		return (id + "  " + speed);
	}
		
}//class cars

