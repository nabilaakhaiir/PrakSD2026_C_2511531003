package pekan6_2511531003;
import java.util.Scanner;
public class Musik_2511531003 {
	    private Lagu_2511531003 head_1003;
	    private Lagu_2511531003 tail_1003;

	    public Musik_2511531003() {
	        head_1003 = null;
	        tail_1003 = null;
	    }

	    // Menambahkan lagu baru di akhir playlist
	    public void tambahLagu_1003(String judul_1003, String penyanyi_1003) {
	        Lagu_2511531003 laguBaru_1003 = new Lagu_2511531003(judul_1003, penyanyi_1003);

	        if (head_1003 == null) {
	            head_1003 = laguBaru_1003;
	            tail_1003 = laguBaru_1003;
	        } else {
	            tail_1003.next_1003 = laguBaru_1003;
	            laguBaru_1003.prev_1003 = tail_1003;
	            tail_1003 = laguBaru_1003;
	        }

	        System.out.println("Lagu berhasil ditambahkan!");
	    }

	    // Menghapus lagu pertama
	    public void hapusLaguAwal_1003() {
	        if (head_1003 == null) {
	            System.out.println("Playlist masih kosong!");
	        } else if (head_1003 == tail_1003) {
	            System.out.println("Lagu \"" + head_1003.getJudul_1003() + "\" berhasil dihapus!");
	            head_1003 = null;
	            tail_1003 = null;
	        } else {
	            System.out.println("Lagu \"" + head_1003.getJudul_1003() + "\" berhasil dihapus!");
	            head_1003 = head_1003.next_1003;
	            head_1003.prev_1003 = null;
	        }
	    }

	    // Menampilkan playlist dari awal ke akhir
	    public void tampilMaju_1003() {
	        if (head_1003 == null) {
	            System.out.println("Playlist masih kosong!");
	            return;
	        }

	        Lagu_2511531003 curr_1003 = head_1003;
	        int nomor_1003 = 1;

	        System.out.println("\nDaftar Playlist Maju:");
	        while (curr_1003 != null) {
	            System.out.println(nomor_1003 + ". Judul: " + curr_1003.getJudul_1003()
	                    + " | Penyanyi: " + curr_1003.getPenyanyi_1003());
	            curr_1003 = curr_1003.next_1003;
	            nomor_1003++;
	        }
	    }

	    // Menampilkan playlist dari akhir ke awal
	    public void tampilMundur_1003() {
	        if (tail_1003 == null) {
	            System.out.println("Playlist masih kosong!");
	            return;
	        }

	        Lagu_2511531003 curr_1003 = tail_1003;
	        int nomor_1003 = 1;

	        System.out.println("\nDaftar Playlist Mundur:");
	        while (curr_1003 != null) {
	            System.out.println(nomor_1003 + ". Judul: " + curr_1003.getJudul_1003()
	                    + " | Penyanyi: " + curr_1003.getPenyanyi_1003());
	            curr_1003 = curr_1003.prev_1003;
	            nomor_1003++;
	        }
	    }

	    // Mencari lagu berdasarkan judul
	    public void cariLagu_1003(String judulCari_1003) {
	        if (head_1003 == null) {
	            System.out.println("Playlist masih kosong!");
	            return;
	        }

	        Lagu_2511531003 curr_1003 = head_1003;
	        boolean ditemukan_1003 = false;

	        while (curr_1003 != null) {
	            if (curr_1003.getJudul_1003().equalsIgnoreCase(judulCari_1003)) {
	                System.out.println("Lagu ditemukan!");
	                System.out.println("Judul    : " + curr_1003.getJudul_1003());
	                System.out.println("Penyanyi : " + curr_1003.getPenyanyi_1003());
	                ditemukan_1003 = true;
	                break;
	            }
	            curr_1003 = curr_1003.next_1003;
	        }

	        if (!ditemukan_1003) {
	            System.out.println("Lagu dengan judul \"" + judulCari_1003 + "\" tidak ditemukan!");
	        }
	    }

	    public static void main(String[] args) {
	        Scanner input_1003 = new Scanner(System.in);
	        Musik_2511531003 playlist_1003 = new Musik_2511531003();

	        int pilihan_1003;

	        do {
	            System.out.println("\n=== Playlist Musik NIM: 2511531003 ===");
	            System.out.println("1. Tambah Lagu");
	            System.out.println("2. Hapus Lagu Pertama");
	            System.out.println("3. Lihat Playlist (Maju)");
	            System.out.println("4. Lihat Playlist (Mundur)");
	            System.out.println("5. Cari Lagu");
	            System.out.println("6. Keluar");
	            System.out.print("Pilihan: ");
	            pilihan_1003 = input_1003.nextInt();
	            input_1003.nextLine();

	            switch (pilihan_1003) {
	                case 1:
	                    System.out.print("Judul: ");
	                    String judul_1003 = input_1003.nextLine();

	                    System.out.print("Penyanyi: ");
	                    String penyanyi_1003 = input_1003.nextLine();

	                    playlist_1003.tambahLagu_1003(judul_1003, penyanyi_1003);
	                    break;

	                case 2:
	                    playlist_1003.hapusLaguAwal_1003();
	                    break;

	                case 3:
	                    playlist_1003.tampilMaju_1003();
	                    break;

	                case 4:
	                    playlist_1003.tampilMundur_1003();
	                    break;

	                case 5:
	                    System.out.print("Masukkan judul lagu yang dicari: ");
	                    String cari_1003 = input_1003.nextLine();
	                    playlist_1003.cariLagu_1003(cari_1003);
	                    break;

	                case 6:
	                    System.out.println("Program selesai. Terima kasih!");
	                    break;

	                default:
	                    System.out.println("Pilihan tidak valid!");
	                    break;
	            }

	        } while (pilihan_1003 != 6);

	        input_1003.close();
	    }
	}

