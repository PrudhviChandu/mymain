package com.te.javabasics;

public class Operators {
//checking logical And
	public static void test1() {
		int a = 0;
		int b = 1;
		System.out.println("test1 result");
		System.out.println(a++ >= 1 && b++ >= 1);
		System.out.println(a);
		System.out.println(b);
	}
	//checking bitwise And
	public static void test2() {
		int a = 0;
		int b = 1;
		System.out.println("test2 result");
		System.out.println(a++ >= 1 & b++ >= 1);
		System.out.println(a);
		System.out.println(b);
	}
	//checking logical or
	public static void test3() {
		int a = 0;
		int b = 1;
		System.out.println("test3 result");
		System.out.println(a++ >= 1 || b++ >= 1);
		System.out.println(a);
		System.out.println(b);
	}
	//checking bitwise Or
	
	public static void test4() {
		int a = 0;
		int b = 1;
		System.out.println("test4 result");
		System.out.println(a++ >= 1 | b++ >= 1);
		System.out.println(a);
		System.out.println(b);
	}
	public static void test5() {
		int a=0;
		a=++a;
		System.out.println("test5 result");
		System.out.println(a);
		a=++a;
		System.out.println(a);
		a=a++;
		System.out.println(a);
		a=a++;
		System.out.println(a);
	}
public static void test6() {
	int a=0;
	System.out.println("test6 result");
	System.out.println(a++);
	System.out.println(a);
}
	public static void main(Try[] args) {
		test1();
		test2();
		test3();
		test4();
		test5();
		test6();
	}

}