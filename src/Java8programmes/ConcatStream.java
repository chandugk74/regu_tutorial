package Java8programmes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ConcatStream {

	public static void main(String[] args) {

	List<Integer> integerList1= Arrays.asList(2,3,4,5);
	List<Integer> integerList2= Arrays.asList(1,6,7,4,2);
	
	Stream<Integer> concatStream= Stream.concat(integerList1.stream(), integerList2.stream());
	
	concatStream.forEach(System.out::print);
		
		
	}

}
