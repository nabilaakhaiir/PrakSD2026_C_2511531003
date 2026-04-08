package pekan3_2511531003;
import java.util.Scanner;
import java.util.Stack;

public class StackPostfix_2511531003 {
    public static int postfixEvaluate (String expression) {
    	Stack <Integer> s_1003 = new Stack <Integer>();
    	Scanner input = new Scanner (expression);
    	while (input.hasNext()) {
    		if (input.hasNextInt()) {   //an operand (integer)
    			s_1003.push(input.nextInt());
    		}else {
    			String operator = input.next();
    			int operand2_1003 = s_1003.pop();
    			int operand1_1003 = s_1003.pop();
    			if (operator.equals("+")) {
    				s_1003.push(operand1_1003 + operand2_1003);
    			} else if (operator.equals("-")) {
    				s_1003.push(operand1_1003 - operand2_1003);
    			} else if (operator.equals("*")) {
    				s_1003.push(operand1_1003 * operand2_1003);
    			} else {
    				s_1003.push(operand1_1003 / operand2_1003);
    		}
    	}
    }
    	input.close();
    	return s_1003.pop ();
}
    public static void main (String [] args) {
    	System.out.println ("hasil postfix= "+postfixEvaluate ("5 2 4 * + 7 -"));
    }
}
