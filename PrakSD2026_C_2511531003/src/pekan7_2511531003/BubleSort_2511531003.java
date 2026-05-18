package pekan7_2511531003;

public class BubleSort_2511531003 {
	public static void bubbleSort_2511531003 (int[] arr_1003) {
		int n = arr_1003.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr_1003[j] > arr_1003[j + 1]) {
					int temp = arr_1003[j];
					arr_1003 [j] = arr_1003 [j + 1];
					arr_1003[j + 1] = temp;
					//System.out.println ("data: "+arr[j]+" "+ arr[j+1});
				}
			}
		}
	}
		public static void main(String[] args) {
			 int arr[] = { 23, 78, 45, 8, 32, 56, 1 };
			   int n = arr.length;
			   System.out.print("Array yang belum terurut:");
			   for (int i = 0; i < n; i++)
				   System.out.print(arr[i] + " ");
			   System.out.println ("");
			   //minMaxSelectionSort(arr, n);
			   bubbleSort_2511531003 (arr);
			   System.out.print("Array yang terurut menggunakan BubbleSort:");
			   for (int i = 0; i < n; i++)
				   System.out.print(arr[i] + " ");
			   System.out.println("");
		   }
		}