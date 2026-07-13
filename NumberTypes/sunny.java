import java.util.Scanner;

public class sunny {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int next=n+1;
        int root=(int)Math.sqrt(next);
        if(root*root==next){
            System.err.println("Sunny");

        }
        else{
            System.err.println("Not Sunny");
        }
}
}
