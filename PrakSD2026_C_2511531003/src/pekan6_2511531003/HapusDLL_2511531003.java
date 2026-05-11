package pekan6_2511531003;

public class HapusDLL_2511531003 {
  //fungsi menghapus node awal
	public static NodeDLL_2511531003 delHead (NodeDLL_2511531003 head) {
		if (head == null) {
			return null;  }
			NodeDLL_2511531003 temp = head;
			head = head.next_1003;
			if (head != null) {
				head.prev_1003 = null;   }
				return head;
			}
			//fungsi menghapus di akhir
			public static NodeDLL_2511531003 delLast (NodeDLL_2511531003 head) {
				if (head == null) {
					return null;   }
				if (head.next_1003 == null) {
					return null;   }
				NodeDLL_2511531003 curr = head;
				while (curr.next_1003 != null) {
					curr = curr.next_1003;
					}
				//update pointer previous node
				if (curr.prev_1003 != null) {
					curr.prev_1003.next_1003 = null;  }
				return head;
		}
			//fungsi menghapus node posisi tertentu
			public static NodeDLL_2511531003 delPos (NodeDLL_2511531003 head, int pos) {
				//jika DLL kosong
				if (head == null) {
					return head;   }
				NodeDLL_2511531003 curr = head;
				//telusuri sampai ke node yang akan dihapus
				for (int i = 1; curr != null && i < pos; ++i) {
					curr = curr.next_1003;  }
					//jika posisi tidak ditemukan
					if (curr == null) {
						return head;  }
					//update pointer 
					if (curr.prev_1003 != null) {
						curr.prev_1003.next_1003 = curr.next_1003;  }
					if (curr.next_1003 != null) {
						curr.next_1003.prev_1003 = curr.prev_1003;   }
					//jika yang dihapus head
					if (head == curr) {
						head = curr.next_1003;   }
					return head;
					}
				//fungsi mencetak DLL
				public static void printList (NodeDLL_2511531003 head) {
					NodeDLL_2511531003 curr = head;
					while (curr != null) {
						System.out.print(curr.data_1003 + " ");
						curr = curr.next_1003;
					}
					System.out.println();
				}
				 public static void main(String[] args) {
				    // buat sebuah DLL
					NodeDLL_2511531003 head = new NodeDLL_2511531003(1);
					head.next_1003 = new NodeDLL_2511531003(2);
					head.next_1003.prev_1003 = head;
					head.next_1003.next_1003 = new NodeDLL_2511531003(3);
					head.next_1003.next_1003.prev_1003 = head.next_1003;
					head.next_1003.next_1003.next_1003 = new NodeDLL_2511531003(4);
					head.next_1003.next_1003.next_1003.prev_1003 = head.next_1003.next_1003;
					head.next_1003.next_1003.next_1003.next_1003 = new NodeDLL_2511531003(5);
					head.next_1003.next_1003.next_1003.next_1003.prev_1003 = head.next_1003.next_1003.next_1003;

					System.out.print("DLL Awal: ");
					printList(head);

					System.out.print("Setelah head dihapus: ");
					head = delHead(head);
					printList(head);

					System.out.print("Setelah node terakhir dihapus: ");
					head = delLast(head);
					printList(head);

					System.out.print("menghapus node ke 2: ");
					head = delPos(head, 2);

					printList(head);
		}
 }

