package com.te.exception;
//unchecked
public class Account {
double balance;

public Account(double balance) {
	this.balance = balance;
}

public void withdraw(double amount) {  //we can use throws here also like withdraw(double amount)throws InsufficientBalanceException
	
	if(this.balance>=amount) {
System.out.println(amount+"withdrawn successfully");
}else {
	throw new InsufficientBalanceException("insufficient balance");
}
}
}
//it is not mandatory to not to have throws in unchecked i.e. runtime 
//we may or may not have