import java.util.*;
public class intersectionarray {
	public static void main (String[] args)
	{
		// your code goes here
		int arr1[] = {1,2,3,4,5};
        int arr2[] = {3,4,5,6,7};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr1.length;i++){
            map.put(arr1[i],i);
        }
        boolean found=false;
        for(int i=0;i<arr2.length;i++){
            if(map.containsKey(arr2[i])){
                found=true;
                System.out.print(arr2[i]+" ");
            }
        }
        if(!found){
            System.out.print("No Common Element");
        }
        
	}
}


