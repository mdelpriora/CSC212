/*
 * Time (H:M:S) 
 * program asks you what time it is (hour and minutes) and tells you if it is break.
 */

import java.util.*;
public class Q3time0 {
	static Scanner in = new Scanner(System.in);
	public static void main(String [] args) {
	List <time> Break = new ArrayList<>();
	
	System.out.println("Break time");
	read(Break);

	System.out.println("Current time");
	List <time> T = new ArrayList<>();
	read(T);

	check(Break,T);
	
	}//main
	
	static void read(List <time> L) {
		System.out.println("Enter hour (0-24)");
		int  hour = in.nextInt();
		System.out.println("Enter minute");
		int min = in.nextInt();
		time t0 = new time(hour,min);	
		L.add(t0);
	}
	
	static void check(List <time> Break,List <time> T) {
		if (Break.equals(T)) 
			System.out.println("It is break time");
		else
			System.out.println("It is not break time");
	}
}//class main

class time{
	int hour;
	int min;
	
	public time (int hour, int min){
		this.hour = (hour > 24) ? 0:hour; //if hour is larger than 24,result is 0, else it is the hour
		this.min = (min >= 60) ? 0:min;
	}//time
	public void print () {
		System.out.println(toString());
	}
	public String toString() {
		return hour + ":" + min;
	}//method
}