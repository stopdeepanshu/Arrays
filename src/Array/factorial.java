package Array;

public class factorial {
	public static void main(String[] args) {
		int n=9;
		int mul=1;
		for (int i = n; i >=1; i--) {
			mul=mul*i;
		}
		System.out.println(mul);
	}
}
