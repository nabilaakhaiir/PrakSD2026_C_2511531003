package pekan2_2511531003;

public class Musik_2511531003 {
      String judul_1003;
      String penyanyi_1003;
      int durasi_1003;
      
      //constructor
      public Musik_2511531003(String judul, String penyanyi, int durasi) {
	        this.judul_1003 = judul;
	        this.penyanyi_1003 = penyanyi;
	        this.durasi_1003 = durasi;
	    }
      
         // Setter
	    public void setJudul(String judul) {
	        this.judul_1003 = judul;
	    }

	    public void setPengarang(String penyanyi) {
	        this.penyanyi_1003 = penyanyi;
	    }

	    public void setDurasi(int durasi) {
	        this.durasi_1003 = durasi;
	    }
	    
	    // Getter
	    public String getJudul() {
	        return judul_1003;
	    }

	    public String getPenyanyi() {
	        return penyanyi_1003;
	    }

	    public int getDurasi() {
	        return durasi_1003;
	    }
	    
	    @Override
	    public String toString() {
	        return "Judul: " + judul_1003 +
	               ", Penyanyi: " + penyanyi_1003 +
	               ", Durasi: " + durasi_1003 + " detik";
	    }
}
