import java.util.Scanner;

public class powerloop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=sc.nextInt();
        int m=1;
        for(int i=1;i<=p;i++){
            m=m*n;
        }
        System.err.println(m);
    }
}
