/*
 * Question: Write a Java program to check whether a given number is a prime number or not.
 */
public class PrimeNumberCheck {
    public static boolean isPrime(int n){
        boolean isPrime=true;
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
		int n=5;
		if(isPrime(n))
		    System.out.println(n+" is prime");
        else{
            System.out.println(n+" is not prime");
        }
	}
}

