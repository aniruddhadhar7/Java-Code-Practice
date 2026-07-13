import java.util.Scanner;

public class productofdigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int mul=1;
        while(n!=0){
            int r=n%10;
            mul*=r;
            n/=10;
        }
        System.err.println(mul);
    }
}
