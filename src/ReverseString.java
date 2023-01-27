
public class ReverseString {

	public static void main(String[] args) {
		String str = "nalina";
		String rev=" ";
		
		/*int len= str.length();//len=6
		
		for(int i=len-1;i>=0;i--) {
			
			rev=rev+ str.charAt(i);
			
		}*/
		
	char a[]= str.toCharArray();
	int len=a.length;
	for(int i=len-1;i>=0;i--){
		
		rev=rev+a[i];
		
	}
System.out.println("Reversed String:" +rev);
	}

}
