//Java 8 program to Count Strings whose length is greater than 3 in List?

package Java8programmes;

import java.util.Arrays;
import java.util.List;

public class StringCount {

	public static void main(String[] args) {

	List<String> stringList= Arrays.asList("Hello","Interview","Questions","Answers","Ram","for");
	 long count= stringList.stream().filter(str->str.length()>3).count();
	 System.out.println("String count with greater than 3 digit : " + count);
		
		
	}

}
