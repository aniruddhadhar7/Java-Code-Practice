/*
 * Question: Write a Java program to print all Leaders in an array (an element is a Leader if it is greater than all elements to its right).
 */
import java.util.*;
import java.lang.*;
import java.io.*;

class LeadersInArray
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int arr[]={16,17,4,3,5,2};
		
		int maxright=arr[arr.length-1];
		
		ArrayList<Integer> leader=new ArrayList<>();
		leader.add(maxright);
		
		for(int i=arr.length-2;i>=0;i--){
		    if(arr[i]>maxright){
		        leader.add(arr[i]);
		        maxright=arr[i];
		    }
		}
		for(int i=leader.size()-1;i>=0;i--){
		    System.out.print(leader.get(i)+" ");
		}

	}
}
