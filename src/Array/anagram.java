package Array;


import java.util.Arrays;

public class anagram {
	public static void main(String[] args) {
		String str1 = "listen";
		String str2 = "silent";

		if (str1.length()!=str2.length()) {
			System.out.println("Strings are not Anagrams.");
			return;
		} else {
			char arr1[] = str1.toCharArray();
			char arr2[] = str2.toCharArray();

			System.out.println(Arrays.toString(arr1));
			System.out.println(Arrays.toString(arr2));
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			
			if(arr1==arr2) {
				System.out.println("Strings are anagram.");
			}
			else {
				System.out.println("Strings are anagram.");
			}
			
			
		}

	}
}
