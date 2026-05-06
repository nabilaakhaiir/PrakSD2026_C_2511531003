package pekan5_2511531003;

public class Pasien_2511531003 {
	  String namaPasien_1003;
	  String penyakit_1003;
	  int nomorAntrian_1003;
	  Pasien_2511531003 next_1003;

	    // Constructor
	    public Pasien_2511531003(String namaPasien_1003, String penyakit_1003, int nomorAntrian_1003) {
	        this.namaPasien_1003 = namaPasien_1003;
	        this.penyakit_1003 = penyakit_1003;
	        this.nomorAntrian_1003 = nomorAntrian_1003;
	        this.next_1003 = null;
	    }

	    // Getter
	    public String getNamaPasien_1003() {
	        return namaPasien_1003;
	    }

	    public String getPenyakit_1003() {
	        return penyakit_1003;
	    }

	    public int getNomorAntrian_1003() {
	        return nomorAntrian_1003;
	    }

	    public Pasien_2511531003 getNext_1003() {
	        return next_1003;
	    }

	    // Setter
	    public void setNamaPasien_1003(String namaPasien_1003) {
	        this.namaPasien_1003 = namaPasien_1003;
	    }

	    public void setPenyakit_1003(String penyakit_1003) {
	        this.penyakit_1003 = penyakit_1003;
	    }

	    public void setNomorAntrian_1003(int nomorAntrian_1003) {
	        this.nomorAntrian_1003 = nomorAntrian_1003;
	    }

	    public void setNext_1003(Pasien_2511531003 next_1003) {
	        this.next_1003 = next_1003;
	    }
	}

