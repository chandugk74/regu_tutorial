import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

//Java 8 program to find the Minimum number of a Stream?
public class MinimumNum {

	public static void main(String[] args) {
	//	Integer min= Stream.of(8,99,67,5,65,34,23).min(Comparator.comparing(Integer::valueOf)).get();
	//	Integer min= Stream.of(4,9,6,8,3,5).min(Comparator.comparing(Integer::valueOf)).get();
		
		Integer min= Stream.of(98,76,56,43,67,999,34,24).min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("The Minimum number is: " + min);
		
	}

}
