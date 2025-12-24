package Array;


import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = { 44, 33, 11, 22, 45, 63, 36, 67 };
		int search = 63;

		Arrays.sort(arr);
		int ans = check(arr, search);
//		if(ans==-1)System.out.println(search+" is not present is array.");
//		else System.out.println(search+" is found at "+ans);

		System.out.println(ans==-1?"we didnt found any index ":"we found at index "+ans);
	}

	private static int check(int[] arr, int search) {
		int low = 0;
		int high = arr.length;
		

		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == search) {
				return mid;
			} else if (arr[mid] < search) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;

	}

}
