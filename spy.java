import java.util.Scanner;

 class spy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int mul=1;
        int num=n;
        while(num!=0){
            int rem=num%10;
            sum+=rem;
            mul*=rem;
            num/=10;
        }
        if(sum==mul){
            System.err.println("Spy Number");
        }
        else{
            System.err.println("Not Spy");
        }
}
}
