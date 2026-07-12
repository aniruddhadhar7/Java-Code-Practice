import java.util.Scanner;

public class reversenum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rem,rev=0,sum=0;
        while(n!=0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        sum+=rev;
        System.out.println(sum);
        sc.close();
    }
}
