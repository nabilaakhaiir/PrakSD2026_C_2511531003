package pekan1_2511531003;

public class Buku {
	
	    private String judul;
	    private String pengarang;
	    private String isbn;

	    // Constructor
	    public Buku(String judul, String pengarang, String isbn) {
	        this.judul = judul;
	        this.pengarang = pengarang;
	        this.isbn = isbn;
	    }

	    // Setter
	    public void setJudul(String judul) {
	        this.judul = judul;
	    }

	    public void setPengarang(String pengarang) {
	        this.pengarang = pengarang;
	    }

	    public void setIsbn(String isbn) {
	        this.isbn = isbn;
	    }

	    // Getter
	    public String getJudul() {
	        return judul;
	    }

	    public String getPengarang() {
	        return pengarang;
	    }

	    public String getIsbn() {
	        return isbn;
	    }

	    public void tampil() {
	        System.out.println("Judul : " + judul);
	        System.out.println("Pengarang : " + pengarang);
	        System.out.println("ISBN : " + isbn);
	        System.out.println("-------------------");
	    }
	}