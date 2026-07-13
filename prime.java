import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean isPrime=true;
        if(n<=1){
            System.err.println(isPrime);
        }
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                isPrime=false;
                break;
            }
        }
        if (isPrime) {
            System.err.println("The number is Prime");
        }
        else{
            System.err.println("The number is not Prime");
        }
        sc.close();
    }
}
