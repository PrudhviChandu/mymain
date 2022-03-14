package com.te.javabasics;

public class Variables {
	int i=10;//instance variable
	static int j = 20;

//testing this keyword
	public void thiskeyword(int a) {
		this.i = a;
	}

	/* testing local variable */
	public static void variableTest() {
		int i = 20;
		System.out.println(i + "==> local");
	}

	/* not able to access non static variable in static method */
	public static void variableTest1() {
		System.out.println(j);
	}

	public static void main(Try[] args) {
		Variables variables = new Variables();
		System.out.println(j + "==>  static ");
		variableTest();
		variableTest1();
		variables.thiskeyword(60);//overriding instance variable i.e. changing 10 into 60
		
		System.out.println(variables.i + "==> non static ");

	}
}