package pekan9_2511531003;

public class BTreeDriver_2511531003 {
	public static void main(String[] args) {
		// membuat pohon
	BTree_2511531003 tree_1003 = new BTree_2511531003();
	System.out.print("Jumlah Simpul awal pohon: ");
	System.out.println(tree_1003.countNodes_1003());
	// menambahkan simpul data 1
	Node_2511531003 root_1003 = new Node_2511531003(1);
	// menjadikan simpul 1 sebagai root
	tree_1003.setRoot_1003(root_1003);
	System.out.println("Jumlah simpul jika hanya ada root");
	System.out.println(tree_1003.countNodes_1003());
	Node_2511531003 node2_1003 = new Node_2511531003(2);
	Node_2511531003 node3_1003 = new Node_2511531003(3);
	Node_2511531003 node4_1003 = new Node_2511531003(4);
	Node_2511531003 node5_1003 = new Node_2511531003(5);
	Node_2511531003 node6_1003 = new Node_2511531003(6);
	Node_2511531003 node7_1003 = new Node_2511531003(7);
	Node_2511531003 node8_1003 = new Node_2511531003(8);
	Node_2511531003 node9_1003 = new Node_2511531003(9);
	root_1003.setLeft_1003(node2_1003);
	node2_1003.setLeft_1003 (node4_1003);
	node2_1003.setRight_1003 (node5_1003);
	node4_1003.setRight_1003 (node8_1003);
	root_1003.setRight_1003(node3_1003);
	node3_1003.setLeft_1003 (node6_1003);
	node3_1003.setRight_1003 (node7_1003);
	node6_1003.setLeft_1003 (node9_1003);
	// set root_1003
	tree_1003.setCurrent_1003(tree_1003.getRoot_1003());
	System.out.println("menampilkan simpul terakhir:");
	System.out.println(tree_1003.getCurrent_1003().getData_1003());
	System.out.println("Jumlah simpul; setelah simpul 7 ditambahkan");
	System.out.println(tree_1003.countNodes_1003());
	System.out.println("InOrder: ");
	tree_1003.printInorder_1003();
	System.out.println("\nPreorder: ");
	tree_1003.printPreorder_1003();
	System.out.println("\nPostorder: ");
	tree_1003.printPostorder_1003();
	System.out.println("\nMenampilkan simpul dalam bentuk pohon");
	tree_1003.print_1003();
	}

}