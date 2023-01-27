
public class Test12 {

	public static void main(String[] args) {

		int[] a = { 1, 9, 10, 12 };
		int[] b = { 2, 14, 19 };

		int[] c = new int[a.length + b.length];

		int count = 0;

		for (int i = 0; i < a.length; i++) {

			c[i] = a[i];
			count++;

		}
		
		for(int j=0; j<b.length;j++) {
			
			c[count++]= b[j];
			
		}
		for(int i=0; i<c.length;i++) {
			
			System.out.println(c[i]+ " ");
		}

	}
}
