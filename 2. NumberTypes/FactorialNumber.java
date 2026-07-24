package NumberTypes;

/*
 * Question: Write a Java program to calculate the factorial of a given number.
 */
import java.util.Scanner;

public class FactorialNumber {
    public static long calcfactorial(int n) {
        long f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(calcfactorial(n));
    }
}
