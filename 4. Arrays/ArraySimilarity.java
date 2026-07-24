/*
 * Question: Write a Java program to check if two arrays contain the exact same elements in the same order.
 */
class ArraySimilarity{
    public static void simarr(int arr1[],int arr2[]){
        if(arr1.length!=arr2.length){
        System.out.println("Not equal");
        return;
        }
        for(int i=0;i<arr1.length;i++){
                if(arr1[i]!=arr2[i]){
                    System.out.println("Not equal");
                    return;
                }
            }
            System.out.println("equal");
        }
	public static void main (String[] args)
	{
		// your code goes here
		int arr1[]={1,2,4};
		int arr2[]={1,6,4};
		simarr(arr1,arr2);

	}
}
