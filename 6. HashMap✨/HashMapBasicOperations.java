/*
 * Question: Write a Java program to demonstrate basic HashMap operations (insertion, key checking, value retrieval, iteration).
 */
import java.util.*;
public class HashMapBasicOperations {

	public static void main (String[] args)
	{
		//Hashmap creation
        HashMap<Integer,Integer> map=new HashMap<>();

        //Data Insertion
        map.put(10,0);
        map.put(20,1);
        map.put(30,2);

        //Hashmap printing
        System.out.println(map);

        System.err.println(map.get(10));

        //checking for element
       if(map.containsKey(20)){
           System.out.println("20 is found");
           System.out.println("Index of 20 is "+map.get(20));//index finding
       }
	}
}
