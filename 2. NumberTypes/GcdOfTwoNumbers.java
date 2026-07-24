/*
 * Question: Write a Java program to find the Greatest Common Divisor (GCD / HCF) of two numbers.
 */
import java.util.Scanner;

public class GcdOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        System.err.println(a);
    }
}
