


public class nthPrimeNumber {
	public static void main(String[] args) {
		int no = 10000;
		int primeCount=0;
		boolean flag=true;
		
		for(int i = 2;i<1000;i++)
		{
			if (no % i == 0) {
				flag = false;
				primeCount++;
			}
		}
		System.out.println(primeCount);
		System.out.println(flag?"prime number":"Not a prime Number");
	}
}
