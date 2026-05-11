package pekan6_2511531003;

public class PenelusuranDLL_2511531003 {
    //fungsi penelusuran maju
	static void forwardTraversal (NodeDLL_2511531003 head) {
		//memulai penelusuran dari head
		NodeDLL_2511531003 curr = head;
		//lanjutkan sampai akhir
		while (curr != null) {
			//print data'
			System.out.print(curr.data_1003 + " <-> ");
			//pindah ke node berikutnya
			curr = curr.next_1003;
		}
		//print spasi
		System.out.println();
	}
	//fungsi penelusuran mundur
	static void backwardTraversal (NodeDLL_2511531003 tail) {
		//mulai dari akhir
		NodeDLL_2511531003 curr = tail;
		//lanjutkan sampai head
		while (curr != null) {
			//cetakt data'
			System.out.print(curr.data_1003 + " <-> ");
			//pindah ke node sebelumnya
			curr = curr.prev_1003;
		}
		//print spasi
		System.out.println();
	}
	 public static void main(String[] args) {
		 //cetak DLL
		 NodeDLL_2511531003 head = new NodeDLL_2511531003 (1);
		 NodeDLL_2511531003 second = new NodeDLL_2511531003 (2);
		 NodeDLL_2511531003 third = new NodeDLL_2511531003 (3);
		 
		 head.next_1003 = second;
		 second.prev_1003 = head;
		 second.next_1003 = third;
		 third.prev_1003 = second;
		 
		 System.out.println("Penelusuran maju: ");
		 forwardTraversal(head);
		 
		 System.out.println("Penelusuran mundur: ");
		 backwardTraversal(third);
	 }
}
