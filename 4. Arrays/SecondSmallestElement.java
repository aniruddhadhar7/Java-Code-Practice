/*
 * Question: Write a Java program to find the second smallest element in an array.
 */
class SecondSmallestElement{
    public static void secsmall(int arr[],int n){
        
        int small=Integer.MAX_VALUE;
        int ssmall=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<small){
                ssmall=small;
                small=arr[i];
            }
            else if(arr[i]<ssmall && arr[i]!=small){
                ssmall=arr[i];
            }
        }
        System.out.println(ssmall);
    }
	public static void main (String[] args) 
	{
		// your code goes here
		int arr[]={1,2,3,43,6,7,8,9};
		int n=arr.length;
		secsmall(arr,n);

	}
}

