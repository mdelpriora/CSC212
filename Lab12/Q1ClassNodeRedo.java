
public class Q1ClassNodeRedo {
	public static void main(String [] args){ 
		Node root = new Node("5"); 
		Node A = new Node("4"); 
		root.left = A; //5 -> 4
		A.left = new Node("3"); //4 ->3 
		Node B = new Node("8"); 
		root.right = B;
		Node C = new Node("7"); 
		B.left = C;
		B.right = new Node("9");
		C.left = new Node("6");
		//print tree in inOrder traversal (L N R)
		root.inOrder();
	}//main
}//class
class Node {
	String val; // value
	Node left; Node right;  //null	
	public Node(String val) { this.val = val; left=null; right=null;}
	public void inOrder(){ // Left N Right traversal
	  if (left != null) left.inOrder();
	  System.out.print(val + " "); // N
	  if ( right != null) right.inOrder();
	}//inOrder
}//class