/*
Menu:
1  display root
2. how many nodes // size()
3. display leaves
4. height of the tree //how many "hops" from root
5  print all nodes with their children (if any)
6. traversal inOrder (LNR)
7. traversal postOrder (LRN)
8. traversal preOrder (LRN)
9. Breadth First (level traversal) 
10.your option..

*includes max, min, search and display (Q8, Q9, Q10)
 */
import java.util.*;
public class Q5PlayTree {
	static Scanner in = new Scanner(System.in);
	public static void main(String [] args){ 
		ArrayList <Integer> A = new ArrayList<>();
		int n, s, e;
		do {
			System.out.print("Enter n: ");
			n = in.nextInt(); //Length
			System.out.print("Enter start number: ");
			s = in.nextInt(); //Start number
			System.out.print("Enter end number: ");
			e = in.nextInt() + 1; //End number
		} while (e - s < n); //Makes sure range is smaller than n 
		generate(A, n, s, e);
		Nodes root = new Nodes(A.get(0));
		for (int i = 1; i < n; i++) {
			root.createNode(A.get(i));
		} //for
		
		int op = 0;
		do {
			System.out.println("\nPick one" + "\n1. Display root" + "\n2. Number of nodes" + "\n3. Display leaves" + 
			"\n4. Height" + "\n5. Print all nodes with their children" + "\n6. Traversal inOrder" + "\n7. Traversal preOrder" +
			"\n8. Traversal postOrder" + "\n9. Traversal levelOrder" + "\n10. Minumum and maximum" + "\n11. Search" +"\n0. Exit");
			System.out.print("Enter Option: ");
			op = in.nextInt();
			System.out.println();
			switch (op) {
				case 1: System.out.println("Root:");
						root.print(); break;//display root
				case 2: System.out.println("Number of nodes: " + size(root)); break;//how many nodes
				case 3: leaves(root); break;//display leaves
				case 4: System.out.println(height(root)); break;//height
				case 5: System.out.println("All nodes and children:");
						allNodes(root); break;
				case 6: System.out.println("Traversal inOrder:");
						root.inOrder(); break;
				case 7: System.out.println("Traversal preOrder:");
						root.preOrder(); break;
				case 8: System.out.println("Traversal postOrder:");
						root.postOrder(); break;
				case 9: System.out.println("LevelOrder: " + levelOrder(root)); break;
				case 10:System.out.println("Maximum: " + max(root));
						System.out.println("Minimum: " + min(root));
				case 11:System.out.println("Enter number you want to search for");
						int w = in.nextInt();
						System.out.println("Tree contains " + w + "?: " + search(root, w)); 	
						break;
				case 0: //Exit
					break;
				default:
					System.out.println("Error");
			} //switch
		} while (op != 0);
		
	}//main
	static void generate (ArrayList<Integer> A, int n, int s, int e) { //Length n, range (s, e), no repeats
		int num = 0;
		do {
			num = (int) (Math.random() * (e-s)) + s;//creates range of numbers between e and s
			if (!A.contains(num)) //Prevents repeats
				A.add(num);//Adds unique element
		} while (A.size() < n);//ends when reached length n
	} //generate
	static int size(Nodes m) {
		int size = 1; //Current node
		if (m.left != null)
			size += size(m.left); //Left children nodes
		if (m.right != null)
			size += size(m.right); //Right children nodes
		return size;
	} //size
	
	static void leaves (Nodes m) {
		if (m.left == null && m.right == null) //Leaf, no children
			m.print();
		else {
			if (m.left != null)
				leaves(m.left); //Left children nodes			
			if (m.right != null)
				leaves(m.right); //Right children nodes
		} //else
	} //leaves
	
	static int height (Nodes m) {
		int h = 0;
		if (m.left == null && m.right == null)
			return 0;
		else if (m.left == null) //right is defined
			h = height(m.right) + 1;
		else if (m.right == null) //left is defined
			h = height(m.left) + 1;
		else 
			h = Math.max(height(m.right),height(m.left)) + 1;
		return h;
	}//height
	
	static void allNodes (Nodes m) {
		System.out.println("" + m + ((m.left == null) ? "- " : m.left) + ((m.right == null) ? "- " : m.right));
		if (m.left != null)
			allNodes(m.left);
		if (m.right != null)
			allNodes(m.right);
	} //allNodes
	public static String levelOrder(Nodes root) {
		String res = "";
		Nodes m;
		LinkedList <Nodes> Q = new LinkedList<>();
		Q.add(root);
		while (! Q.isEmpty()) {
			m = Q.pop();
			res += m.val + " ";
			if (m.left != null)
				Q.addLast(m.left);
			if (m.right != null)
				Q.addLast(m.right);
		} //while
		return res;
	} //levelOrder
	
	public static int max (Nodes m) {
		if (m.right == null) //If no right node, it is the max
			return m.val;
		else
			return max(m.right);
	}//max
	
	public static int min (Nodes m) {
		if (m.left == null) //If no left node, it is the min
		return m.val;
		else
			return min(m.right);
	}//min
	
	public static boolean search (Nodes m, int w) {
		if (w == m.val) //Base case, found!
			return (true);
		if (w < m.val && m.left != null) //Search left side
			return(search(m.left, w));
		else if (w > m.val && m.right != null) //Search right side
			return(search(m.right, w));	
		return (false); //Not found
	} //search
	
}//class main