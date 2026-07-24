/*
 * Question: Write a Java program to check whether a given number is a Sunny number (a number where N+1 is a perfect square).
 */
import java.util.Scanner;

public class SunnyNumber {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int next=n+1;
        int root=(int)Math.sqrt(next);
        if(root*root==next){
            System.err.println("Sunny");

        }
        else{
            System.err.println("Not Sunny");
        }
}
}
