/*
 * Question: Write a Java program to display all prime numbers within a given range.
 */
import java.util.Scanner;

public class PrimeNumbersInRange {
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r1=sc.nextInt();
        int r2=sc.nextInt();
        for(int i=r1;i<=r2;i++){
            if(isPrime(i)){
                System.err.print(i+" ");
            }
        }
    }
}
