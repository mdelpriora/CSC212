/*
 * Items in an array.
 * Enter n items by name and price and print them sorted after price 
 * and after that sorted by name.
 */

import java.util.*;
public class Q8itemsSort {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		List <ob> A = new ArrayList <> ();
		
		System.out.println("Enter how many objects there are");
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter object");
			String o = in.next();
			System.out.println("Enter price (USD)");
			double p = in.nextDouble();
			ob x = new ob(o,p);
			A.add(x);
		}//for
		System.out.println("Your list");
		System.out.println(A);
		sortprice(A);
		sortob(A);
		
	}//main
	static void sortprice(List <ob> A) {	
		List <ob> sortedp = new ArrayList <> ();
		Collections.sort(A, new compareprice() {});
		System.out.println("Objects sorted by price:");
		for(ob s : A) {
			sortedp.add(s);//adds student value to an array list
		}		
		System.out.println(sortedp);
	}//sort

	static void sortob(List <ob> A){
		ob hold = new ob();
		boolean change = true;
		while(change) {
			change = false;
			for (int i = 0; i < A.size()-1; i++) {
				if(A.get(i).getob().compareTo(A.get(i+1).getob()) > 0){
					hold = A.get(i);
					A.set(i, A.get(i+1));
					A.set(i+1, hold);
					change = true;
				}//if
			}//for
		}//while
		System.out.println("Objects sorted by name:");
		System.out.println(A);
	}//sortob
}//class main


class ob{
	public String object;
	public double price;
	public ob() {
		//empty constructor
	}
	ob(String o, double p){
		this.object = o;
		this.price = p;
	}//ob
	public String toString() {
		return object + " " + price;
	}
	public String getob() {
		return object;
	}
	public double getprice(){
		return price;
	}
	
}//class ob
	
class compareprice implements Comparator <ob>{
	public int compare(ob x, ob y) {
		return(Double.valueOf(x.getprice()).compareTo(y.getprice()));
		//compares price of one student to the previous
	}//compare
}//class compareprice


