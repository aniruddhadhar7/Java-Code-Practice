/*
 * Question: Write a Java program to demonstrate basic user input and output operations using Scanner.
 */
import java.util.*;
public class InputOutputDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println(a);
        sc.close();
    }
}
