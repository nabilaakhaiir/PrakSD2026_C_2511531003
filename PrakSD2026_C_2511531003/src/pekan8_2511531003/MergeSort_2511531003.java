package pekan8_2511531003;

public class MergeSort_2511531003 {

    void merge_1003(int arr[], int l_1003, int m_1003, int r_1003) {

        // Find sizes of two subarrays to be merged
        int n1_1003 = m_1003 - l_1003 + 1;
        int n2_1003 = r_1003 - m_1003;

        /* Create temp arrays */
        int L_1003[] = new int[n1_1003];
        int R_1003[] = new int[n2_1003];

        /* Copy data to temp arrays */
        for (int i_1003 = 0; i_1003 < n1_1003; ++i_1003)
            L_1003[i_1003] = arr[l_1003 + i_1003];

        for (int j_1003 = 0; j_1003 < n2_1003; ++j_1003)
            R_1003[j_1003] = arr[m_1003 + 1 + j_1003];

        int i_1003 = 0, j_1003 = 0;

        // Initial index of merged subarray array
        int k_1003 = l_1003;

        while (i_1003 < n1_1003 && j_1003 < n2_1003) {
            if (L_1003[i_1003] <= R_1003[j_1003]) {
                arr[k_1003] = L_1003[i_1003];
                i_1003++;
            } else {
                arr[k_1003] = R_1003[j_1003];
                j_1003++;
            }
            k_1003++;
        }

        /* Copy remaining elements of L[] if any */
        while (i_1003 < n1_1003) {
            arr[k_1003] = L_1003[i_1003];
            i_1003++;
            k_1003++;
        }

        /* Copy remaining elements of R[] if any */
        while (j_1003 < n2_1003) {
            arr[k_1003] = R_1003[j_1003];
            j_1003++;
            k_1003++;
        }
    }
    
    void sort_1003(int arr[], int l_1003, int r_1003) {
        if (l_1003 < r_1003) {

            // Find the middle point
            int m_1003 = (l_1003 + r_1003) / 2;

            // Sort first and second halves
            sort_1003(arr, l_1003, m_1003);
            sort_1003(arr, m_1003 + 1, r_1003);

            // Merge the sorted halves
            merge_1003(arr, l_1003, m_1003, r_1003);
        }
    }

    /* A utility function to print array of size n */
    static void printArray_1003(int arr[]) {
        int n_1003 = arr.length;

        for (int i_1003 = 0; i_1003 < n_1003; ++i_1003)
            System.out.print(arr[i_1003] + " ");

        System.out.println();
    }

    public static void main(String args[]) {

        int arr[] = {12, 11, 13, 5, 6, 7};

        System.out.print("Sebelum terurut : ");
        printArray_1003(arr);

        MergeSort_2511531003 ob_1003 = new MergeSort_2511531003();
        ob_1003.sort_1003(arr, 0, arr.length - 1);

        System.out.print("Sesudah Terurut Merge Sort : ");
        printArray_1003(arr);
    }
}