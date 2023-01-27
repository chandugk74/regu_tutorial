
public class Practice {
	
	
	public static void main(String[] args) {
		
		
		int num[]= {10,20,85,60,98,50,40};
		int n= num.length;
		
		int highest =Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;
			
		for(int i=0;i<n;i++) {
			if(num[i]>highest) {
					
				secondHighest=highest;
					
					highest = num[i];
				}
				
				if(num[i] < highest && num[i] > secondHighest) {
					 secondHighest = num[i];
					 
				}
	}
	System.out.println("Practice" + secondHighest);
	
	}

}

