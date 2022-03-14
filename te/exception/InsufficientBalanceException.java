package com.te.exception;
//it is an unchecked Exception class
public class InsufficientBalanceException extends RuntimeException{
String msg;

public InsufficientBalanceException(String message) {
	this.msg = message;
}
@Override
	public String getMessage() {
		return this.msg;
}
}
