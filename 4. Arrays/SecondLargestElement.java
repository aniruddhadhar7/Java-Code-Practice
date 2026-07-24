/*
 * Question: Write a Java program to find the second largest element in an array.
 */
import java.util.*;

public class SecondLargestElement {

    public static void SLargest(int []arr,int n){
        int max=arr[0];
        int smax=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>max){
                 smax=max;
                 max=arr[i];
            }
            if(arr[i]>smax && arr[i]!=max){
                smax=arr[i];
            }
        }
        System.out.println("SMax is:"+smax);
    }
	public static void main (String[] args)
	{
		// your code goes here
		int arr[]={5,6,7,8,0};
		int n=arr.length;
		SLargest(arr,n);

	}
}
