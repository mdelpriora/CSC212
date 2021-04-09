
class Nodes{
	int val;
	Nodes left;
	Nodes right;
	
	public Nodes (int val) {
		this.val = val;
		left = null;
		right = null;
	} //Node
	
	public void createNode (int v) {
		Nodes w = new Nodes(v); //Make new node
		if (v > val) { //>
			if (right == null) //If empty, fill position
				right = w;
			else
				right.createNode(v);
		}
		if (v < val) { //<
			if (left == null) //If empty, fill position
				left = w;
			else
				left.createNode(v);
		} //if
	} //createNode
	
	public void inOrder() {//Left N Right
		if (left != null)
			left.inOrder();
		System.out.print(val + " ");
		if (right != null)
			right.inOrder();
	} //inOrder
	
	public void preOrder() {//N Left Right
		System.out.print(val + " ");
		if (left != null)
			left.preOrder();
		if (right != null)
			right.preOrder();
	} //preOrder
	
	public void postOrder() {//Left Right N
		if (left != null)
			left.postOrder();
		if (right != null)
			right.postOrder();
		System.out.print(val + " ");
	} //postOrder
	
	public String toString () {
		return (val + " ");
	} //toString
	
	public void print () {
		System.out.print(val + " ");
	} //print
}


