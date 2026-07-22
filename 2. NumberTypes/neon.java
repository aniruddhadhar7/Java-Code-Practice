import java.util.Scanner;

public class neon {
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
