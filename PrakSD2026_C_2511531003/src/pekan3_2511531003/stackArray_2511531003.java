package pekan3_2511531003;

public class stackArray_2511531003 {
     static final int MAX_1003 = 1000;
     int top;
     int a[] = new int [MAX_1003];
     boolean isEmpty_1003()
     {
    	 return (top < 0);
     }
     stackArray_2511531003()
     {
    	 top = -1;
     }
     boolean push (int x)
     {
    	 if (top >= (MAX_1003 - 1)) {
    		 System.out.println ("Stack Overflow");
    		 return false;
    	 }
    	 else {
    		 a[++top] = x;
    		 System.out.println (x + " dimasukkan dalam stack");
    		 return true;
    	 }
     }
     int pop()
     {
    	 if (top < 0) {
    		 System.out.println ("Stack Underflow");
    		 return 0;
    	 }
    	 else {
    		 int x = a[top--];
    		 return x;
    	 }
     }
     int peek()
     {
    	 if (top < 0) {
    		 System.out.println ("Stack Underflow");
    		 return 0;
    	 }
    	 else {
    		 int x = a[top];
    		 return x;
    		 
    	 }
     }
     void print () {
    	 for (int i = top;i>-1;i--) {
    		 System.out.print (" " + a[i]);
    	 }
     }
   }

