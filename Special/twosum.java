
import java.util.*;
public class twosum {

	public static void main (String[] args) 
	{
		// your code goes here
		int arr[]={2,7,11,15};
	    int target=26;
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<arr.length;i++){
		    int needed = target - arr[i];
		    if(map.containsKey(needed)){
		        System.out.print(map.get(needed)+" "+i);
		        break;
		       
		    }
		    else{
		        map.put(arr[i],i);
		    }
		}

	}
}

