package com.te.abstraction;

public class Bmw implements Car{

	@Override
	public void start() {
		System.out.println("Bmw has started");
		
	}

	@Override
	public void accelerate() {
		System.out.println("Bmw is accelerated");
		
	}

	@Override
	public void brake() {
		System.out.println("Bmw has stopped");
		
	}
	
	

}
