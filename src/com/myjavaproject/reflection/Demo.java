package com.myjavaproject.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Demo {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Test obj = new Test();
		Class cls = obj.getClass();
		System.out.println(cls.getName());
		Constructor constructor = cls.getConstructor();
		System.out.println(constructor.getName());
		
		System.out.println(" ");
		Method[] methods = cls.getMethods();
		
		Constructor c = Demo1.class.getDeclaredConstructor();
        c.setAccessible(true);
        Demo1 demo = (Demo1) c.newInstance();
        
        System.out.println(cls.getName());
//        System.out.println(Demo1.getName());


	}

}
