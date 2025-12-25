


public class firstLastEight {
	public static void main(String[] args) {
		int[] arr = { 2, 8, 7, 5, 3, 8, 2, 1, 7, 8, 9, 8, 5 };
		int first=0;
		int last=0;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==8 && first==0) {
				first=i;
			}
			else if(arr[i]==8 && first!=8) {
				last=i;
			}
		}
		
		System.out.println(first);
		System.out.println(last);
		
	}
}
