import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> ar2 = new ArrayList<Integer>();
		
		
		ar2.add(7);
		ar2.add(4);
		ar2.add(6);
		ar2.add(2);
		ar2.add(9);
		ar2.add(3);
		System.out.println(ar2);
		ar2.add(5);
		System.out.println(ar2);
		ar2.add(2,8);
		System.out.println(ar2);
		ar2.remove(0);
		System.out.println(ar2);
		ar2.add(0,7);
		System.out.println(ar2);
		System.out.println(ar2.contains(1));
		System.out.println(ar2.isEmpty());
		//System.out.println("Reading Elements Using forloop");
	//	for(int i=0; i<ar2.size();i++){
		//	System.out.println(ar2.get(i));
		
	//	}
		
		//System.out.println("Reading Elements Using Iterator:");
		//Iterator it = ar2. iterator();
		//while(it.hasNext()) {
			//System.out.println(it.next());
		//}
		
		Collections.sort(ar2);
		System.out.println(ar2);
		
		Collections.sort(ar2,Collections.reverseOrder());
		System.out.println(ar2);
		Collections.shuffle(ar2);
		System.out.println(ar2);
		
	}
	
	
	
	

}
