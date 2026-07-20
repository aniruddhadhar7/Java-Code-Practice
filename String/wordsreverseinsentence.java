public class wordsreverseinsentence {

    public static void main(String[] args) {

        // Reverse each word of a string

        String a = "I love India";

        // 1. Take the string.
        // 2. Convert it to a String array.
        // 3. Traverse each word.
        // 4. Convert each word to a character array.
        // 5. Reverse the character array using two pointers.
        // 6. Print the reversed word.

        String word[] = a.split(" ");

        for (int i = 0; i < word.length; i++) {

            char arr[] = word[i].toCharArray();

            int beg = 0;
            int end = arr.length - 1;

            while (beg < end) {

                char temp = arr[beg];
                arr[beg] = arr[end];
                arr[end] = temp;

                beg++;
                end--;
            }

            for (char aa : arr) {
                System.out.print(aa);
            }

            System.out.print(" ");
        }
    }
}

