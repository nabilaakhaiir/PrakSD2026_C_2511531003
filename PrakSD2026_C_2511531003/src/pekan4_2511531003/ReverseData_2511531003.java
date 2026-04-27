package pekan4_2511531003;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseData_2511531003 {

	public static void main(String[] args) {
		Queue<Integer> q_1003 = new LinkedList<Integer>();
		q_1003.add(1);
		q_1003.add(2);
		q_1003.add(3); //[1, 2, 3]
		System.out.println ("Sebelum reverse = " + q_1003);
		Stack<Integer> s = new Stack<Integer>();
		while (!q_1003.isEmpty()) { //Q -> S
			s.push (q_1003.remove());			
		}
		while (!s.isEmpty()) { //S -> Q
			q_1003.add (s.pop());
	}
		System.out.println ("Sesudah reverse = " + q_1003); // [3, 2, 1]
	}
	}
