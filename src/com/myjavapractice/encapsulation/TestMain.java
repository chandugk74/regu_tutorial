package com.myjavapractice.encapsulation;

public class TestMain {

	public static void main(String args[]) {
		Student stu = new Student(0, null);
		stu.setRollno(1);
		stu.setName("chandru");
		stu.setAddress("Bangalore");
		
		System.out.println(stu.getAddress());
		System.out.println(stu.getRollno());
		
		
		Student stu1 = new Student(0, null);

		stu1.setRollno(2);
		stu1.setName("Punith");
		
		System.out.println(stu1.getName());
		System.out.println(stu1.getRollno());
		
	}
}
