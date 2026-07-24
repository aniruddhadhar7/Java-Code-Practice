/*
 * Question: Write a Java program to find the first non-repeating element in an array.
 */
public class FirstNonRepeatingElement {
    
    public static void simarr(int arr[],int n){
        

        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count==1){
                System.out.println(arr[i]);
                break;
            }
        }
    }
	public static void main (String[] args)
	{
		// your code goes here
		int arr[]={1,2,4,2,6};
		int n=arr.length;
		simarr(arr,n);
	

	}

}
