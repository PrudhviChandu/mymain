package com.te.abstraction;

public class TightCoupling {
	public static void main(String[] args) {
		CarFactory carFactory=new CarFactory();
		Car car=carFactory.getCar();//it is an upcating
		car.start();
		car.accelerate();
		car.brake();
	}

}
//not completely loose coupled