package Java8programmes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MultiplyNum {

	public static void main(String[] args) {

	List<Integer> myList= Arrays.asList(1,2,3,4,5,6,7);
	
	System.out.println(myList.stream().map(i->i*3).collect(Collectors.toList()));
	
	}

}
