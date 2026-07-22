public class stockbuyandsell {

	public static void main (String[] args)
	{
		// your code goes here
		int arr[]={7,1,5,3,6,4};
		int n=arr.length;
		int minprice=arr[0];
		int maxprofit=0;
		for(int i=1;i<n;i++){
		    if(arr[i]<minprice){
		        minprice=arr[i];
		    }
		    else{
		        int profit=arr[i]-minprice;
		        if(profit>maxprofit){
		            maxprofit=profit;
		        }
		    }
		}
		System.out.println(maxprofit);

	}
}


