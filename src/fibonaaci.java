


public class fibonaaci {

	public static void main(String[] args) {
		System.out.print(0 + " " + 1+" ");
		int first = 0;
		int second = 1;
	
		for (int i = 2; i <= 50; i++) {
			int next = first + second;
			System.out.print(next+" ");
			first = second;
			second = next;
		}
	}
}
