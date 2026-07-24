/*
 * Question: Write a Java program to find the largest of two numbers using conditional statements.
 */
import java.util.Scanner;

public class LargestOfTwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>b){
            System.err.println(a+" is largest");
        }
        else{
            System.out.println(b+" is largest");
        }
        sc.close();
    }
}
