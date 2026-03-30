package pekan1_2511531003;

public class Jamdriver_2511531003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Jam_2511531003 a = new Jam_2511531003 (23, 59, 50);
     Jam_2511531003 b = new Jam_2511531003 (0, 0 ,15);
     System.out.println ("a        = " + a);
     System.out.println ("b        = " + b);
     System.out.println ("a+b      = " + a.plus (b));
     System.out.println ("next 20s = " + a.nextNSeconds(20));
     System.out.println ("durasi (a,b) = " + Jam_2511531003.durasiDetik(a, b));
     System.out.println ("a.compareto (b) = " + a.compareTo(b));
	}

}
