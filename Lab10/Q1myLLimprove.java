/*
 * Build your own LL. Start from class file week10Class/myLL1.java: 
 * Add methods: clear(), 
 * contains(val), 
 * peek() - displays head, 
 * add(i,val) - is actually insertNodeAt(int index,int value)
 * Hint: Lab10/myLLimprove.java
 */
import java.io.*; 
import java.util.*;
public class Q1myLLimprove {
	public static void main (String [] args){
		
		myLL L = new myLL();
		System.out.println("L is empty? "+ L.isEmpty());
		L.add(5);	
		L.add(7);	
		L.add(8);  // 8 7 5
		System.out.println("size is: " + L.size());	
		L.print();
		L.setNodeAt(1,2020);	
		L.print();
		L.remove(2020);			
		L.print();
		
		System.out.print("L contains " + L.contains(8));	
		System.out.println("\nFirst is " + L.peek());	
		L.print();
		
		L.clear();	
		L.print();
		System.out.println("L is empty? "+ L.isEmpty());
	}//main
}//class
class myLL{
	Node head;
	myLL(){head = null;}
	public Node peek(){	return head;}//peek
	public void clear(){	head = null; }//clear
	public boolean contains(int w){
		Node hold = head;
		while(hold.next != null){
			if(hold.val == w)
				return true;
			hold = hold.next;
		}
		return false;
	}//contains
	public void add(int i, int v){//insert node with value v at position i
		if (i >= size()) return;
		int count = 0; 
		Node nn = new Node(v,null);		//make node then find link (i-1)-> nn -> old i
		Node nn1 = head;
		while ( nn1 != null) {
			count++;
			if (count == i-1) { 
			    Node hold = nn1.next;
				nn1.next = nn;
				nn.next = hold;		
				break;
			}
		} //while
	}//insertNode
	public void remove(int v){ //find node with value =v and delete
		Node nn1 = head;
		if ( head.val == v ){head = head.next;}//first
		Node nn2 = nn1.next;
		if(nn2.val == v && nn2.next == null){//last
			head.next = null; return;
		}
		while(nn2 !=null){
			if(nn2.val == v){//remove nn2
				nn1.next = nn2.next;
				break;
			}
			nn1 = nn1.next;
			nn2 = nn2.next;
		}//while
	}//remove
	public Node getNodeAt(int i ) {
		int count = 0;
		Node nn = head; //start
		while(nn != null){
			if(count == i) return nn;//found
			count++;
			nn = nn.next;
		}//while
		return nn; //null
	}//getNodeAt
	public void setNodeAt(int i, int v){//change value to node at index i
		int count = 0;
		Node nn = head;//start
		while(nn != null){
			if(count == i) { 
				nn.val = v; break;
			}
			nn = nn.next; //go to next node
			count++;
		}//while	
	}//setNodeAt
	public void print(){
		Node nn = head;//start
		while (nn != null){
			System.out.print(nn + " ");
			nn = nn.next;//go to next Node
		}//while
		System.out.println();
	}//print
	public int size(){
		int count = 0;
		Node nn = head;
		while(nn != null){
			System.out.print(nn + " ");
			nn = nn.next;
			count++;
		}//while
		return count;
	}//size
	public void add(int v){ 
		Node m = new Node(v, head);	
		head = m;
	}//adds at the beginning
	public boolean isEmpty() {	
		return head == null;
	}
}//myLL

class Node {//recursive definition
	int val; 
	Node next; //next = null;
	Node(int val, Node nn) {this.val = val; next = nn;}
	public String toString(){ return val + " ";}
}//class Nodes