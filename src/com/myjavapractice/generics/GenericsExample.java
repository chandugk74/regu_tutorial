package com.myjavapractice.generics;

public class GenericsExample<T> {
	public T t;

	public void set(T t) {

		this.t = t;
	}

	public T get() {
		return t;
	}

}
