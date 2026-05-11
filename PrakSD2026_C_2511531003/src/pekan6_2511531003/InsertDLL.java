package pekan6_2511531003;

public class InsertDLL {
   //menambahkan node di awal DLL
	static NodeDLL_2511531003 insertBegin (NodeDLL_2511531003 head_1003, int data) {
		//buat node baru 
		NodeDLL_2511531003 new_node = new NodeDLL_2511531003 (data);
		//jadikan pointer nextnya head
		new_node.next_1003 = head_1003;
		//jadikan pointer prev head ke new node 
		if (head_1003 != null) {
			head_1003.prev_1003 = new_node;
		}
		return new_node;
	}
	//fungsi menambahkan node di akhir
	public static NodeDLL_2511531003 insertEnd (NodeDLL_2511531003 head_1003, int newData) {
		//buat node baru
		NodeDLL_2511531003 newNode_1003 = new NodeDLL_2511531003 (newData);
		//jika dll null jadikan head 
		if (head_1003 == null) {
			head_1003 = newNode_1003;
		}
		else {
			NodeDLL_2511531003 curr_1003 = head_1003;
			while (curr_1003. next_1003 != null) {
				curr_1003 = curr_1003.next_1003;
			}
			curr_1003.next_1003 = newNode_1003;
			newNode_1003.prev_1003 = curr_1003;
		}
		return head_1003;
	}

//fungsi menambahkan node di posisi tertentu
public static NodeDLL_2511531003 insertAtPosition (NodeDLL_2511531003 head_1003, int pos_1003, int new_data_1003) {
	//buat node baru
	NodeDLL_2511531003 new_node = new NodeDLL_2511531003 (new_data_1003);
	if (pos_1003 == 1) {
		new_node.next_1003 = head_1003;
		if (head_1003!= null) {
			head_1003.prev_1003 = new_node;   }
			head_1003 = new_node;
			return head_1003;  }
	NodeDLL_2511531003 curr = head_1003;
	for (int i = 1; i < pos_1003 - 1 && curr != null; ++i) {
		curr = curr.next_1003;   }
		if (curr == null) {
			System.out.println ("Posisi tidak ada");
			return head_1003;  }
			new_node.prev_1003 = curr;
			new_node.next_1003 = curr.next_1003;
			curr.next_1003 = new_node;
			if (new_node.next_1003 != null) {
				new_node.next_1003.prev_1003 = new_node;  }
			return head_1003;
			}
		public static void printList (NodeDLL_2511531003 head) {
			NodeDLL_2511531003 curr = head;
			while (curr != null) {
				System.out.print (curr.data_1003 + " <-> ");
				curr = curr.next_1003;
			}
			System.out.println();
		}
		
		 public static void main(String[] args) {
			 //membuat dll 2 <-> 3 <-> 5
			 NodeDLL_2511531003 head = new NodeDLL_2511531003 (2);
			 head.next_1003 = new NodeDLL_2511531003 (3);
			 head.next_1003.prev_1003 = head;
			 head.next_1003.next_1003 = new NodeDLL_2511531003 (5);
			 head.next_1003.next_1003.prev_1003 = head.next_1003;
			 //cetak DLL awal
			 System.out.print ("DLL Awal: ");
			 printList (head);
			 //tambah 1 di awal
			 head = insertBegin (head, 1);
			 System.out.print(
					 "simpul 1 ditambah di awal: ");
			 printList(head);
			 //tambah 6 di akhir
			 System.out.print(
					 "simpul 6 ditambah di akhir: ");
			 int data = 6;
			 head = insertEnd (head, data);
			 printList(head);
			 //menambah node 4 di posisi 4
			 System.out.print("tambah node 4 diposisi 4: ");
			 int data2 = 4;
			 int pos = 4;
			 head = insertAtPosition (head, pos, data2);
			 printList(head);
		 }
	}


