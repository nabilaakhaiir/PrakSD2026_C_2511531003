package pekan5_2511531003;

public class TambahSSL_2511531003 {
   public static NodeSLL_2511531003 insertAtFront (NodeSLL_2511531003 head, int value_1003) {
	   NodeSLL_2511531003 new_node = new NodeSLL_2511531003 (value_1003);
	   new_node.next_1003 = head;
	   return new_node;
   }
   //fungsi menambahkan node di akhir SLL
   public static NodeSLL_2511531003 insertAtEnd (NodeSLL_2511531003 head, int value_1003) {
	   //buat sebuah node dengan sebuah nilai
	   NodeSLL_2511531003 newNode = new NodeSLL_2511531003 (value_1003);
	   //jika list kosong maka node menjadi head 
	   if (head == null) {
		   return newNode;
	   }
	   //simpan head ke variabel sementara
	   NodeSLL_2511531003 last = head;
	   //telusuri ke node akhir
	   while (last.next_1003 != null) {
		   last = last.next_1003;
	   }
	   //ubah pointer 
	   last.next_1003 = newNode;
	   return head;
   }
   static NodeSLL_2511531003 GetNode (int data_1003) {
	   return new NodeSLL_2511531003 (data_1003);
   }
   static NodeSLL_2511531003 insertPos(NodeSLL_2511531003 headNode, int position_1003, int value_1003) {
	   NodeSLL_2511531003 head = headNode;
	   if (position_1003 < 1)
		   System.out.print("Invalid position");
		   if (position_1003 == 1) {
			   NodeSLL_2511531003 new_node = new NodeSLL_2511531003 (value_1003);
			   new_node.next_1003 = head;
			   return new_node;
		   }else {
			   while (position_1003-- != 0) {
				   if (position_1003 == 1) {
					   NodeSLL_2511531003 newNode = GetNode (value_1003);
					   newNode.next_1003 = headNode.next_1003;
					   headNode.next_1003 = newNode;
					   break;
				   }
				   headNode = headNode.next_1003;
			   }
			   if (position_1003 != 1)
				   System.out.print("Posisi di luar jangkauan");  }
			   return head;   }
			   public static void printList (NodeSLL_2511531003 head) {
				   NodeSLL_2511531003 curr = head;
				   while (curr.next_1003 != null) {
					   System.out.print(curr.data_1003+"-->");
					   curr = curr.next_1003;
				   }
				   if (curr.next_1003 == null) {
					   System.out.print(curr.data_1003);   }
					   System.out.println();   }
				   
				   public static void main(String[] args) {
					   //buat linked list 2->3->5->6
					   NodeSLL_2511531003 head = new NodeSLL_2511531003(2);
					   head.next_1003 = new NodeSLL_2511531003 (3);
					   head.next_1003.next_1003 = new NodeSLL_2511531003 (5);
					   head.next_1003.next_1003.next_1003 = new NodeSLL_2511531003 (6);
					   //cetak list asli
					   System.out.print("Senarai berantai awal:");
					   printList(head);
					   //tambahkan node baru di depan
					   System.out.print("tambah 1 simpul di depan: ");
					   int data = 1;
					   head = insertAtFront (head, data);
					   //cetak update list
					   printList(head);
					   //tambahkan node baru dibelakang
					   System.out.print("tambah 1 simpul di belakang: ");
					   int data2 = 7;
					   head = insertAtEnd (head, data2);
					   //cetak update list
					   printList(head);
					   System.out.print("tambah 1 simpul ke data ke 4: ");
					   int data3 = 4;
					   int pos = 4;
					   head = insertPos(head,pos,data3);
					   //cetak update list
					   printList(head);
				   }
}
			   
   

