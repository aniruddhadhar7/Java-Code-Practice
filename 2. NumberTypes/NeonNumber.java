/*
 * Question: Write a Java program to check whether a given number is a Neon number (a number where the sum of digits of its square equals the number itself).
 */
import java.util.Scanner;

public class NeonNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int square=n*n;
        int sum=0;
        while(square!=0){
            int rem=square%10;
            sum+=rem;
            square/=10;
        }
        if(sum==n){
            System.err.println("Neon Number");
        }
        else{
            System.err.println("Not Neon");
        }
        sc.close();
    }
}
