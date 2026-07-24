/*
 * Question: Write a Java program to count the total number of vowels and consonants in a string.
 */
public class CountVowelsAndConsonants {
    public static void main(String[] args) {
        String s="Aniruddha @123";
        char c[]=s.toCharArray();
        int vowel=0;
        int consonant=0;
        
        for(int i=0;i<c.length;i++){
            if((c[i]>='A' && c[i]<='Z')||(c[i]>='a' && c[i]<='z')){
            if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u'||c[i]=='A'||c[i]=='E'||c[i]=='I'||c[i]=='O'||c[i]=='U'){
                vowel++;
            }
            else{
                consonant++;
            }
        }
    }
        System.err.println(vowel);
        System.err.println(consonant);
    }
}
