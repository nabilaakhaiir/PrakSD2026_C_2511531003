package pekan4_2511531003;

public class QueueArrayDriver_2511531003 {
	public static void main(String[] args) {
		QueueArray_2511531003 queue = new QueueArray_2511531003 (1000);
		queue.enqueue_1003 (10);
		queue.enqueue_1003 (20);
		queue.enqueue_1003 (30);
		queue.enqueue_1003 (40);
		System.out.println ("Item di depan " + queue.front_1003());
		System.out.println ("Item paling belakang " + queue.rear_1003());
		System.out.println ("tampilkan queue");
		queue.display_1003();
		System.out.println ();
		System.out.println (queue.dequeue_1003() + " dihapus dari queue");
		System.out.println ("Item di depan: " + queue.front_1003());
		System.out.println ("Item paling belakang: " + queue.rear_1003());
		System.out.println ("tampilkan queue setelah satu data dihapus");
		queue.display_1003();
	}
}
