import java.util.HashMap;
import java.util.Map;

public class ABC {

	public static void main(String[] args) {
		
		
	Map<Integer,String> map =  new HashMap<>();
	map.put(1, "Kavya");
	map.put(2, "Sowmya");
	map.put(3, "Anju");
	map.put(4, "Kumar");
	
	for(Integer key : map.keySet()) {
		System.out.println(key);
	}
	
	
		

	}

}
