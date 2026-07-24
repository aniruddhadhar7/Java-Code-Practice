/*
 * Question: Write a Java program to check whether a given number is a Spy number (sum of digits equals product of digits).
 */
import java.util.Scanner;

 class SpyNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int mul=1;
        int num=n;
        while(num!=0){
            int rem=num%10;
            sum+=rem;
            mul*=rem;
            num/=10;
        }
        if(sum==mul){
            System.err.println("Spy Number");
        }
        else{
            System.err.println("Not Spy");
        }
}
}
