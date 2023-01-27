import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		
		
		ArrayList ar = new ArrayList();
		
		ar.add("X");
		ar.add("B");
		ar.add("Y");
		ar.add("C");
		ar.add("Z");
		ar.add("A");
  System.out.println(ar);
   Collections.sort(ar);
   System.out.println("Elements in the ArrayList afeter sorting:"+ar);
   Collections.sort(ar,Collections.reverseOrder());
   System.out.println(ar);
   System.out.println("Reading elements using forloop");
   
   for(int i=0; i<ar.size();i++) {
	   
	   System.out.println(ar.get(i));
	   
	   
	   
   }
	for(Object e:ar){
	
	System.out.println(e);
}
Iterator it = ar.iterator();
while(it.hasNext()) {
	System.out.println(it.next());
	 	
	
}	
}
}
