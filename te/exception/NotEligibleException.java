package com.te.exception;
//not eligible is an  checked exception class
public class NotEligibleException extends Exception{
String msg;

public NotEligibleException(String msg) {        
	                                          
	this.msg = msg;                       
}                                       
@Override
	public String getMessage() {
		return this.msg;
	}
}
/*
 * we can also do
 *  public NotEligibleException(Sting msg) { 
 *  super();
 *   so that we no need to override the getMessage() method which is present in throwable class
 */