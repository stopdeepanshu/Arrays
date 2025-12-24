package String;

public class subSequences {
	public static void main(String[] args) {
		String s1 = "pqr";
		String s2 = "dpwquri";

		int i = 0;
		int j = 0;

		while (i < s1.length() && j < s2.length()) {
			if (s1.charAt(i) == s2.charAt(j)) {
				i++;
				j++;	
			}
			else {
				j++;
			}
		}
		System.out.println(i==s1.length()?"True":"False");
	}
}
