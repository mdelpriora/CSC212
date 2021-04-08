/*
 * Enter L (Strings or Numbers)
 * Perform specific operations on linkedlists
 * pop(), 
 * peek(), 
 * push(T w), 
 * L.addFirst(T w), 
 * L.addLast(T w), 
 * L.getFirst(), 
 * L.getLast(), 
 * lastIndexOf(T w), 
 * L.toArray(A)
 * Make menu
 */

import java.util.*;
import java.io.*;
public class Q1playLL {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
	LinkedList <String> L = new LinkedList <>();
	L.add("Potato");
	L.add("Bread");
	L.add("Milk");
	L.add("Eggs");
	char cont = 'y';
	do {
		System.out.println("\nPick one: " + "\n1.Return first value of stack" + "\n2.Return head of list" + "\n3.push an element onto stack" + 
				"\n4.Insert specified element at beginning of list" + "\n5.Insert specified element at end of list" + "\n6.Return first value of list" +
				"\n7.Return last value of list" + "\n8.Find index of given value" + "\n9.Print linked list as array" + "\n0.Exit");
		int op = in.nextInt();
		switch (op) {
		case 1://returns first value of stack 
			System.out.println("First value of stack: " + L.pop());
			break;
		case 2: System.out.println("Head of list: " + L.peek());//returns head of list or null if list is empty
			break;
		case 3: //pushes element onto stack, inserts element at front of list
			System.out.println("Enter string to add to list");
			String w = in.next();
			L.push(w);
			System.out.println("New list: " + L);
			break;
		case 4: //inserts specified element at beginning of list
			System.out.println("Enter string to add to the beginning of the list");
			String w1 = in.next();
			L.addFirst(w1);
			System.out.println("New list: " + L);
			break;
		case 5: //inserts specified element at end of list
			System.out.println("Enter string to add to the beginning of the list");
			String w2 = in.next();
			L.addLast(w2);
			System.out.println("New list: " + L);
			break;
		case 6: //returns first element in the list
			System.out.println("First element of list: " + L.getFirst());
			break;
		case 7: //returns last element in the list
			System.out.println("Last element of list: " + L.getLast());
			break;
		case 8: //returns index of last occurrence of specified element in list or -1 if list deosn't contain the element
			System.out.println("Enter word to find the index of");
			String w3 = in.next();
			System.out.println("Index of last " + w3 + ": " + L.lastIndexOf(w3));
			break;
		case 9://returns array containing all elements in list in correct sequence 
			Object [] A = L.toArray();
			String [] Ar = new String[A.length];
			for(int i= 0; i < A.length; i++) {
				Ar[i] = (String) A[i];
			}
			System.out.println("List as array");
			System.out.println(Arrays.toString(Ar));
			break;
		case 0: System.out.println("Goodbye");	
		
		}//switch
	System.out.println("\nDo you want to continue? y/n");
	cont = in.next().charAt(0);		
	}//do
	while (cont == 'y' || cont == 'Y');
	System.out.println("Goodbye");
	
	}//main
}//class main
class L {//linked list
	Node head;
	Node last;
	int size;
	L () { 
		head = null; 
		last = null;
	}//L
	
	public void add(int v) { //always add at the beginning
		Node m = new Node(v,head); 	
		head = m;
	}//add
	
	public void remove(int v){ // find node with value =v and delete
		Node n1 = head;
		if (head.val == v ) {
			head = head.next;
		}//first
		Node n2 = n1.next;
		if (n2.val == v && n2.next == null) {//last
			n1.next = null; return;//??
		}//if
		while (n2 != null) {
			if (n2.val == v){//remove nn2
				n1.next = n2.next;
				break;
			}
			n1 = n1.next; // nn1 -> nn2  nn1.next = nn2
			n2 = n2.next;
		}//while
	} // remove
	
	public Node getNodeAt(int i){//change val to node at index i
		int count = 0;
		Node n = head;//start
		while ( n != null ){
			if (count == i) return n; //found
			count++;
			n = n.next;
		}//while
		return n;//null
	}//getNodeAt
	
	public void setNodeAt(int i, int v){//change val to node at index i
		int count = 0;
		Node n = head;//start
		while ( n != null ){
			if (count == i) { 
				n.val = v;  //found node!!
				break;
			}
			n = n.next; //got to next Node
			count++;
		}//while
	}//setNodeAt
	
	public void print(){ 
		Node nn = head;//start
		while ( nn != null){
			  System.out.print(nn  + " ");
			  nn = nn.next; //got to next Node
		}//while
	}//print
	
	public int size() {
		int count = 0;
		Node n = head;//start
		while ( n != null){
			  //System.out.print(nn  + " ");
			  n = n.next; //got to next Node
			  count++;
		}//while
		return count;
	}//size
	
	public boolean isEmpty() {
		return head == null; 
	}//isempty
	
	public void pop(){ 
        if (head == null){
        	System.out.print("Error: The list is empty");
        }
        else{
        head = head.next;
        size--;
        }
    }//pop
	
	public void push(int v) {
        Node m = new Node(v,null); 
		if(head == null){
			head = m;
			last = m;
		}
		else{
			m.next= head;
			head = m;
        }
        size++;
    }//push 
	
	public Node getFirst(){return head;} 
	public Node getLast(){return last;} 
	
}//class L

class Node {//recursive definition
	int val;
	Node next; // next = null
	Node(int val, Node n) { 
		this.val = val; 
		next = n;
	}
	public String toString() { 
		return (val + " "); 
	}
}// class
