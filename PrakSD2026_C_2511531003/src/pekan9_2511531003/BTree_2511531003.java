package pekan9_2511531003;

public class BTree_2511531003 {
	private Node_2511531003 root_1003;
	private Node_2511531003 currentNode_1003;
	public BTree_2511531003() {
		root_1003 = null;
	}
	public boolean search_1003(int data_1003) {
		return search_1003(root_1003, data_1003);
	}
	private boolean search_1003(Node_2511531003 node_1003, int data_1003) {
		if (node_1003.getData_1003() == data_1003)
			return true;
		if (node_1003.getLeft_1003() != null)
			return true;
		if (node_1003.getRight_1003() != null)
				if (search_1003(node_1003.getRight_1003(),data_1003))
					return true;
		return false;
	}
	public void printInorder_1003() {
		root_1003.printInorder_1003(root_1003);			
	}
	public void printPreorder_1003() {
		root_1003.printPreorder_1003(root_1003);
	}
	public void printPostorder_1003() {
		root_1003.printPostorder_1003(root_1003);
	}
	public Node_2511531003 getRoot_1003() {
		return root_1003;
	}
	public boolean isEmpty_1003() {
		return root_1003 == null;
	}
	public int countNodes_1003() {
		return countNodes_1003(root_1003);
	}
	private int countNodes_1003(Node_2511531003 node_1003) {
		int count_1003 = 1;
		if (node_1003 == null) {
			return 0;
		} else {
			count_1003 += countNodes_1003(node_1003.getLeft_1003());
			count_1003 += countNodes_1003(node_1003.getRight_1003());
			return count_1003;
		}
	}
	public void print_1003() {
		root_1003.print_1003();
	}
	public Node_2511531003 getCurrent_1003() {
		return currentNode_1003;
	}
	public void setCurrent_1003(Node_2511531003 node_1003) {
		this.currentNode_1003 = node_1003;
	}
	public void setRoot_1003 (Node_2511531003 root_1003) {
		this.root_1003 = root_1003;
	}

}