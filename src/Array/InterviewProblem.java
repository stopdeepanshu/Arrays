package Array;


import java.util.List;

public class InterviewProblem {
    public static void main(String[] args) {
        String[] arr= {"flow","flower","flight", "flat", "flavour"};

        String prefix=arr[0];
        
        for (int i = 1; i < arr.length; i++) {
        	String currWord=arr[i];
        	
        	int minLeng=Math.min(prefix.length(),currWord.length());
        	int j=0;
        	
        	while(j<minLeng && prefix.charAt(j)==currWord.charAt(j)) {
        		j++;
        	}
        	
        	prefix=prefix.substring(0,j);
			
		}
        System.out.println(prefix);
    }
}
