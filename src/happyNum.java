


public class happyNum {
	public static void main(String[] args) {

		int num = 13;
		int no = num;
		while (no > 9) {
			no = numsum(no);
		}
		if (no == 1 && no == 7) {
			System.out.println("happyyyyyyyyyyyyyyyyyyyyyyy");
		} else {
			System.out.println("saaaaaaaaaddddddddddddddddd");
		}
	}

	static int numsum(int no) {
		int sum=0;
		while(no!=0) {
			int rem=no%10;
			sum=sum+rem*rem;
			
		}
		return 0;
	}
}
