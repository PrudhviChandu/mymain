package com.te.javabasics;

public class InheritedBlock extends Blocks{
public InheritedBlock() {
	System.out.println("this is a subclass constructor");
}
//static block
static
{
	System.out.println("this is a subclass static block");
}
//non static block
{
	System.out.println("this is a subclass non static block");
}

}
