/*
 * Question: Write a Java program to calculate base raised to exponent (base^exp) using a loop.
 */
import java.util.Scanner;

public class CalculatePower {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=sc.nextInt();
        int m=1;
        for(int i=1;i<=p;i++){
            m=m*n;
        }
        System.err.println(m);
    }
}
