package pekan1_2511531003;
import java.util.Scanner;

public class Driver_2511531003 {
	    static Mobil_2511531003[] daftarMobil = new Mobil_2511531003[100];
	    static int jumlah = 0;

	    // --- TAMBAH ---
	    public static void tambahMobil_2511531003(Mobil_2511531003 mobil) {

	        if (jumlah < daftarMobil.length) {
	            daftarMobil[jumlah] = mobil;
	            jumlah++;
	            System.out.println("Mobil berhasil ditambahkan!");
	        } else {
	            System.out.println("Array penuh!");
	        }
	    }

	    // ---- HAPUS ----
	    public static void hapusMobil(String nama) {

	        boolean ditemukan = false;

	        for (int i = 0; i < jumlah; i++) {
	            if (daftarMobil[i].getNama().equalsIgnoreCase(nama)) {

	                // geser data ke kiri
	                for (int j = i; j < jumlah - 1; j++) {
	                    daftarMobil[j] = daftarMobil[j + 1];
	                }

	                daftarMobil[jumlah - 1] = null;
	                jumlah--;

	                ditemukan = true;
	                System.out.println("Mobil berhasil dihapus!");
	                break;
	            }
	        }

	        if (!ditemukan) {
	            System.out.println("Mobil tidak ditemukan!");
	        }
	    }

	    // ---- TAMPIL ----
	    public static void tampilMobil() {

	        if (jumlah == 0) {
	            System.out.println("Data mobil kosong.");
	            return;
	        }

	        for (int i = 0; i < jumlah; i++) {
	            System.out.println("Data ke-" + (i + 1));
	            daftarMobil[i].tampil();
	        }
	    }

	    // ---- MAIN ----
	    public static void main(String[] args) {

	        Scanner input = new Scanner(System.in);
	        int pilih;

	        do {
	            System.out.println("\n=== MENU MOBIL ===");
	            System.out.println("1. Tambah Mobil");
	            System.out.println("2. Hapus Mobil");
	            System.out.println("3. Tampilkan Mobil");
	            System.out.println("4. Keluar");
	            System.out.print("Pilih: ");
	            pilih = input.nextInt();
	            input.nextLine();

	            switch (pilih) {

	                case 1:
	                    System.out.print("Nama Mobil : ");
	                    String nama = input.nextLine();

	                    System.out.print("Tahun : ");
	                    int tahun = input.nextInt();

	                    System.out.print("CC : ");
	                    int cc = input.nextInt();

	                    System.out.print("Harga : ");
	                    double harga = input.nextDouble();
	                    input.nextLine();

	                    System.out.print("Merk : ");
	                    String merk = input.nextLine();

	                    Mobil_2511531003 m =
	                        new Mobil_2511531003(nama, tahun, cc, harga, merk);

	                    tambahMobil_2511531003(m);
	                    break;

	                case 2:
	                    System.out.print("Nama mobil yang dihapus: ");
	                    String hapus = input.nextLine();
	                    hapusMobil(hapus);
	                    break;

	                case 3:
	                    tampilMobil();
	                    break;

	                case 4:
	                    System.out.println("Program selesai.");
	                    break;

	                default:
	                    System.out.println("Pilihan salah!");
	            }

	        } while (pilih != 4);

	        input.close();
	    }
	}
	    