package com.te.acessmodifiers;

public class InDiffClass {
public static void main(String[] args) {
	InSameClass class1 =new InSameClass();
	class1.publicMethod();
	class1.protectedMethod();
	class1.defaultMethod();
	//class1.privateMethod();
}
}
