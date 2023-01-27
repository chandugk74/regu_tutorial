import java.util.Arrays;

//Write a program to convert element like this in an array Input [1,1,1,0,1] output [0,0,0,1,0]
public class JavaExample {
	
	public static void main(String[] args) {
		
	int[] A= {1,1,1,0,1};
	
	int sum=0;
	
	for(int i=0;i<A.length; i++) {
		
		sum= sum+A[i];
	}		
		
				
		
	Arrays.fill(A, A.length-sum,A.length,1);
	
	Arrays.fill(A,0,A.length-sum, 0);
	
	System.out.println(Arrays.toString(A));
		
		
	}
	
		
		
	}
	


