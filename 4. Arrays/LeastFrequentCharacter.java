/*
 * Question: Write a Java program to find the character with the minimum frequency in a string.
 */
class LeastFrequentCharacter{
    public static void main(String[] args) {
        String s="aabbccc";
        char arr[]=s.toCharArray();
        int n=arr.length;
        int min=Integer.MAX_VALUE;
        char minChar = ' ';
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }  
            }if(count<min){
                min=count;
                minChar=arr[i];
            }

        }
        System.err.println();
        System.err.println(minChar);
    }
}