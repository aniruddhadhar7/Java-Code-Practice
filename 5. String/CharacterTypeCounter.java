/*
 * Question: Write a Java program to count uppercase letters, lowercase letters, digits, and special characters in a string.
 */
public class CharacterTypeCounter {
    public static void main(String[] args) {

        String s = "Aniruddha @123";
        char c[] = s.toCharArray();

        int uc = 0;
        int lc = 0;
        int number = 0;
        int special = 0;

        for (int i = 0; i < c.length; i++) {

            if (c[i] >= 'A' && c[i] <= 'Z') {
                uc++;
            }
            else if (c[i] >= 'a' && c[i] <= 'z') {
                lc++;
            }
            else if (c[i] >= '0' && c[i] <= '9') {
                number++;
            }
            else {
                special++;
            }
        }

        System.out.println("Uppercase = " + uc);
        System.out.println("Lowercase = " + lc);
        System.out.println("Digits = " + number);
        System.out.println("Special = " + special);
    }
}