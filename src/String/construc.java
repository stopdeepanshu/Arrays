package String;

public class construc {
	int id;
	String name;
	
	public  construc(int id){
		this.id=id;
	}
	
	public static void main(String[] args) {
		construc c1=new construc(5);
		System.out.println(c1.id);
		System.out.println(c1.name);
	}
}
