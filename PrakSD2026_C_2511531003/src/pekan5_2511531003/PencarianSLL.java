package pekan5_2511531003;

public class PencarianSLL {
   static boolean searchKey (NodeSLL_2511531003 head, int key_1003) {
	   NodeSLL_2511531003 curr_1003 = head;
	   while (curr_1003 != null) {
		   if (curr_1003.data_1003 == key_1003)
			   return true;
		   curr_1003 = curr_1003.next_1003;  }
		   return false;  }
   public static void traversal (NodeSLL_2511531003 head) {
	   //mulai dari head
	   NodeSLL_2511531003 curr_1003 = head;
	   //telusuri sampai pointer null
	   while (curr_1003 != null) {
		   System.out.print(" " + curr_1003.data_1003);
		   curr_1003 = curr_1003.next_1003;   }
	   System.out.println ();  }
	   public static void main(String[] args) {
		   NodeSLL_2511531003 head = new NodeSLL_2511531003 (14);
		   head.next_1003 = new NodeSLL_2511531003 (21);
		   head.next_1003.next_1003 = new NodeSLL_2511531003 (13);
		   head.next_1003.next_1003.next_1003 = new NodeSLL_2511531003 (30);
		   head.next_1003.next_1003.next_1003.next_1003 = new NodeSLL_2511531003 (10);
		   System.out.print("Penelusuran SLL : ");
		   traversal (head);
		   //data yang akan dicari
		   int key = 30;
		   System.out.print("cari data " +key+ " = ");
		   if (searchKey(head, key))
			   System.out.println("ketemu");
		   else
			   System.out.println("tidak ada");
	   }
   }

