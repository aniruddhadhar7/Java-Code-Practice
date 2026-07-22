package Arrays;
import java.util.Scanner;

public class Averagearray {
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
