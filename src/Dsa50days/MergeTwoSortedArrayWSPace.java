package Dsa50days;
import java.util.Arrays;

public class MergeTwoSortedArrayWSPace {
    public static void merge(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;

        for (int i = 0; i < n; i++) {
            if (arr1[i] > arr2[0]) {
                // Swap arr1[i] with arr2[0]
                int temp = arr1[i];
                arr1[i] = arr2[0];
                arr2[0] = temp;

                // Re-sort arr2 to maintain order
                // Insertion sort for arr2[0]
                int first = arr2[0];
                int k;
                for (k = 1; k < m && arr2[k] < first; k++) {
                    arr2[k - 1] = arr2[k];
                }
                arr2[k - 1] = first;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 5, 9, 10};
        int[] arr2 = {2, 3, 8};

        merge(arr1, arr2);

        System.out.println("Merged arr1: " + Arrays.toString(arr1));
        System.out.println("Merged arr2: " + Arrays.toString(arr2));
    }
}
