package pekan7_2511531003;

public class SelectionSort_2511531003 {
public static void selectionSort_2511531003 (int[] arr_1003) {
	int n = arr_1003.length;
	for (int i = 0; i < n; i++) {
		int minIndex = i;
		for (int j = i + 1; j < n; j++) {
			if (arr_1003[j] < arr_1003[minIndex]) {
				minIndex = j;
			}
		}
		int temp = arr_1003[i];
		arr_1003[i] = arr_1003[minIndex];
		arr_1003[minIndex] = temp;
	}
}
	public static void main(String[] args) {
		 int arr[] = { 23, 78, 45, 8, 32, 56, 1 };
		   int n = arr.length;
		   System.out.printf("Array yang belum terurut:\n");
		   for (int i = 0; i < n; i++)
			   System.out.print(arr[i] + " ");
		   System.out.println ("");
		   selectionSort_2511531003(arr);
		   System.out.printf("Array yang terurut:\n");
		   for (int i = 0; i < n; i++)
			   System.out.print(arr[i] + " ");
		   System.out.println("");
	   }
	}


