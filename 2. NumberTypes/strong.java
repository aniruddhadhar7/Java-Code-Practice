import java.util.*;
public class strong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int temp=n;
        int rem,sum=0;
        while(temp!=0){
            rem=temp%10;
            int fact=1;
            for(int i=1;i<=rem;i++){
                fact*=i;
            }
            sum+=fact;
            temp/=10;
        }
        if(sum==n){
            System.out.println("Strong");
        }
        else{
            System.out.println(" Not Strong");
        }
        sc.close();
    }
}
