


import java.util.HashMap;
import java.util.Map;

public class twoSumnew {
	public static void main(String[] args) {
		int[] arr= {2,4,6,3,5,8};
		int target=10;
		
		Map<Integer, Integer> map=new HashMap<Integer, Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			int required=target-arr[i];
			
			if(map.containsKey(required)) {
				System.out.println(arr[i]+" "+arr[map.get(required)]);
				
			}else {
				map.put(arr[i], i);
			}
		}
		
	}
}
