/*
 * Question: Write a Java program to check whether a given character is an alphabet letter (A-Z or a-z) or not.
 */
import java.util.Scanner;

public class CheckAlphabet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if((ch>='A' && ch<='Z')||(ch>='a' && ch>='z')){
            System.out.println("Character");
        }else{
             System.out.println(" Not Character");
        }
        sc.close();
    }
}
