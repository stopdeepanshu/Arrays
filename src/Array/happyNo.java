package Array;

public class happyNo {
	public static void main(String[] args) {
		int num=19;
		int no=num;
		
		while (no>9){
			no=numsum(no);
		}
		
		if(no==1 || no==7) {
			System.out.println("Number is a happy number");
		}else {
			System.out.println("Number is unhappy number.");
		}
	}

	public static int numsum(int no) {
		int sum=0;
		int n=no;
		while(n!=0) {
			int rem=n%10;
			sum=sum+(int)Math.pow(rem, 2);
			n=n/10;
		}
		return sum;
	}
}
