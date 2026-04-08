package pekan3_2511531003;
import java.util.Stack;
public class NilaiMaksimum_2511531003 {
public static int max (Stack<Integer> s_1003) {
	Stack <Integer> backup = new Stack <Integer> ();
	int maxValue = s_1003.pop();
	backup.push (maxValue);
	while (!s_1003.isEmpty ()) {
		int next = s_1003.pop ();
		backup.push (next);
		maxValue = Math.max (maxValue, next);
	}
	while (!backup.isEmpty()) {
	s_1003.push (backup.pop());
	}
    return maxValue;
    }
	public static void main(String[] args) {
		Stack <Integer> s_1003 = new Stack <Integer> ();
		s_1003.push (70);
		s_1003.push (12);
		s_1003.push (20);
		System.out.println ("isi stack "+s_1003);
		System.out.println ("Stack teratas "+s_1003.peek());
		System.out.println ("Nilai maksimum "+max(s_1003));
	}
}
