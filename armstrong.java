import java.util.Scanner;

class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original = n;
        int temp = n;
        int sum = 0;
        int count = 0;

        while (temp != 0) {
            count++;
            temp /= 10;
        }
        temp = n;
        while (temp != 0) {
            int rem = temp % 10;
            int po = 1;
            for (int i = 1; i <= count; i++) {
                po = po * rem;
            }
            sum += po;
            temp /= 10;
        }
        if (sum == original) {
            System.err.println("Armstrong");
        } else {
            System.err.println("Not");
        }
        sc.close();
    }

}
