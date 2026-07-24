/*
 * Question: Write a Java program to find the element with maximum frequency in an array using HashMap.
 */
import java.util.HashMap;
import java.util.Map;

public class MostFrequentElementHashMap {
    public static void main(String[] args) {
        int arr[]={2, 2, 1, 1, 1, 2, 2};
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        int maxFreq = 0;
        int answer = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue()>maxFreq){
                maxFreq=entry.getValue();
                answer=entry.getKey();
            }
        }
        System.out.println(answer);
        System.out.println(maxFreq);
    }
}
