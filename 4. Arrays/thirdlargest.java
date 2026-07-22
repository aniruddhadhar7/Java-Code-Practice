public class thirdlargest {
    public static int thirdLargest(int arr[], int n) {

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {

            if (arr[i] > largest) {
                thirdLargest = secondLargest;
                secondLargest = largest;
                largest = arr[i];
            }
            else if (arr[i] > secondLargest && arr[i] != largest) {
                thirdLargest = secondLargest;
                secondLargest = arr[i];
            }
            else if (arr[i] > thirdLargest &&
                     arr[i] != largest &&
                     arr[i] != secondLargest) {
                thirdLargest = arr[i];
            }
        }

        return thirdLargest;
    }

    public static void main(String[] args) {

        int arr[] = {4, 6, 7, 2, 9};
        int n = arr.length;

        System.out.println("Third Largest: " + thirdLargest(arr, n));
    }
}

