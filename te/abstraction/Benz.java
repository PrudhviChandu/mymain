package com.te.abstraction;

public class Benz implements Car{

	@Override
	public void start() {
		System.out.println("Benz has started");
		
	}

	@Override
	public void accelerate() {
		System.out.println("Benz is accelerated");
		
	}

	@Override
	public void brake() {
		System.out.println("Benz has stopped");
		
	}
	
	

}
