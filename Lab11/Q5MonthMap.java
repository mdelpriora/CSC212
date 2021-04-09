/*
 * Write a program using maps where you have a map of all months 
 * as full name and as numbers.
 */

import java.util.*;
public class Q5MonthMap {
	static Scanner in = new Scanner(System.in);
	final static String month[] = {"January","February","March","April","May","June",
			"July","August","September","October","November","December"};//array
	final static Integer num []= {1,2,3,4,5,6,7,8,9,10,11,12};//array	
	public static void main (String [] args){
		HashMap <Integer,String> H = new HashMap <Integer,String>();
		
		for (int i = 0; i < month.length; i++) {
			H.put(num[i], month[i]);//put is equivalent to adding
			//makes pair and puts into hash map
			//mix of key and value - puts (key,variable)
		}
		System.out.println("Map: " + H + " \nSize: " + H.size());
		int n = 1;
		do {
			System.out.println("Enter numerical month to find association between 1 and 12");
			n = in.nextInt();
		}
		while(!(n >0 && n <= 12));
		System.out.println("Month " + n + ": "+ H.get(n));
		//H.keySet() keys
		//H.values() values
	}
}
