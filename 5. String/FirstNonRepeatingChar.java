/*
 * Question: Write a Java program to find the first non-repeating character in a given string.
 */
public class FirstNonRepeatingChar {

	public static void main (String[] args) 
	{
		// your code goes here
        String s="aaabbbcccdde";
        char arr[]=s.toCharArray();
        int freq[]=new int[26];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]-'a']++;
        }
        
        for(int i=0;i<arr.length;i++){
            if(freq[arr[i]-'a']==1){
                System.out.println(arr[i]);
                return;
            }
	}
	System.out.println("NO single element");
}
}

