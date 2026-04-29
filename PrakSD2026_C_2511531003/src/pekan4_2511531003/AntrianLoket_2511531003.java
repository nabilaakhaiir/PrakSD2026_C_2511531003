package pekan4_2511531003;
import java.util.Scanner;
public class AntrianLoket_2511531003 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
	        Queue_2511531003 q_1003 = new Queue_2511531003(10);

	        int pilih;
	        String nama;

	        do {
	            System.out.println("\n=== PROGRAM ANTRIAN LOKET ===");
	            System.out.println("1. Tambah Antrian");
	            System.out.println("2. Hapus Antrian");
	            System.out.println("3. Tampilkan Antrian");
	            System.out.println("4. Reverse");
	            System.out.println("5. Keluar");
	            System.out.print("Pilih menu: ");
	            pilih = input.nextInt();
	            input.nextLine();

	            switch (pilih) {
	                case 1:
	                    System.out.print("Masukkan nama pelanggan: ");
	                    nama = input.nextLine();
	                    q_1003.enqueue_1003(nama);
	                    break;

	                case 2:
	                    q_1003.dequeue_1003();
	                    break;

	                case 3:
	                    q_1003.display_1003();
	                    break;

	                case 4:
	                    q_1003.reverse_1003();
	                    q_1003.display_1003();
	                    break;

	                case 5:
	                    System.out.println("Program selesai.");
	                    break;

	                default:
	                    System.out.println("Pilihan tidak valid!");
	            }

	        } while (pilih != 5);

	        input.close();
	    }
	}

	
