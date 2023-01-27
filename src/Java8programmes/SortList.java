package Java8programmes;

import java.util.Arrays;
import java.util.List;

public class SortList {

	public static void main(String[] args) {

		List<Integer> sortList= Arrays.asList(8,4,3,5,6,7,8,9,2);
		
		sortList.stream().sorted().forEach(System.out::println);
		
		
	}

}
