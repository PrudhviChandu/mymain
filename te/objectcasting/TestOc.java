package com.te.objectcasting;

public class TestOc {
	public static void main(String[] args) {
		SuperClass superclass = new SubClass();
		superclass.m1();
		System.out.println(superclass.i);
	}
}
