package pekan4_2511531003;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class IterasiQueue_2511531003 {
	public static void main(String[] args) {
		{
			Queue<String> q_1003 = new LinkedList<>();
			
			q_1003.add("Praktikum");
			q_1003.add("Struktur");
			q_1003.add("Data");
			q_1003.add("Dan");
			q_1003.add("Algoritma");
			Iterator<String> iterator = q_1003.iterator();
			while (iterator.hasNext()) {
				System.out.print(iterator.next() + " ");
			}
		}
	}
}
