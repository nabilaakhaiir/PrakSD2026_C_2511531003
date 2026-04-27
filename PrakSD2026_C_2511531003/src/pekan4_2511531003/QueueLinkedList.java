package pekan4_2511531003;

import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedList {

	public static void main(String[] args) {
		Queue<Integer> q_1003 = new LinkedList<>();
		//tambah elemen {0, 1, 2, 3, 4, 5} ke antrian
		for (int i = 0; i < 6; i++)
			q_1003.add(i);
		//Menampilkan isi antrian.
		System.out.println ("Elemen Antrian " + q_1003);
		//Untuk mengahpus kepala antrian.
		int hapus = q_1003.remove ();
		System.out.println ("Hapus Elemen = " + hapus);
		System.out.println (q_1003);
		//Untuk melihat antrian terdepan
		int depan = q_1003.peek();
		System.out.println ("Kepala Antrian = " + depan);
		
		int banyak = q_1003.size ();
		System.out.println ("Size Antrian " + banyak);
	}

}
