package com.te.abstraction;

public class CarTest {
public static void main(String[] args) {
	Car car =CarFactory.getCar();//to correct error make getCar as static method 
	Driver driver = new Driver();
	driver.drive(car);
	
}
}
//CarFactory and Driver are helper classes
//getCar() and drive() are helper methods