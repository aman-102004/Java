package Dsa50days;
import java.util.Arrays;

public class arrayRotatenSort {

    public static void RnS(int [] arr){

        int count = 0;
        int n = arr.length;

        // Count how many times arr[i] > arr[i+1]
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                count++;
            }
        }



        if (count == 0) {
            System.out.println("The array is sorted only.");
        } else if (count == 1) {
            System.out.println("The array is sorted and rotated.");
        } else {
            System.out.println("The array is not sorted.");
        }
    }





    public static void main(String[] args) {

        int [] arr={6,1,2,3,5};
        RnS(arr);
    }
}
