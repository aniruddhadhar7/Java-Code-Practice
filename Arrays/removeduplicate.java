public class removeduplicate {

      public static void remdup(int arr[],int n){
         int j=0;
         for(int i=1;i<n;i++){
             if(arr[i]!=arr[j]){
                 j++;
                 arr[j]=arr[i];
             }
         }
         for(int i=0;i<=j;i++){
             System.out.print(arr[i]+" ");
         }
         System.out.println();
         System.out.println("No of unique elements:"+(j+1));
      }
	public static void main (String[] args)
	{
    	int arr[]={1,1,2,2,3,3,4,4,5,5,6,7,8};
    	int n=arr.length;
    	remdup(arr,n);
	}
}

