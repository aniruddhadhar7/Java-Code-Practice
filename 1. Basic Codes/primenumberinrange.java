public class primenumberinrange {
    public static boolean isPrime(int n){
        if(n==0 || n==1){
            return false;
        }
        int i=0;
        for(i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
	public static void main (String[] args) 
	{
		// your code goes here
		int l=1,u=100;
        int count=0;
        for(int i=l;i<=u;i++){
            if(isPrime(i)){
                System.err.print(i+" ");
                count++;
            }
        }
        System.err.println();
        System.err.println(count);
	}
}

