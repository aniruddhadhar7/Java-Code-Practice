class firstdupli{
    public static void dupli(int arr[],int n){
        int i=0;
        for(i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);
                    return;
                }
            }
        }
        System.out.println("No duplicates");
      
    }
	public static void main (String[] args)
	{
		// your code goes here
		int arr[]={1,2,3,3,4,4,5,5,5,6,6,};
		int n=arr.length;
		dupli(arr,n);

	}
}