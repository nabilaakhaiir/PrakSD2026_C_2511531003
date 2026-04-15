package pekan1_2511531003;
import java.util.*;
public class Perpustakaan {
	
	    // LinkedList = koleksi buku
	    static LinkedList<Buku> koleksiBuku = new LinkedList<>();

	    // Queue = peminjaman
	    static Queue<Buku> peminjaman = new LinkedList<>();

	    // Stack = pengembalian
	    static Stack<Buku> pengembalian = new Stack<>();

	    static Scanner input = new Scanner(System.in);

	    // tambah buku
	    static void tambahBuku() {
	        System.out.print("Judul : ");
	        String judul = input.nextLine();

	        System.out.print("Pengarang : ");
	        String pengarang = input.nextLine();

	        System.out.print("ISBN : ");
	        String isbn = input.nextLine();

	        Buku buku = new Buku(judul, pengarang, isbn);
	        koleksiBuku.add(buku);

	        System.out.println("Buku berhasil ditambahkan!");
	    }

	    // tampil koleksi
	    static void tampilBuku() {
	        if (koleksiBuku.isEmpty()) {
	            System.out.println("Koleksi kosong!");
	            return;
	        }

	        for (Buku b : koleksiBuku) {
	            b.tampil();
	        }
	    }

	    // pinjam buku (QUEUE)
	    static void pinjamBuku() {
	        if (koleksiBuku.isEmpty()) {
	            System.out.println("Tidak ada buku!");
	            return;
	        }

	        Buku buku = koleksiBuku.removeFirst();
	        peminjaman.add(buku);

	        System.out.println("Buku dipinjam: " + buku.getJudul());
	    }

	    // kembalikan buku (STACK)
	    static void kembalikanBuku() {
	        if (peminjaman.isEmpty()) {
	            System.out.println("Tidak ada buku dipinjam!");
	            return;
	        }

	        Buku buku = ((LinkedList<Buku>) peminjaman).removeFirst();
	        pengembalian.push(buku);

	        System.out.println("Buku dikembalikan: " + buku.getJudul());
	    }

	    // tampil pengembalian
	    static void Pengembalian() {
	        if (pengembalian.isEmpty()) {
	            System.out.println("Belum ada pengembalian.");
	            return;
	        }

	        for (Buku b : pengembalian) {
	            b.tampil();
	        }
	    }

	    public static void main(String[] args) {

	        int pilih;

	        do {
	            System.out.println("\n=== SISTEM PERPUSTAKAAN ===");
	            System.out.println("1. Tambah Buku");
	            System.out.println("2. Lihat Koleksi");
	            System.out.println("3. Pinjam Buku");
	            System.out.println("4. Kembalikan Buku");
	            System.out.println("5. Lihat Pengembalian");
	            System.out.println("0. Keluar");
	            System.out.print("Pilih: ");

	            pilih = input.nextInt();
	            input.nextLine(); // buang enter

	            switch (pilih) {
	                case 1:
	                    tambahBuku();
	                    break;
	                case 2:
	                    tampilBuku();
	                    break;
	                case 3:
	                    pinjamBuku();
	                    break;
	                case 4:
	                    kembalikanBuku();
	                    break;
	                case 5:
	                    Pengembalian();
	                    break;
	                case 0:
	                    System.out.println("Terima kasih!");
	                    break;
	                default:
	                    System.out.println("Pilihan salah!");
	            }

	        } while (pilih != 0);
	    }
	}

