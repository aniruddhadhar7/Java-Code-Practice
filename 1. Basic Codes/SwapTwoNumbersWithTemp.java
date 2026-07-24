/*
 * Question: Write a Java program to swap two numbers using a temporary variable.
 */
import java.util.Scanner;

public class SwapTwoNumbersWithTemp {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println(a+" "+b);
        sc.close();
    }
}
