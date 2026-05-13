package pekan6_2511531003;

public class Lagu_2511531003 {
	    private String judul_1003;
	    private String penyanyi_1003;
	    Lagu_2511531003 next_1003;
	    Lagu_2511531003 prev_1003;

	    public Lagu_2511531003(String judul_1003, String penyanyi_1003) {
	        this.judul_1003 = judul_1003;
	        this.penyanyi_1003 = penyanyi_1003;
	        this.next_1003 = null;
	        this.prev_1003 = null;
	    }

	    public String getJudul_1003() {
	        return judul_1003;
	    }

	    public void setJudul_1003(String judul_1003) {
	        this.judul_1003 = judul_1003;
	    }

	    public String getPenyanyi_1003() {
	        return penyanyi_1003;
	    }

	    public void setPenyanyi_1003(String penyanyi_1003) {
	        this.penyanyi_1003 = penyanyi_1003;
	    }
	}

