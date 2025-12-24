package Array;

import java.util.Iterator;

public class primeNumber {
	public static void main(String[] args) {
		int num=19;
		boolean flag=true;
		for (int i = 2; i < num; i++) {
			if(num%i==0) {
				flag=false;
				break;
			}
		}
		if(flag==true) {
			System.out.println("It is a prime num");
		}
		else {
			System.out.println("It is not a prime num");
		}
		
		
	}
}
