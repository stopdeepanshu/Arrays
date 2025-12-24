package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class findUniqueByStreamAPI {
	public static void main(String[] args) {
			int[] arr= {1, 2, 2, 3, 4, 4, 5};
			
			Arrays.stream(arr).distinct().forEach(System.out::println);
	}
}
