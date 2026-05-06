package pekan5_2511531003;
import java.util.Scanner;
public class RumahSakit_2511531003 {
    Pasien_2511531003 head_1003;
    int counter_1003;

	    public RumahSakit_2511531003() {
	        head_1003 = null;
	        counter_1003 = 0;
	    }

	    // 1. Daftarkan Pasien (Insert) 
	    public void daftarkanPasien_1003(String namaPasien_1003, String penyakit_1003) {
	        counter_1003++;

	        Pasien_2511531003 pasienBaru_1003 =
	                new Pasien_2511531003(namaPasien_1003, penyakit_1003, counter_1003);

	        if (head_1003 == null) {
	            head_1003 = pasienBaru_1003;
	        } else {
	            Pasien_2511531003 temp_1003 = head_1003;

	            while (temp_1003.getNext_1003() != null) {
	                temp_1003 = temp_1003.getNext_1003();
	            }

	            temp_1003.setNext_1003(pasienBaru_1003);
	        }

	        System.out.println("Pasien berhasil didaftarkan! Nomor Antrian: " + counter_1003);
	    }

	    // 2. Panggil Pasien (Delete head)
	    public void panggilPasien_1003() {
	        if (head_1003 == null) {
	            System.out.println("Antrian masih kosong.");
	        } else {
	            System.out.println("Pasien yang dipanggil:");
	            System.out.println("Nomor Antrian : " + head_1003.getNomorAntrian_1003());
	            System.out.println("Nama Pasien   : " + head_1003.getNamaPasien_1003());
	            System.out.println("Keluhan       : " + head_1003.getPenyakit_1003());

	            head_1003 = head_1003.getNext_1003();
	        }
	    }

	    // 3. Tampilkan Antrian (Display)
	    public void tampilkanAntrian_1003() {
	        if (head_1003 == null) {
	            System.out.println("Antrian masih kosong.");
	        } else {
	            Pasien_2511531003 temp_1003 = head_1003;

	            System.out.println("Daftar Antrian Pasien:");
	            while (temp_1003 != null) {
	                System.out.println("----------------------------");
	                System.out.println("Nomor Antrian : " + temp_1003.getNomorAntrian_1003());
	                System.out.println("Nama Pasien   : " + temp_1003.getNamaPasien_1003());
	                System.out.println("Keluhan       : " + temp_1003.getPenyakit_1003());

	                temp_1003 = temp_1003.getNext_1003();
	            }
	        }
	    }

	    // 4. Cari Pasien (Search)
	    public void cariPasien_1003(String namaCari_1003) {
	        if (head_1003 == null) {
	            System.out.println("Antrian masih kosong.");
	            return;
	        }

	        Pasien_2511531003 temp_1003 = head_1003;
	        boolean ditemukan_1003 = false;

	        while (temp_1003 != null) {
	            if (temp_1003.getNamaPasien_1003().equalsIgnoreCase(namaCari_1003)) {
	                System.out.println("Pasien ditemukan:");
	                System.out.println("Nomor Antrian : " + temp_1003.getNomorAntrian_1003());
	                System.out.println("Nama Pasien   : " + temp_1003.getNamaPasien_1003());
	                System.out.println("Keluhan       : " + temp_1003.getPenyakit_1003());
	                ditemukan_1003 = true;
	                break;
	            }

	            temp_1003 = temp_1003.getNext_1003();
	        }

	        if (!ditemukan_1003) {
	            System.out.println("Pasien tidak ditemukan.");
	        }
	    }

	    // 5. Cek Status Antrian
	    public void cekStatusAntrian_1003() {
	        if (head_1003 == null) {
	            System.out.println("Antrian masih kosong.");
	            return;
	        }

	        int jumlah_1003 = 0;
	        Pasien_2511531003 temp_1003 = head_1003;

	        while (temp_1003 != null) {
	            jumlah_1003++;
	            temp_1003 = temp_1003.getNext_1003();
	        }

	        System.out.println("Jumlah total pasien dalam antrian: " + jumlah_1003);
	        System.out.println("Pasien terdepan:");
	        System.out.println("Nomor Antrian : " + head_1003.getNomorAntrian_1003());
	        System.out.println("Nama Pasien   : " + head_1003.getNamaPasien_1003());
	        System.out.println("Keluhan       : " + head_1003.getPenyakit_1003());
	    }

	    // Main Program
	    public static void main(String[] args) {
	        Scanner input_1003 = new Scanner(System.in);
	        RumahSakit_2511531003 rs_1003 = new RumahSakit_2511531003();

	        int pilihan_1003;

	        do {
	            System.out.println("\n===== Antrian Rumah Sakit NIM: 2511531003 =====");
	            System.out.println("1. Daftarkan Pasien (Insert)");
	            System.out.println("2. Panggil Pasien   (Delete Head)");
	            System.out.println("3. Tampilkan Antrian (Display)");
	            System.out.println("4. Cari Pasien       (Search)");
	            System.out.println("5. Cek Status Antrian");
	            System.out.println("6. Keluar");
	            System.out.print("Pilihan: ");
	            pilihan_1003 = input_1003.nextInt();
	            input_1003.nextLine();

	            switch (pilihan_1003) {
	                case 1:
	                    System.out.print("Masukkan Nama Pasien : ");
	                    String namaPasien_1003 = input_1003.nextLine();

	                    System.out.print("Masukkan Keluhan     : ");
	                    String penyakit_1003 = input_1003.nextLine();

	                    rs_1003.daftarkanPasien_1003(namaPasien_1003, penyakit_1003);
	                    break;

	                case 2:
	                    rs_1003.panggilPasien_1003();
	                    break;

	                case 3:
	                    rs_1003.tampilkanAntrian_1003();
	                    break;

	                case 4:
	                    System.out.print("Masukkan nama pasien yang dicari: ");
	                    String namaCari_1003 = input_1003.nextLine();

	                    rs_1003.cariPasien_1003(namaCari_1003);
	                    break;

	                case 5:
	                    rs_1003.cekStatusAntrian_1003();
	                    break;

	                case 6:
	                    System.out.println("Program selesai. Terima kasih.");
	                    break;

	                default:
	                    System.out.println("Pilihan tidak valid.");
	                    break;
	            }

	        } while (pilihan_1003 != 6);

	        input_1003.close();
	    }
	}

