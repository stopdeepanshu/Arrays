package Array;


public class StringPallindrome {
	public static void main(String[] args) {
		String str="MadaM";
		String copy=str;
		String rev="";
		
		for (int i = str.length()-1; i>=0; i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println(copy.equals(rev)?"Pallindrome":"Non Pallindrome");
	}
}
