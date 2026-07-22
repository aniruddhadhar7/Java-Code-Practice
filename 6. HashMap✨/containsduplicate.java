import java.util.*;
import java.lang.*;
import java.io.*;

class containsduplicate
{
	public static void main (String[] args)
	{
		// your code goes here
    int arr[]={1,2,3,3,4,5};
    HashMap<Integer,Integer> map=new HashMap<>();
    boolean found=false;
    for(int i=0;i<arr.length;i++){
        if(map.containsKey(arr[i])){
            found=true;
            break;
        }
        else{
            map.put(arr[i],i);
        }
    }
    if(found){
        System.out.println("true");
    }
    else{
        System.out.println("false");
    }
}
}
