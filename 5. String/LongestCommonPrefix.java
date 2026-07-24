/*
 * Question: Write a Java program to find the longest common prefix string amongst an array of strings.
 */
import java.util.*;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String words[] = { "flower", "flow", "flight" };
        if (words.length == 0) {
            System.out.println("");
            return;
        }
        String prefix = words[0];
        for (int i = 1; i < words.length; i++) {
            int len = Math.min(prefix.length(), words[i].length());
            int j;
            for (j = 0; j < len; j++) {
                if (prefix.charAt(j) != words[i].charAt(j)) {
                    break;
                }
            }
            prefix = prefix.substring(0, j);
            if (prefix.isEmpty()) {
                break;
            }
        }
        System.out.println("Longest Common Prefix: " + prefix);
    }
}
