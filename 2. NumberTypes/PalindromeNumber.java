/*
 * Question: Write a Java program to check whether a given integer is a Palindrome number.
 */
import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int n=num;
        int rem,rev=0,sum=0;
        while(n!=0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        sum+=rev;
        if(num==sum){
            System.out.println("Palindrome");
        }
        else{
            System.err.println("Not Palindrome");
        }
        sc.close();
    }
}
