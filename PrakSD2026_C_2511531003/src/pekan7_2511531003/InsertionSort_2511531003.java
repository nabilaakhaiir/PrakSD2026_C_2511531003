package pekan7_2511531003;

public class InsertionSort_2511531003 {
   public static void insertionSort_2511531003 (int [] arr_1003) {
	   int n = arr_1003.length;
	   for (int i = 1; i < n; i++) {
		   int key = arr_1003[i];
		   int j = i - 1;
		   while (j >= 0 && arr_1003[j] > key) {
			   arr_1003 [j + 1] = arr_1003 [j];
			   j--;
		   }
		   arr_1003[j + 1] = key;
	   }
   }
   public static void main(String[] args) {
	   int arr[] = { 23, 78, 45, 8, 32, 56, 1 };
	   int n = arr.length;
	   System.out.printf("Array yang belum terurut:\n");
	   for (int i = 0; i < n; i++)
		   System.out.print(arr[i] + " ");
	   System.out.println ("");
	   insertionSort_2511531003(arr);
	   System.out.printf("Array yang terurut:\n");
	   for (int i = 0; i < n; i++)
		   System.out.print(arr[i] + " ");
	   System.out.println("");
   }
}
