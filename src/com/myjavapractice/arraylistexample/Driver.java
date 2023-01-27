package com.myjavapractice.arraylistexample;


import java.util.ArrayList;
import java.util.List;

public class Driver {

	public static void main(String args[]) {
		CreateList createList=new CreateList();
		List<String> list = createList.getList("a", "b", "c", "d");
		List<String> list1 = createList.getList("a1", "b2", "c3", "d4");

//		ForEachExample eachExample = new ForEachExample();
//		eachExample.print(list);
//		eachExample.print(list1);

//		ForExamplr examplr= new ForExamplr();
//		examplr.print(list);
//		examplr.print(list1);
		
//		WhileLoopExample whileloopexample= new WhileLoopExample();
//		whileloopexample.print(list);
//		whileloopexample.print(list1);
		
//		IteratorExample iteratorExample = new IteratorExample();
//		iteratorExample.print(list);
//		iteratorExample.print(list1);
		
		ListIteratorExample listIteratorExample= new ListIteratorExample();
		listIteratorExample.print(list);
		listIteratorExample.print(list1);

	}

}
