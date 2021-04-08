/*
 * Write your own DLL (Double Linked List)
 * Implement as many methods as you wish
 * 
 */
import java.io.*;
import java.util.*;
public class Q2myDLL {
	public static void main (String [] args){
		DLL L = new DLL();
		L.addFirst(5); 
		L.addFirst(7); 
		L.addFirst(7); 
		L.addFirst(8); 
		L.print();// 8 7 7 5
		System.out.println("Index of last 5: " + L.lastIndexOf(5));
		L.add(0,13); 
		L.print();  // 8 7 7 13 5
		System.out.println("L is empty? " + L.isEmpty());
		System.out.println("Last element of list: " + L.getLast());
		System.out.println("First element of list:" + L.peek());//8 3
		System.out.println("Size of list is: "+ L.size());
		System.out.println("Change val to 2020 at index 1: "); 
		L.set(1,2020); 
		L.print();
		System.out.println("Node at index 1 is: " + L.get(1)); // 2020
		System.out.println("List contains 100: " + L.contains(100));
		L.clear();  //empties the list
		System.out.println("Size after clear(): " + L.size());
		//you have to modify code from class myLL
		System.out.println("After adding 2000 to the front: "); 
		L.addFirst(2000);
		L.print();
	    System.out.println("After adding 2009 to the end: "); 
	    L.addLast(2009); 
	    L.print();
		System.out.println("List after removing 2000:" ); 
		L.remove(2000);  
		L.print();
	}//main
}//class
class DLL {//double linked list- only the Node changes
	Node1 first; 
	Node1 last;
	int size;
	DLL (){ 
		first = null; 
		last = null;
	}

	public int lastIndexOf(int v){// check backwards,first appearance is returned
		int i = size()-1;
		Node1 nn = last;//start
		while ( i >= 0 ){
			if (nn.val == v) { //found last node
				return i;
			}
			nn = nn.prev; //got to next Node
			i--;// decrease index
		}//while
		return -1;//not found
	}//lastIndexOf
	
	public boolean isEmpty() {
		return first == null; 
	}//isempty
	
	public Node1 getLast(){return last;}
	public Node1 peek(){return first;}// get first
	
	public void set(int i, int v){
		int count = 0;
		Node1 nn = first;//start
		while ( nn != null ){
			if (count == i) { 
				nn.val = v;  //found node!!
				break;
			}
			nn = nn.next; //got to next Node
			count++;
		}//while
	}//setNodeAt
	
	public Node1 get(int i){
		int count = 0;
		Node1 nn = first;//start
		while ( nn != null ){
			if (count == i) 
				return nn; //found
			count++;
			nn = nn.next;
		}//while
		return nn;//null
	}//getNodeAt
	
	public boolean contains(int w){	
		Node1 n1 = first;//start
		while ( n1 != null ){
			if (n1.val == w) 
				return (true); //found
			n1 = n1.next;
		}//while
		return (false);
	} //contains
	
	public void clear(){first = last = null;}//clear

	public void addLast(int v){
		Node1 m = new Node1(v,last,null); 	
		last.next = m;
		last = m;
	}	//last links to m TODO see addFirst!!
	
	public void addFirst (int v) { //add at the beginning!!
		Node1 m = new Node1(v,null,first); 	
		first = m;
		if (size() == 1) //First element
			last = first;
	}//addFirst
	
	public void add(int i, int v) {//INSERT 
		int count = 0;
		Node1 m = new Node1(v,null,null);
		Node1 nn = first;
		if (i == 0) { addFirst(v); return;}
		if ( i == size()) {addLast(v); return;}
		while ( nn != null ){//check if end
			if (count == i) { //this is the place change links!!
				nn.prev.next =  m; //nn.prev is node at i-1
				m.prev = nn.prev;   //m in position i
				m.next = nn;	 	// link m to nn
				return; //finished
			}//if
			nn = nn.next; //got to next Node
			count++;	// increase index
		}//while	
	}//Insert node v at index	
	
	public void remove(int v){
		Node1 nn = first;//start
		if (first.val == v ) {
			first = first.next;
			first.prev = null;
		}
		Node1 nn2 = nn.next;
		while ( nn2 != null){
			if (nn2.val == v){
				//remove nn2
				if(nn2.next == null){ nn2.prev.next = null; last = nn2.prev;}
				else{
				nn.next = nn2.next; 
				nn2.next.prev = nn;
				break;
				}
			}
			nn = nn.next; // nn1 -> nn2  nn1.next = nn2
			nn2 = nn2.next;
		}
		size--;
	}// find node with value = v and delete
	
	public void print(){
		Node1 nn = first;//start
		while ( nn != null){
			System.out.println(nn.prev + " " + nn  + " " + nn.next);//to check
			//System.out.print(nn  + " ");
			nn = nn.next; //got to next Node
		}//while
	}//print
	public int size() {//same as LL
		int count = 0;
		Node1 nn = first;//start
		while ( nn != null){
			  nn = nn.next; //got to next Node
			  count++;
		}//while
		return count;
	}//size	
}//class

class Node1{//recursive definition Node keeps track of the previous node
int val;
	Node1 next;	
	Node1 prev; // previous node
	Node1(int val, Node1 prev, Node1 next) { 
		this.val = val; 
		this.prev = prev;
		this.next = next;
	}
	public String toString() { return (val + " "); }
}// class
