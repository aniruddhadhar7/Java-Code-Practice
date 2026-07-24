/*
 * Question: Write a Java program to calculate the sum of all elements in an array.
 */
import java.util.Scanner;

public class SumOfArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int e : arr) {
            sum += e;
        }
        System.out.println("Sum is " + sum);
        sc.close();
    }
}
