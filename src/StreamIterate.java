//Java 8 program to iterate a Stream using the forEach method?
import java.util.Arrays;
import java.util.List;
public class StreamIterate {

	public static void main(String[] args) {

	List<String> str= Arrays.asList("Hello","Interview","Questions","Answers");	
	
	str.stream().forEach(System.out::println);
		
		
	}

}
