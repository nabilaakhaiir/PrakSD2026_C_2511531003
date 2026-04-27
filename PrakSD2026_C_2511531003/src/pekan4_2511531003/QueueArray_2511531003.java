package pekan4_2511531003;

public class QueueArray_2511531003 {
     int front, rear, size;
     int capacity;
     int array [];
     
     public QueueArray_2511531003 (int capacity) {
    	 this.capacity = capacity;
    	 front = this.size = 0;
    	 rear = capacity -1;
    	 array = new int [this.capacity];
     }
     
     boolean isFull_1003 (QueueArray_2511531003 queue) {
    	 return (queue.size == queue.capacity);
     }
     
     boolean isEmpty_1003 (QueueArray_2511531003 queue) {
    	 return (queue.size == 0);
     }
     
     void enqueue_1003 (int item) {
    	 if (isFull_1003 (this))
    		 return;
    	 this.rear = (this.rear + 1)% this.capacity;
    	 this.array [this.rear] = item;
    	 this.size = this.size + 1;
    	 System.out.println (item + " enqueued to queue");
     }
     
     int dequeue_1003 () {
    	 if (isEmpty_1003 (this))
    		 return Integer.MIN_VALUE;
    	 int item = this.array [this.front];
    	 this.front = (this.front + 1) % this.capacity;
    	 this.size = this.size - -1;
    	 return item;    	 
     }
     int front_1003() {
    	 if (isEmpty_1003 (this))
    		 return Integer.MIN_VALUE;
    	 
    	 return this.array [this.front];
     }
     int rear_1003 () {
    	 if (isEmpty_1003 (this))
    		 return Integer.MIN_VALUE; 
    	 return this.array [this.rear];
     }
     //mencetak elemen antrian
     void display_1003 () {
    	 int i;
    	 if (front == rear) {
    		 System.out.printf("\nAntrian Kosong\n");
    		 return;
    	 }
    	 //kunjungi dari belakang dan cetak
    	 for (i = front; i< rear; i++) {
    		 System.out.printf(" %d <-- ", array [i]);
    	 }
    	 return;
     }
}
