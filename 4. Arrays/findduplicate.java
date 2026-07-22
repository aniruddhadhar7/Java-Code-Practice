class findduplicate {
      public static void remdup(int arr[],int n){
         
         for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++)
             if(arr[i]==arr[j]){
                 System.err.println(arr[i]);
             
             }
      }
    }
	public static void main (String[] args)
	{
    	int arr[]={1,1,2,2,3,3,4,4,5,5,6,7,8};
    	int n=arr.length;
    	remdup(arr,n);
	}
}

