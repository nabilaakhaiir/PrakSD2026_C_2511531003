package pekan9_2511531003;

public class Node_2511531003 {
    int data;
    Node_2511531003 left;
    Node_2511531003 right;
    public Node_2511531003(int data) {
    	this.data = data;
    	left = null;
    	right = null;   	
    }
    public void setLeft_1003 (Node_2511531003 node) {
    	if (left == null)
    		left = node;  	
    }
    public void setRight_1003 (Node_2511531003 node) {
    	if (right == null)
    		right = node;  	
    }
    public Node_2511531003 getLeft_1003 () {
    	return left;
    }
    public Node_2511531003 getRight_1003() {
    	return right;
    }
    public int getData_1003 () {
    	return data;
    }
    public void setData_1003 (int data) {
    	this.data = data;
    }
    
    void printPreorder_1003 (Node_2511531003 node) {
    	if (node == null)
    		return;
    	System.out.print (node.data + " ");
    	printPreorder_1003 (node.left);
    	printPreorder_1003 (node.right);
    }
    void printPostorder_1003 (Node_2511531003 node) {
    	if (node == null)
    		return;
    	printPostorder_1003 (node.left);
    	printPostorder_1003 (node.right);
    	System.out.print (node.data + " ");
    }
    void printInorder_1003 (Node_2511531003 node) {
    	if (node == null)
    		return;
    	printInorder_1003(node.left);
    	System.out.print (node.data + " ");
    	printInorder_1003 (node.right);
    }
    public String print_1003 () {
    	return this.print("",true,"");
    }
    public String print (String prefix, boolean isTail, String sb) {
    	if (right != null) {
    		right.print (prefix + (isTail ? "|  " : "  "), false, sb);
    	}
    	System.out.println(
    	        prefix + (isTail ? "\\-- " : "/-- ") + data
    	    );
    	    if (left != null) {
    	        left.print(prefix + (isTail ? "    " : "|   "), true, sb);
    	    }
    	    return sb;
    	}
    }
    
