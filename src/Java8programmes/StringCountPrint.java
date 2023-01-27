
//Java 8 program to Print Strings whose length is greater than 3 in List.
package Java8programmes;

import java.util.Arrays;
import java.util.List;

public class StringCountPrint {

	public static void main(String[] args) {
		List<String> stringPrint= Arrays.asList("Hello","Interview","Questions","Answers","Ram","for");
		
		stringPrint.stream().filter(str->str.length()>3).forEach(System.out::println);
		

	}

}
