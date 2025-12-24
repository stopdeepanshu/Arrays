package Array;


public class removeDupliString {
	public static void main(String[] args) {
		String str = "java is easy and java is powerfull";
		String[] arr = str.split(" ");
		String res = "";

		for (int i = 0; i <arr.length; i++) {
			String words = arr[i];
			if (!res.contains(words + " ")) {
				res = res + words + " ";
			}
		}
		System.out.println(res);
	}
}