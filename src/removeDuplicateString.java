


import java.util.Arrays;

public class removeDuplicateString {
	public static void main(String[] args) {
		String str = "deepanshu";
		char ch[]=str.toCharArray();
		System.out.println(Arrays.toString(ch));
		String res="";
		
		for(char l:ch) {
			if(!res.contains(""+l)) {
				res=res+l;
			}
		}
		System.out.println(res);
	}
}
