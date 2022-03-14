package com.te.javabasics;

import com.te.acessmodifiers.InSameClass;

public class InDiffPackage extends InSameClass {
public static void main(String[] args) {
	InDiffPackage class1 =new InDiffPackage();
	class1.publicMethod();
	class1.protectedMethod();
}
}
//in different package protected can be accessed but only if it is a subclass of the class which has the method and also object should be created to the subclass only