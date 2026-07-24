/*
 * Question: Write a Java program to check whether two strings are anagrams of each other.
 */
public class AnagramCheck {
   
	public static void main (String[] args) 
	{
        /*
        1. taking two string checking for same length
        2. converting them into char array
        3. taking a frequency array with 26 int size
        4. rotate a loop and fill the freq array using char 1 
        5. rotate the loop and empty the freq array using char 2
        6. rotate freq array where n=26 if freq array[i]!=0 then not anagram  
        */
       
		String s1="listen";
		String s2="silent";
		if (s1.length() != s2.length()){
		    System.out.println("Not anagram");
		    return;
		}
		int freq[]=new int[26];
	    char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
		for(int i=0;i<arr1.length;i++){
		    freq[arr1[i]-'a']++;
		}
		for(int i=0;i<arr1.length;i++){
		    freq[arr2[i]-'a']--;
		}
		for (int i = 0; i < 26; i++) {
    if (freq[i] != 0) {
        System.out.println("Not Anagram");
        return;
        }
    }
    System.out.println("Anagram");
		

	}
}

