import java.util.*;
import java.lang.*;
import java.io.*;

class rotatearr2 {
    public static void rotatearr(int[] arr, int n) {
        int temp = arr[n - 1];
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        int arr[] = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        rotatearr(arr, n);

    }
}
