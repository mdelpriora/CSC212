/*
 * Write your own Queue (call it MyQueue) 
 * based on a LinkedList(). 
 */
import java.util.*; 
public class Q9myqueueLL {
	public static void main (String [] args){
		MyQueue Q = new MyQueue();
		Q.add(1);
		Q.add(2);
		Q.add(3);
		Q.add(4);
		Q.add(5);
		System.out.println("Elements in Queue:");
		Q.print();
		System.out.println("\nSize: " + Q.size());
		System.out.println("peek(): " + Q.peek());
		System.out.println("poll(): " + Q.poll()); 	//removes + returns the head 
	    System.out.println("peek() after poll(): " + Q.peek());     // 5
	    System.out.println("Queue is empty?:" + Q.isEmpty() );
	    Q.clear();
	    System.out.println("Queue is empty after clearing?:" + Q.isEmpty() );
	}//main
}//class main
class MyQueue {
	LinkedList <Integer> Q;
	public MyQueue() {
		Q = new LinkedList<>();
	} //myStack
		public int size() {
		return (Q.size());
	} //size
	public void add (int w) {
		Q.addLast(w); //Adds to end
	} //add
	public int peek() {
		return (Q.peek());
	} //peek
	public int poll() {
		if (!Q.isEmpty())
			return(Q.pop()); //Removes from start
		return(-1);
	} //poll
	public boolean isEmpty () {
		return Q.isEmpty();
	} //isEmpty
	public void clear() {
		Q.clear();
	} //size
	public String toString() {
		return(Q.toString());
	} //toString
	public void print() {
		System.out.println(Q);
	} //print
} //class MyQueue
