package com.te.abstraction;

import java.util.Scanner;

public class CarFactory {
public  Car getCar() {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the Car Name ");
	String car = scanner.next();
	
	if(car.equalsIgnoreCase("audi")) {
		return new Audi();
	}else if(car.equalsIgnoreCase("bmw")){
		return new Bmw();
	}
	else if(car.equalsIgnoreCase("benz")){
		return new Benz();
	}
	return null;
}}

