package pekan2_2511531003;

import java.util.ArrayList;
import java.util.Scanner;

public class Playlist_2511531003 {
	//1.Method untuk menampilkan playlist musik
	public static void playlistMusik_2511531003() {
		System.out.println ("\n=== Playlist Musik NIM 2511531003 ===");
		System.out.println ("1. Tambah Lagu");
		System.out.println ("2. Lihat Playlist");
		System.out.println ("3. Hapus Lagu");
		System.out.println ("4. Cek kapasitas");
		System.out.println ("5. Keluar");
	}
	
	//2.Method untuk tambah lagu
	public static void tambahLagu_2511531003 (ArrayList<Musik_2511531003> List, Scanner sc) {
		System.out.print ("Masukkan Judul: ");
		String judul = sc.nextLine ();
		System.out.print ("Masukkan Penyanyi: ");
		String pengarang = sc.nextLine ();
		System.out.print ("Masukkan Durasi (detik): ");
		int durasi = sc.nextInt ();
		List.add(new Musik_2511531003 (judul,pengarang,durasi));
		System.out.println ("Lagu berhasil ditambahkan!");
		}
		
		//3.Method untuk lihat playlist
		public static void lihatPlaylist_2511531003 (ArrayList<Musik_2511531003>list) {
			if (list.isEmpty()) {
				System.out.println ("Daftar Playlist Kosong.");
			} else {
				System.out.println ("Lihat Playlist:");
				for (int i = 0; i < list.size(); i++) {
	                System.out.println((i + 1) + ". " + list.get(i));
				}
			}
		}
		
		//4. Method untuk hapus lagu
		public static void hapusLagu_2511531003(ArrayList<Musik_2511531003> list, Scanner sc) {
		    if (list.isEmpty()) {
		        System.out.println("Playlist kosong, tidak ada lagu yang bisa dihapus.");
		        return;
		    }

		    System.out.print("Masukkan nomor indeks lagu yang akan dihapus: ");
		    int index = sc.nextInt();
		    sc.nextLine();

		    if (index >= 1 && index <= list.size()) {
		        Musik_2511531003 removedSong = list.remove(index - 1);
		        System.out.println("Lagu berhasil dihapus: " + removedSong.judul_1003);
		    } else {
		        System.out.println("Indeks tidak valid.");
		    }
		}
		
		//4. Method cek kapasitas playlist
	    public static void cekKapasitas_2511531003(ArrayList<Musik_2511531003> list) {
	        System.out.println("Jumlah lagu dalam playlist: " + list.size());
	    }

	    public static void main(String[] args) {
		ArrayList <Musik_2511531003> musikList = new ArrayList<>();
		Scanner scanner = new Scanner (System.in);
		int choice;

  do {
	  playlistMusik_2511531003();
	  System.out.print ("Pilih : ");
	  choice = scanner.nextInt ();
	  scanner.nextLine();  //consume newline
	  
	  switch (choice) {
	  case 1 :
		  tambahLagu_2511531003(musikList, scanner);
		  break;
	  case 2 :
		  lihatPlaylist_2511531003(musikList);
		  break;
	  case 3 :
		  hapusLagu_2511531003(musikList, scanner);
		  break;
	  case 4 :
		  cekKapasitas_2511531003(musikList);
		  break;
	  case 5 :
		 System.out.println ("Keluar dari program.");
		  break;
		  default :
			  System.out.println ("Pilihan tidak valid.");
	  }
  } while (choice != 5);
  scanner.close ();
  }
  }

		

			

