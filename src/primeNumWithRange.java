


public class primeNumWithRange {
	public static void main(String[] args) {
		for (int no = 100; no <= 200; no++) {

			boolean flag = true;
			for (int i = 2; i < no; i++) {
				if (no % i == 0) {
					flag = false;
					break;
				}

			}
			if (flag) {
				System.out.println(no);
			}

		}
	}
}
