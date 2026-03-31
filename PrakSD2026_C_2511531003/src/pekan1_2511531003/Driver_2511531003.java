package pekan1_2511531003;
import java.util.ArrayList;
import java.util.Scanner;

public class Driver_2511531003 {
	static ArrayList<Mobil_2511531003> daftarMobil = new ArrayList<>();

    // tambah mobil
    public static void tambahMobil_2511531003(Mobil_2511531003 mobil) {
        daftarMobil.add(mobil);
        System.out.println("Mobil berhasil ditambahkan!");
    }

    // hapus mobil
    public static void hapusMobil(String nama) {
        boolean ditemukan = false;

        for (int i = 0; i < daftarMobil.size(); i++) {
            if (daftarMobil.get(i).getNama().equalsIgnoreCase(nama)) {
                daftarMobil.remove(i);
                ditemukan = true;
                System.out.println("Mobil berhasil dihapus!");
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Mobil tidak ditemukan!");
        }
    }

    // tampil mobil
    public static void tampilMobil() {
        if (daftarMobil.isEmpty()) {
            System.out.println("Data mobil kosong.");
        } else {
            for (Mobil_2511531003 m : daftarMobil) {
                m.tampil();
            }
        }
    }

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

                    Mobil_2511531003 m = new Mobil_2511531003(nama, tahun, cc, harga, merk);
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
