/*
 * Build your own LL. Change previous program.
 * Change previous program. 
 * Keep track of the last Node (call it "last").
 * The "head" will be called ("first"). 
 * Write methods (addLast(),getLast()).
 * Review all methods if you need to change them. 
 * setNodeAt(i,val) corresponds to set() 
 * Add methods: pop() (remove first),
 * push()(is same as addFirst()), 
 * peek()-show first addFirst(), 
 * getFirst() (displays first, 
 * same as peek()) 
 * Optional: lastIndexOf(T w), equals() 
 */

import java.io.*;
import java.util.*;
public class Q2myLLfinal {
	static public void main (String [] args){
		myL L = new myL();
		System.out.println("L is empty?" + L.isEmpty());
		L.addFirst(5); 	
		L.addFirst(7); 	
		L.addFirst(8); 
		L.print();
		System.out.println("first is:" + L.peek() + "\nSize: "+ L.size());//8 3
		System.out.println("Change val to 2020 at index 1: "); L.setNodeAt(1,2020);  
		L.print();
		System.out.println("Node at index 1 is: " + L.getNodeAt(1)); // 2020
		System.out.println("Removing 5:" ); L.remove(5);  
		L.print();
		System.out.println("Add 2009 at the end: "); L.addLast(2009); 
		L.print();
		System.out.println("Show last: " + L.getLast());
		System.out.println("List contains 100: " + L.contains(100));
		L.clear();  //empties the list
		System.out.print("After clear() Size: " + L.size());
	}//main
}//class
class myL {//linked list
	Nodes first; 
	Nodes last;
	myL () { 
		first = null; 
		last = null;
	}
	
	public Nodes getLast(){
		return last;
	}
	public void clear(){ 
		first = last = null;
	}//clear
	public Nodes peek(){	
		return first;
	}			// get the first
	public void addLast(int v){//last links to m
		Nodes m = new Nodes(v,null); 	//make node
		if(last == null){//list empty
			first = last = m; 
		}
		else {
			last.next = m;//link node to m
			last = m; //last is m 
		}
	}//addLast
	public boolean contains(int w){
		Nodes nn = first;//start
		boolean result = false;
		while(nn != null){
			if (nn.val == w){
				result = true;
				break;
			}
			nn = nn.next; //got to next Node
		}//while
		return result;
	}//contains
	public void remove(int v){ //find node with value = v and delete
		Nodes nn1 = first;
		if (size() == 1 && first.val == v) { first = last = null; return;}
		if (first.val == v ) { first = first.next; return; }// v is first
		Nodes nn2 = nn1.next;
		while (nn2 != null) {
			if (nn2.val == v && nn2.next == null) {//last
				nn1.next = null;  
				last = nn1;  // becomes last !!
				return;
			}
			if (nn2.val == v){//remove nn2
				nn1.next = nn2.next;// skip nn2
				break;
			}
			nn1 = nn1.next; // nn1 -> nn2  nn1.next = nn2
			nn2 = nn2.next;
		}
	} // remove
	public Nodes getNodeAt(int i){//change val to node at index i
		int count = 0;
		Nodes nn = first;//start
		while ( nn != null ){
			if (count == i) return nn; //found
			count++;
			nn = nn.next;
		}//while
		return nn;//null
	}//getNodeAt
	public void setNodeAt(int i, int v){//change val to node at index i
		int count = 0;
		Nodes nn = first;//start
		while ( nn != null ){
			if (count == i) { 
				nn.val = v;  //found node!!
				break;
			}
			nn = nn.next; //got to next Node
			count++;
		}//while
	}//setNodeAt
	public void print(){
		System.out.print("List: ");
		Nodes nn = first;//start
		while ( nn != null){
			  System.out.print(nn  + " ");
			  nn = nn.next; //got to next Node
		}//while
		System.out.println();
		System.out.println("first: " + first);
		System.out.println("last: " + last);
	}//print
	public int size() {
		int count = 0;
		Nodes nn = first;//start
		while ( nn != null){//System.out.print(nn  + " ");
			nn = nn.next; //got to next Node
			count++;
		}//while
		return count;
	}//size
	public void addFirst (int v) {//always adds at the beginning
		Nodes m = new Nodes(v,null); 
		if(first == null){
			first = m;
			last = m;
		}
		else{
			m.next= first;
			first = m;
		}
	}//addFirst
	public boolean isEmpty() {
		return first == null; 
	}
}//class
class Nodes {//recursive definition 
	int val;
	Nodes next; // next = null
	Nodes(int val,Nodes nn) { this.val = val; next = nn;}
	public String toString() { return (val + " "); }
}// class