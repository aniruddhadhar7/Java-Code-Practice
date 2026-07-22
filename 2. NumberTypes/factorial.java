package NumberTypes;
import java.util.Scanner;

public class factorial {
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
