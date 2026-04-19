package pekan3_2511531003;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Browser_2511531003 {
	public static void Browser_2511531003() {
		System.out.println ("\n=== Browser History NIM 2511531003 ===");
		System.out.println ("1. Kunjungi Website (push)");
		System.out.println ("2. Tombol Back (pop)");
		System.out.println ("3. Lihat halaman aktif (peek)");
		System.out.println ("4. Cek Status History");
		System.out.println ("5. Keluar");
	}
	
    	//2.Method untuk kunjungi website
		public static void kunjungiWebsite_2511531003 (Stack<Website_2511531003> history, Scanner sc) {
			System.out.print ("Masukkan Judul: ");
			String judul = sc.nextLine ();
			System.out.print ("Masukkan URL: ");
			String url = sc.nextLine ();
			history.push(new Website_2511531003(judul,url));
			System.out.println ("Berhasil mengunjungi halaman!");
		}
		
		//3.Method untuk tombol back
		public static void tombolBack_2511531003 (Stack<Website_2511531003> history, Scanner sc) {
			if (!history.isEmpty()) {
				Website_2511531003 hapus = history.pop();
				System.out.println ("Halaman dihapus : " + hapus.getJudul());
			} else {
				System.out.println ("History Kosong!");
			}
		}
		
		//4.Method untuk lihat halaman aktif
		public static void lihatHalamanAktif_2511531003 (Stack<Website_2511531003> history) {
			if (!history.isEmpty()) {
				System.out.println ("Halaman aktif :");
				System.out.println (history.peek());
			} else {
				System.out.println ("tidak ada halaman aktif!");
			}
		}

       //5.Method untuk cek status history
       public static void cekHistory_2511531003 (Stack<Website_2511531003> history) {
    	   if (history.isEmpty()) {
    		   System.out.println ("History kosong!");
    	   } else {
    		   System.out.println("Jumlah History: " + history.size());
    	   }
       }
       
    	   public static void main(String[] args) {
    		   Stack <Website_2511531003> websiteList = new Stack<>();
    			Scanner scanner = new Scanner (System.in);
    			int choice;

    	  do {
    		  Browser_2511531003();
    		  System.out.print ("Pilihan: ");
    		  choice = scanner.nextInt ();
    		  scanner.nextLine();   
    		  
    		  switch (choice) {
    		  case 1 :
    			  kunjungiWebsite_2511531003(websiteList, scanner);
    			  break;
    		  case 2 :
    			  tombolBack_2511531003(websiteList, scanner);
    			  break;
    		  case 3 :
    			  lihatHalamanAktif_2511531003(websiteList);
    			  break;
    		  case 4 :
    			  cekHistory_2511531003(websiteList);
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
       

       
