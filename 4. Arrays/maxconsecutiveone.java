import java.util.*;
import java.lang.*;
import java.io.*;
public class maxconsecutiveone {



	public static void main (String[] args)
	{
		// your code goes here
        int arr[]={1,1,0,1,1,1,0,1,1,1,1,1,1,0};
        int n=arr.length;
        int count=0;
        int max=0;
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                count++;
                if(count>max){
                    max=count;
                }
            }
            else{
                count=0;
            }
        }
        System.out.println(max);
	}
}

