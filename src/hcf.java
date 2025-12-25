


import java.util.Iterator;

public class hcf {
	public static void main(String[] args) {

		int a = 48;
		int b = 18;
		int hcf = 1;

		for (int i = 1; i <= a && i <= b; i++) {
			if (a % i == 0 && b % i == 0) {
				hcf = i;
			}
		}
		System.out.println(6);
	}
}
