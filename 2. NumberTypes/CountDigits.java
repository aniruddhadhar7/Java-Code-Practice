/*
 * Question: Write a Java program to count the total number of digits in a given integer.
 */
import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        while(n!=0){
            count++;
            n/=10;
        }
        System.err.println(count);
    }
}
