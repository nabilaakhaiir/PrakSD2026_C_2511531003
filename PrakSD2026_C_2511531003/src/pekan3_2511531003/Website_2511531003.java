package pekan3_2511531003;

public class Website_2511531003 {
	 String judul_1003;
     String url_1003;
    
     
     //constructor
     public Website_2511531003(String judul, String url) {
	        this.judul_1003 = judul;
	        this.url_1003 = url;
	    }
     
        // Setter
	    public void setJudul(String judul) {
	        this.judul_1003 = judul;
	    }

	    public void setUrl(String url) {
	        this.url_1003 = url;
	    }
	    
	    // Getter
	    public String getJudul() {
	        return judul_1003;
	    }

	    public String getUrl() {
	        return url_1003;
	    }

	    @Override
	    public String toString() {
	        return "Judul: " + judul_1003 +
	               ", Url: " + url_1003 ;
	    }
}


