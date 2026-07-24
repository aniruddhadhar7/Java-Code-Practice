/*
 * Question: Write a Java program to take two numbers as input and calculate their sum.
 */
import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a+b;
        System.out.println(c);
        sc.close();
    }
}
