import java.util.Scanner;

public class Harshad {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int sum=0;
        while(temp!=0){
            int rem=temp%10;
            sum=sum+rem;
            temp/=10;
        }
        if(n%sum==0){
            System.err.println("Harshad Number");
        }
        else{
            System.err.println("Not Harshad");
        }
    }
}
