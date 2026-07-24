/*
 * Question: Write a Java program to sort the first half of an array in ascending order and the second half in descending order.
 */
class AscendingDescendingSort{
    public static boolean isSorted(int arr[],int n){
        boolean as;
        if(arr[0]<arr[1]){
            as=true;
        }else{
            as=false;
        }
        if(as==true){
        for(int i=0;i<n-1;i++)
                if(arr[i] > arr[i + 1]){
                return false;
            }
        }
        else{
            for(int i=0;i<n-1;i++)
                if(arr[i] < arr[i + 1]){
                return false;
            }
        }  
        return true;
    }
	public static void main (String[] args)
	{
		// your code goes here
		int arr[]={6,4,8,2,1};
		int n=arr.length;
		if(isSorted(arr,n)){
		    System.out.println("Array is Sorted");
		}
		else{
		    System.out.println("Array is not sorted");
		}
		

	}
}
