/*
 * Question: Write a Java program to reverse a given integer number.
 */
import java.util.Scanner;

public class ReverseNumber {
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
