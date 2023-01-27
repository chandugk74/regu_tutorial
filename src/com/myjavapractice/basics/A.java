package com.myjavapractice.basics;
@FunctionalInterface
interface Square{
	int Calculate(int x);
	
}
public class A {

	public static void main(String[] args) {
		
		
	int a = 5;
	//Square s = (int x)->x*x;
	Square s = new Square(){
		public int Calculate(int x) {
			return x*x;
		}
	};
	
	int ans = s.Calculate(a);
	System.out.println(ans);
		
	} 


}