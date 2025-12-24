package Array;

public class LinearSearch {
	public static void main(String[] args) {
		int no=15;
		int[] arr= {9,21,13,64,15,96,87,15,8,9};
		for(int i=0;i<arr.length;i++) {
			if(no==arr[i]) {
				System.out.println(no+" is at "+ i+"th position.");
			}
		}
	}
}
