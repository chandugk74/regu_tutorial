
public class Swapping {

	public static void main(String[] args) {

		int a=4,b=5;
		
		System.out.println("Before swapping values are.."+a+" " +b); 
		/* int t=a;
		 a=b;
		 b=t;*/
		a=a+b;//4+5=9=a
		b=a-b;//9-5=4=b
		a=a-b;//9-4=5=a
		
		
		 System.out.println("After swapping values are.."+a+" " +b);
		 System.out.println(+a);
		 System.out.println(+b);
	}

}