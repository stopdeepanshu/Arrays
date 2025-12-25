



public class armstrong {
	public static void main(String[] args) {
		int num=153;
		int no=num;//count the digit
		int n=num;
		int count=0;
		int sum=0;
		
		while(no!=0) {
			no=no/10;
			count++;
		}
		
		while(n!=0) {
			int rem=n%10;
			sum=sum+(int)Math.pow(rem, count);
			n=n/10;
		}
		System.out.println(sum==num?"Arms are strong":"Arms are not strong!");
	}
}
