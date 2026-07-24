/*
 * Question: Write a Java program to find the majority element in an array using Boyer-Moore Voting Algorithm.
 */
import java.util.*;
import java.lang.*;
import java.io.*;
public class MajorityElementMooreVoting {

	public static void main (String[] args)
	{
		// your code goes here
		 int arr[]={2, 2, 1, 1, 1, 2, 2};
		 int candidate=0;
		 int count=0;
		 for(int i: arr){
		     if(count==0){
		         candidate=i;
		         count=1;
		     }
		     else if(i==candidate){
		         count++;
		     }
		     else{
		         count--;
		     }
		 }
		 System.out.println(candidate);

	}
}


