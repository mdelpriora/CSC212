/*
 * given 2^(k+1) - 1 consecutive numbers, 
 * build a perfect binary sorting tree
 * then display all the traversals:LNR,LRN,LRN,BF
 */
import java.util.*;
public class Q2BinarySortTree {
	public static void main (String [] args){
		int A[] =  {10, 5, 14, 3, 18, 7, 9, 6, 11};
		Node1 root = new Node1(A[0]);
		for (int i = 1; i < A.length; i++){//copy Array in Tree
			root.createNode(A[i]);
		}
		System.out.println("\nLNR inOrder:");	
		root.inOrder();   // L N R
		System.out.println("\nNLR preOrder:");  
		root.preOrder();  // N L R
		System.out.println("\nLRN postOrder:"); 
		root.postOrder(); // L R N
		System.out.println();
		System.out.println("BF: " + levelorder(root));
		System.out.println("Height: " + height(root));
	}//main
	static int height(Node1 m) {
		int h = 0;
		if (m.left == null &&  m.right == null) return h;
		if (m.left == null) { h = height(m.right) + 1;}//no left
		else
			if (m.right == null) { h = height(m.left) + 1;}
				else //yes left and right
				{h = 1 + Math.max(height(m.left),height(m.right));}
		return h;
	}//height
	static String levelorder(Node1 root) {
		String res = "";
		Node1 m;
		LinkedList <Node1> Q = new LinkedList <>();
		Q.add(root);
		while(! Q.isEmpty()) {
			System.out.println("Q=" + Q);
			System.out.println("Result=" + res);
			m = Q.pop();//taking the head
			res += m.val;
			if (m.left != null) {
				Q.addLast(m.left);
			}
			if(m.right != null) {
				Q.addLast(m.right);
			}
		}
		return res;
	}//levelorder
}//class main
class Node1 {
	int val; // value
	Node1 left, right;  //null	
	public Node1(int val) { this.val = val; left = null; right = null;}
	public void preOrder(){ // [N Left Right] traversal
	  	System.out.print(val + " "); // N
		if (left != null) left.preOrder();
	    if (right != null) right.preOrder();
	}//inOrder
	public void postOrder(){ // [Left Right Node] traversal
		if (left != null) left.postOrder();
	    if (right != null) right.postOrder();
		System.out.print(val + " "); // N
	}//inOrder
	public void createNode(int v) {
		Node1 w = new Node1(v);//make new Node
		if ( v > val ) {// > right
			if (right == null ) right = w;//empty fill position
			else right.createNode(v);
		}
		if ( v < val ) { // < Left
			if (left == null ) left = w; //empty fill pos
			else left.createNode(v);
		}
	}//createNode
	public void inOrder(){ // [Left N Right] traversal
	  if (left != null) left.inOrder();
	  System.out.print(val + " "); // N
	  if ( right != null) right.inOrder();
	}//inOrder
	public String toString() {
		return (val + " ");
	}
	public void print() {
		System.out.println(val);
		if(left != null) {	
			System.out.print(left.val);
		}
		else if (right != null){
			System.out.print(left.val);
		}
		else {
			System.out.print("-");
		}
	}
}//class
