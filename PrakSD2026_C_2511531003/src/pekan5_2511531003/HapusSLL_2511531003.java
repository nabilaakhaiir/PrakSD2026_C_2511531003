package pekan5_2511531003;

public class HapusSLL_2511531003 {
   //fungsi untuk menghapus head
	public static NodeSLL_2511531003 deleteHead (NodeSLL_2511531003 head) {
		//jika SLL kosong
		if (head == null)
			return null;
		//pindahkan head ke node berikutnya
		head = head.next_1003;
		//return head baru
		return head;    }
		//fungsi menghapus node terakhir SLL
		public static NodeSLL_2511531003 removeLastNode (NodeSLL_2511531003 head_1003) {
			//jika list kosong, return null
			if (head_1003 == null) {
				return null;
			}
			//jika list satu node, hapus node dan return null
			if (head_1003.next_1003 == null) {
				return null;
			}
			//temukan node terakhir ke dua
			NodeSLL_2511531003 secondLast = head_1003;
			while (secondLast.next_1003.next_1003 != null) {
				secondLast = secondLast.next_1003;
			}
			//hapus node terakhir
			secondLast.next_1003 = null;
			return head_1003;    }
		//fungsi menghapus node di posisi tertentu
			public static NodeSLL_2511531003 deleteNode (NodeSLL_2511531003 head, int position_1003) {
				NodeSLL_2511531003 temp = head;
				NodeSLL_2511531003 prev = null;
				//jika linked list null
				if (temp == null)
					return head;
				//kasus 1 : head di hapus
				if (position_1003 == 1) {
					head = temp.next_1003;
					return head;   }
					//kasus 2: menghapus node di tengah
					//telusuri ke node yang di hapus
					for (int i =1 ; temp != null && i < position_1003; i++) {
						prev = temp;
						temp = temp.next_1003;    }
						//jika ditemukan, hapus node 
						if (temp != null) {
							prev.next_1003 = temp.next_1003;   
						}else {
							System.out.println("Data tidak ada");   }
							return head;   }
							//fungsi mencetak SLL
							 public static void printList (NodeSLL_2511531003 head) {
								 NodeSLL_2511531003 curr = head;
								 while (curr.next_1003 != null) {
									 System.out.print(curr.data_1003+"-->");
									 curr = curr.next_1003;  }
									 if (curr.next_1003==null) {
										 System.out.print(curr.data_1003);   }
									 System.out.println();  }
							 
							 //kelas main
							  public static void main(String[] args) {
								  //buat SLL 1->2->3->4->5->6->null
								  NodeSLL_2511531003 head = new NodeSLL_2511531003 (1);
								  head.next_1003 = new NodeSLL_2511531003 (2);
								  head.next_1003.next_1003 = new NodeSLL_2511531003 (3);
								  head.next_1003.next_1003.next_1003 = new NodeSLL_2511531003 (4);
								  head.next_1003.next_1003.next_1003.next_1003 = new NodeSLL_2511531003 (5);
								  head.next_1003.next_1003.next_1003.next_1003.next_1003 = new NodeSLL_2511531003 (6);
								  //cetak list awal
								  System.out.println ("list awal: ");
								  printList(head);
								  //hapus head
								  head = deleteHead (head);
								  System.out.println ("list setelah head dihapus: ");
								  printList(head);
								  //hapus node terakhir 
								  head = removeLastNode (head);
								  System.out.println ("list setelah simpul reakhir di hapus: ");
								  printList(head);
								  //Deleting node at position 2
								  int position = 2;
								  head = deleteNode (head, position);
								  //print list after deletion
								  System.out.println ("list setelah posisi 2 dihapus: ");
								  printList(head);
							  }
}
	

