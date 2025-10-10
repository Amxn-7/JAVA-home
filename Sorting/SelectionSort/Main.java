package Sorting.SelectionSort;
import java.util.Arrays; // Use Arrays, not Array
// import java.util.Scanner;
public class Main {
    public static void main(String[] args) { // main should be public
        int[] arr = new int[]{5,3,7,2,1}; // Use new int[]{...}
        for (int i = 0; i < arr.length - 1; i++) {
            int mini = i;
            for (int j = i + 1; j < arr.length; j++) { // Use < instead of <=
                if (arr[j] < arr[mini]) {
                    mini = j;
                }
            }
            // Swap arr[i] and arr[mini]
            int temp = arr[i];
            arr[i] = arr[mini];
            arr[mini] = temp;
            System.out.println(Arrays.toString(arr)); // Use Arrays, not Array, and System, not Systm
        }
    }
}