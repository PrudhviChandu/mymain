package com.te.exception;
//checked
public class Vote  {

public void vote(int age) throws NotEligibleException {
	if(age>=18) {
	
		System.out.println("eligible to vote");
	}else {
		throw new NotEligibleException("not eligible to vote");
	}
	
}
}
//try and catch are not there inside vote() method so we are throwing to another class to find try and catch