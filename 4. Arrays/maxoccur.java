public class maxoccur{
    public static void maxsum(int arr[],int n){
        
        for(int i=0;i<n;i++){
            int count=0;
        for(int j=0;j<n;j++){
            if(arr[j]==arr[i]){
               count++;
            }
            
            }
            if(count>n/2){
                System.out.println(arr[i]);
                return;
        }
       
        }
          System.out.println("No majority element");
    }
	public static void main (String[] args) 
	{
		// your code goes here
		int arr[] = {1,2,3,4};
		int n=arr.length;
		maxsum(arr,n);

	}
}

