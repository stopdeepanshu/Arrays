


public class removeDuplicateWords {
	public static void main(String[] args) {
		String str = "java is easy and java is powerful";
		String[] arr = str.split(" ");
		String res="";
		
		for(String word:arr)
		{
			if(!res.contains(word+" "))
			{
				res=res+word+" ";
			}
		}
		System.out.println(res);
	}	
}
