package com.te.acessmodifiers;

public class InSameClass {
	public void publicMethod() {
		System.out.println("this is public method ");
	}
	protected void protectedMethod() {
		System.out.println("this is protected method ");
	}

	 void defaultMethod() {
		System.out.println("this is default method ");
	}

	private void privateMethod() {
		System.out.println("this is private method ");
	}

public static void main(String[] args) {
	InSameClass class1 =new InSameClass();
	class1.publicMethod();
	class1.protectedMethod();
	class1.defaultMethod();
	class1.privateMethod();
}
}
