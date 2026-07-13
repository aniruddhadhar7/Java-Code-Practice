import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>b){
            System.err.println(a+" is largest");
        }
        else{
            System.out.println(b+" is largest");
        }
        sc.close();
    }
}
