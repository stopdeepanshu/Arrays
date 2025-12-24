package Array;

public class strong {
	public static void main(String[] args) {
		int no = 145;
		int num = no;
		int sum = 0;
		while (no != 0) {
			int rem = no % 10;
			sum = sum + fact(rem);
			no = no / 10;
		}
		System.out.println(sum);
	}

	static int fact(int rem) {
		int mul = 1;

		for (int i = rem; i >= 1; i--) {
			mul = mul * i;
		}
		return mul;
	}
}
