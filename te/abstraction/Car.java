package com.te.abstraction;

public interface Car {
	
	void start();
	
	void accelerate();
	
	void brake();
	
	default void airBag()
	{
		
	}

}
