package Array;


public class StringContainsAllCharacters {
	public static void main(String[] args) {
		String[] s1 = { "abc", "ab" };

		String big = s1[0];// abc
		String small = s1[1];// ab

		boolean flag = true;

		for (int i = 0; i < small.length(); i++) {
			char ch = small.charAt(i);// a
			for (int j = 0; j < big.length(); j++) {
				if (ch != big.charAt(j)) {
					flag = false;
					break;
				}
			}
		}
		System.err.println(flag ? "true" : "false");
	}
}
