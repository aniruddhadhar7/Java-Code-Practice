import java.util.Scanner;

class fibonacci{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int f=0,s=1;
        for(int i=1;i<=n;i++){
            System.out.print(f+" ");
            int next=f+s;
            f=s;
            s=next;
        }
    }
}