package pekan2_2511531003;

public class DaftarKataDriver_2511531003 {

	public static void main(String[] args) {
	DaftarKata_2511531003 al = new  DaftarKata_2511531003();
	
	//Menambah elemen (akhir)
	al.tambah_2511531003("Kami");
	al.tambah_2511531003("Informatika");

	//Menyisipkan elemen pada indeks 1
	al.tambahPada_2511531003(1, "Mahasiswa");
	
	//Cetak isi awal
	System.out.println ("Awal      : " + al);
	
	//Mengubah elemen (index 1)
	al.ubahElemen_2511531003(1, "Departemen");
	System.out.println ("Setelah ubah: " + al);
	
	//menghapus elemen (hapus index 0)
	String terhapus = al.hapusElemen(0);
	System.out.println ("terhapus  : " + terhapus);
	System.out.println ("setelah hapus  : " + al);
	
	//Iterasi pada ArrayList (cetak setiap elemen)
	System.out.print ("Iterasi:");
	al.iterasiCetak_2511531003();
	System.out.println();
	}

}
