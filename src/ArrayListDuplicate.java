import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDuplicate {
   public static void main(String[] args) {
	   
	   
	   ArrayList ar4 = new ArrayList();
	    
	   ar4.add(10);
	   ar4.add(20);
	   ar4.add(30);
	   ar4.add(40);
	   ar4.add(50);
	   ar4.add(60);
	   
	  System.out.println(ar4);
	    ArrayList ar4_Dup = new ArrayList();
	    ar4_Dup.addAll(ar4);
	    System.out.println(ar4_Dup);
	    ar4_Dup.removeAll(ar4);
	    System.out.println(ar4_Dup);
	    Collections.sort(ar4,Collections.reverseOrder());
	    System.out.println(ar4);
	    
	    
	    
	    
	   
	   
	   
	   
	     
   }
}
