/*
 * Question: Write a Java program to move all non-zero elements to the beginning while maintaining relative order.
 */
public class MoveZeroesToFront {

	public static void main (String[] args) 
	{
		// your code goes here
    int arr[]={1,2,3,0,3,0,0,4,0};
    int n=arr.length;
    int j=0;
    for(int i=0;i<n;i++){
        if(arr[i]!=0){
            arr[j]=arr[i];
            j++;
        }
    }
    for(int i=j;i<n;i++){
        arr[i]=0;
    }
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    }
	}
}

