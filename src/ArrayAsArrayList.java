import java.util.ArrayList;
import java.util.Arrays;

public class ArrayAsArrayList {
	
	public static void main(String[] args) {
		String arr[] = {"Dog","Cat","Elephant","Goat"};
//		for(String Value:arr) {
//			
//			System.out.println(Value);
//		}
	ArrayList al = new ArrayList(Arrays.asList(arr));
	
	System.out.println(al);
	}
	
	

}
