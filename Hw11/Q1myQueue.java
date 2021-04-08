/*
 * Write your own Queue (call it myQueue) 
 * use an Array as the underlying data structure
 */
import java.util.*;
public class Q1myQueue {
	public static void main (String [] args){	
		myQueue Q = new myQueue();
		Q.add(1);//adds variable
		Q.add(2);
		Q.add(3);
		Q.add(4);
		Q.add(5);
		System.out.println("Elements in Queue:");
		Q.print();
		System.out.println("\nSize: " + Q.size());//returns size
		System.out.println("peek(): " + Q.peek());//returns head
		System.out.println("poll(): " + Q.poll());//removes + returns the head 
	    System.out.println("peek() after poll(): " + Q.peek());     // 5
	    System.out.println("Queue is empty?:" + Q.isEmpty() );
	    Q.clear();//makes Q empty
	    System.out.println("Queue is empty after clearing?:" + Q.isEmpty());
	}//main
}//class main
class myQueue{
	int [] A = new int [100];
	int n;//size of array
	public myQueue(){
		n = 0;
	}
	public boolean isEmpty() {
		return (n == 0);
	}
	public int size() { 
		return n;
	}
	public void add(int w) {
		A[n] = w; 
		n++;
	}//!!! if n < 100
	
	public int peek() {
		return A[0];
	}
	public void print() { 
		for(int i = 0; i < n ;i++)
			System.out.print(A[i] + " ");
	}//print
	public int poll() {//removes + returns the head 
		int m = A[0];
		int i = 0;
		while (i < n){
			A[i] = A[i+1];
			i++;
		}
		return m;
	}//poll
	public void clear() {
		A = new int [100]; //Resets array to an empty array
		n = 0; //Resets size to 0
	}
}