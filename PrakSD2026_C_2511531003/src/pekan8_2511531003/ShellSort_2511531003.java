package pekan8_2511531003;

public class ShellSort_2511531003 {
public static void ShellSort_2511531003 (int[] A) {
	int n_1003 = A.length;
	int gap = n_1003/2;
	while (gap > 0) {
		for (int i = gap; i< n_1003; i++) {
			int temp = A [i];
			int j = i;
			while (j >= gap && A[j - gap] > temp) {
				A[j] = A [j - gap];
				j = j - gap;
			}
			A[j] = temp;
		}
		gap = gap/2 ;
	}
}

public static void main(String[] args) {
	int[] data = {3, 10, 4, 6, 8, 9, 7, 2, 1, 5};
	
	System.out.print ("Sebelum: ");
	printArray(data);
	
	ShellSort_2511531003 (data);
	
	System.out.print ("Sesudah (Shell Sort): ");
	printArray(data);
}

public static void printArray(int [] arr) {
	for (int i : arr) System.out.print (i + " ");
	System.out.println ();
    }
}
