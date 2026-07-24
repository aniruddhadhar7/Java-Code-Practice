/*
 * Question: Write a Java program to check whether a given number is an Automorphic number (a number whose square ends in the same digits as the number itself).
 */
import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int square=n*n;
        int temp=n;
        while(temp!=0){
            if((temp%10)!=(square%10)){
                System.err.println("Not Automorphic");
                return;
            }
            temp/=10;
            square/=10;
        }
        System.err.println("Automorphic");
sc.close();
    }
}
