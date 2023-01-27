package com.myjavapractice.array;

public class ChildEx extends Parent {
	void view(){
		System.out.println("this is a child class method");
		}
		public static void main(String args[]){
		Parent ob = new Parent();
//		ob.view();
		Parent ob1 = new ChildEx();
		ob1.view();
}
}