package pekan1_2511531003;
import java.util.Scanner;
public class JamDriver2_2511531003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println ("=== program driver Objek jam ===");
		//1. Input Jam Pertama
		System.out.println ("\n--- Input Jam 1 ---");
		Jam_2511531003 j1 = buatJamDariInput (input);
		
		//1. Input Jam Kedua
		System.out.println ("\n--- Input Jam 2 ---");
		Jam_2511531003 j2 = buatJamDariInput (input);
		
		// 3. Menampilkan data
		System.out.println ("\n--- Hasil Operasi ---");
		System.out.println ("jam 1 (String)      : " + j1.toString());
		System.out.println ("jam 2 (String)      : " + j2.toString());
		System.out.println ("jam 1 dalam detik   : " + j1.toSecond());
		System.out.println ("jam 2 dalam detik   : " + j2.toSecond());
		
		//4. Operasi relasional (Perbandingan)
		int perbandingan = j1.compareTo(j2);
		if (perbandingan > 0) {
			System.out.println ("Status        : Jam 1 lebih lambat (setelah) Jam 2"); 
		} else if (perbandingan < 0) {
			System.out.println ("Status        : Jam 1 lebih lambat (sebelum) Jam 2");     
		}else {
			System.out.println ("Status        : Jam 1 lebih dan Jam 2 sama persis"); 
		}
		
		//5. Operasi Aritmatika
		System.out.println ("Durasi (J1 ke J2)        :  " + Jam_2511531003.durasiDetik (j1, j2) + " detik");
		
		Jam_2511531003 jNext = j1.nextSecond ();
		System.out.println ("Jam 1 Detik Berikutnya: " + jNext);
		
		Jam_2511531003 jPrev = j1.prevSecond ();
		System.out.println ("Jam 1 Detik Sebelumnya: " + jPrev);
		
		//6. operasi penjumlahan Jam
		
		Jam_2511531003 jHasilPlus = j1.plus(j2);
		System.out.println ("hasil J1 + J2      : " +jHasilPlus);
		
		input.close();
		System.out.println ("\n Program Selesai.");
	}
		/**
		 * prosedur pembantu untuk melakukan input dan validasi secara berulang
		 * sampai user memasukkan angka yang benar (0..23, 0..59).
		 */
		
		private static Jam_2511531003 buatJamDariInput (Scanner sc) {
			int h, m, s;
			while (true) {
				System.out.print("Masukkan jam (0-23)  : ");
				h = sc.nextInt ();
				 System.out.print("Masukkan Menit (0-59) : ");
	                m = sc.nextInt();
	                System.out.print("Masukkan Detik (0-59) : ");
	                s = sc.nextInt();

	                // Memanggil method static isValid dari kelas Jam
	                if (Jam_2511531003.isValid(h, m, s)) {
	                    return new Jam_2511531003(h, m, s);
	                } else {
	                    System.out.println("[Error] Input tidak valid! Silakan ulangi.\n");
	                

	
		 
	}}}}
