public class evenodd {
    public static void countevenodd(int arr[],int n){
        int even=0,odd=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("even: "+even+"\nodd:  "+odd);
    }
        
	public static void main (String[] args)
	{
		// your code goes here
		int arr[]={0,4,8,2,1};
		int n=arr.length;
		countevenodd(arr,n);
		

	}
}

