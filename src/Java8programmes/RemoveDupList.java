package Java8programmes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDupList {

	public static void main(String[] args) {
 List<Integer> removeDuplicate= Arrays.asList(4,5,3,4,5,6,7,8,9);
 removeDuplicate.stream().collect(Collectors.toSet()).forEach(System.out::print);
		
	}

}
