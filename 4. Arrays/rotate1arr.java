public class rotate1arr 
{
    public static void rotatearr(int []arr,int n){
        int temp=arr[0];
        for(int i=0;i<n-1;i++){
            arr[i]=arr[i+1];
        }
        arr[n-1]=temp;
        for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
        }
    }
        
	public static void main (String[] args)
	{
		// your code goes here
		int arr[]={1,2,3,4,5};
		int n=arr.length;
		rotatearr(arr,n);

	}
}
