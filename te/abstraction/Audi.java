package com.te.abstraction;

public class Audi implements Car{

	@Override
	public void start() {
		System.out.println("Audi has started");
		
	}

	@Override
	public void accelerate() {
		System.out.println("Audi is accelerated");
		
	}

	@Override
	public void brake() {
		System.out.println("Audi has stopped");
		
	}
	

@Override
public void airBag() {
	System.out.println("audi has airbag");
}
	

}
