package com.te.javabasics;

public class Blocks {
	
public Blocks() {
 System.out.println("this is a superclass constructor");
}
//static block
static
{
	System.out.println("this is a superclass static block");
}
//non static block
{
	System.out.println("this is a superclass non static block");
}
}
