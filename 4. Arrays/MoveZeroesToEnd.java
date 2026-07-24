/*
 * Question: Write a Java program to move all zero elements to the end of an array while maintaining relative order of non-zero elements.
 */
public class MoveZeroesToEnd {
    public static void movezero(int []arr,int n){
    int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[j]=arr[i];
                j++;
            }
        }

        while(j<n){
            arr[j]=0;
            j++;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
        
	public static void main (String[] args)
	{
		// your code goes here
		int arr[]={1,0,2,0,3,0};
		int n=arr.length;
		movezero(arr,n);

	}
}

