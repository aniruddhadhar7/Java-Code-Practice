/*
 * Question: Write a Java program to find the smallest among three numbers.
 */
import java.util.Scanner;

public class SmallestOfThree {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a<b && a<c){
            System.err.println(a+" is smallest");
        }
        else if(b<a && b<c){
            System.out.println(b+" is smallest");
        }
        else{
            System.out.println(c+" is smallest");
        }
        sc.close();
}
}
