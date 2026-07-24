/*
 * Question: Write a Java program to find the contiguous subarray with the largest sum (Kadane's algorithm).
 */
class MaximumSubarraySum{
    public static void maxsum(int arr[],int n){
        
    int max=Integer.MIN_VALUE;
        for(int i=0;i<n-1;i++){
        for(int j=i+1;j<n;j++){
            if(arr[j]-arr[i]>max){
                max=arr[j]-arr[i];
            }
        }
        }
        System.out.println(max);
    }
	public static void main (String[] args)
	{
		// your code goes here
		int arr[]={2, 3, 10, 6, 4, 8, 1};
		int n=arr.length;
		maxsum(arr,n);
	

	}
}
