public class reversestring {
    public static void main(String[] args) {
        String s = "Aniruddha";
        char c[] = s.toCharArray();
        char d[]=c[];
        int beg = 0;
        int end = c.length - 1;
        while (beg < end) {
            char temp = c[beg];
            c[beg] = c[end];
            c[end] = temp;
            beg++;
            end--;
        }
        for (char i : c) {
            System.err.print(i);
        }
    }
}
