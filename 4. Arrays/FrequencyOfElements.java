/*
 * Question: Write a Java program to count the frequency of each element in an array.
 */
public class FrequencyOfElements {
   
    public static void count(int arr[],int n,int e){
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==e){
                count++;
            }
        }
        System.out.println(count);
    }
	public static void main (String[] args) 
	{
		// your code goes here
		int arr[]={1,2,3,3,4,4,5,5,5,6,6,};
		int n=arr.length;
		count(arr,n,5);

	}
}
