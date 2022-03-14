package com.te.exception;
//unchecked
public class AccountTest  {
	public static void main(String[] args) {
		Account account = new Account(20000);
		try {
			account.withdraw(60000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
