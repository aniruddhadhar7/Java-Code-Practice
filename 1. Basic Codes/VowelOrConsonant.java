/*
 * Question: Write a Java program to check whether an input character is a vowel, consonant, or not an alphabet letter.
 */
import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                System.out.println("VOWEL");
            } else {
                System.out.println("CONSONANT");
            }
        }
        else{
            System.err.println("Not char");
        }
        sc.close();
    }
}
