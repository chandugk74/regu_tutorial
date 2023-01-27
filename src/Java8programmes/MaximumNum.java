package Java8programmes;

import java.util.Comparator;
import java.util.stream.Stream;

public class MaximumNum {

	public static void main(String[] args) {

		Integer max= Stream.of(65,99,767,54,43,67,34).max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("The Maximum number is: " + max);
	}

}
