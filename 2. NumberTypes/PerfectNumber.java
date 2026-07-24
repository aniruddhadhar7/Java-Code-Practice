/*
 * Question: Write a Java program to check whether a given number is a Perfect number (equal to the sum of its proper positive divisors).
 */
import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int sum=0;
       for(int i=1;i<n;i++){
        if(n%i==0){
            sum=sum+i;
        }
       }
       if(sum==temp){
        System.out.println("Perfect");
       }
       else{
        System.out.println(" Not Perfect");
       }
       sc.close();
    }
}
