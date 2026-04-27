package pekan4_2511531003;

public class QueueArrayDriver_2511531003 {
	public static void main(String[] args) {
		QueueArray_2511531003 queue_1003 = new QueueArray_2511531003 (1000);
		queue_1003.enqueue_1003 (10);
		queue_1003.enqueue_1003 (20);
		queue_1003.enqueue_1003 (30);
		queue_1003.enqueue_1003 (40);
		System.out.println ("Item di depan " + queue_1003.front_1003());
		System.out.println ("Item paling belakang " + queue_1003.rear_1003());
		System.out.println ("tampilkan queue");
		queue_1003.display_1003();
		System.out.println ();
		System.out.println (queue_1003.dequeue_1003() + " dihapus dari queue");
		System.out.println ("Item di depan: " + queue_1003.front_1003());
		System.out.println ("Item paling belakang: " + queue_1003.rear_1003());
		System.out.println ("tampilkan queue setelah satu data dihapus");
		queue_1003.display_1003();
	}
}
