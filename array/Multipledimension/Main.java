package array.Multipledimension;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 4, 5};
        printArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void printArray(int[] arr) {
        arr[0] = 99;
    }
}