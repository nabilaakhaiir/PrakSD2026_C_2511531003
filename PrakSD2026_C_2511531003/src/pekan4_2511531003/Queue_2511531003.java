package pekan4_2511531003;

public class Queue_2511531003 {
	int front, rear, max;
    String[] queue;

    public Queue_2511531003(int max) {
        this.max = max;
        queue = new String[max];
        front = -1;
        rear = -1;
    }

    boolean isEmpty_1003() {
        return front == -1;
    }

    boolean isFull_1003() {
        return rear == max - 1;
    }

    void enqueue_1003(String data) {
        if (isFull_1003()) {
            System.out.println("Antrian penuh!");
        } else {
            if (isEmpty_1003()) {
                front = 0;
            }
            rear++;
            queue[rear] = data;
            System.out.println("Data berhasil ditambahkan ke antrian");
        }
    }

    void dequeue_1003() {
        if (isEmpty_1003()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println(queue[front] + " telah dilayani");

            if (front == rear) {
                front = -1;
                rear = -1;
            } else {
                front++;
            }
        }
    }

    void display_1003() {
        if (isEmpty_1003()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println("Isi antrian:");
            for (int i = front; i <= rear; i++) {
                System.out.println((i - front + 1) + ". " + queue[i]);
            }
        }
    }

    void reverse_1003() {
        if (isEmpty_1003()) {
            System.out.println("Antrian kosong!");
        } else {
            int kiri = front;
            int kanan = rear;

            while (kiri < kanan) {
                String temp = queue[kiri];
                queue[kiri] = queue[kanan];
                queue[kanan] = temp;

                kiri++;
                kanan--;
            }

            System.out.println("Antrian berhasil dibalik");
        }
    }
}

