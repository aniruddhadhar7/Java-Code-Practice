import java.util.Scanner;

public class duck {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String num=sc.next();
        boolean isduck=false;

        for(int i=1;i<num.length();i++){
            if(num.charAt(i)=='0'){
                isduck=true;
                break;
            }
        }
        if (isduck) {
            System.err.println("Duck Number");
        }
        else{
            System.err.println("Not Duck");
        }
    }
}
