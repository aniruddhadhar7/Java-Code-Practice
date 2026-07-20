public class stringpalindrome {
    public static void main(String[] args) {
        String s = "abba";
        char c[] = s.toCharArray();
        int beg = 0;
        int end = c.length - 1;
    
        while (beg < end) {
            if (c[beg] != c[end]) {
                System.err.println("String is not palindrome");
                return;
            }
                beg++;
                end--;
            }
            System.err.println("String is palindrome");
        }
        
    }

