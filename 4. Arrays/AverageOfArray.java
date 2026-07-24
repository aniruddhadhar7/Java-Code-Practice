package Arrays;

/*
 * Question: Write a Java program to calculate the average of all elements in an integer array.
 */
import java.util.Scanner;

public class AverageOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum=0;
        float avg=0;
        for (int i : arr) {
            sum+=i;
            avg=(float)sum/n;
        }
        System.err.println(avg);
    }
}
