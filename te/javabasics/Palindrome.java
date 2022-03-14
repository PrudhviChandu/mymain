package com.te.javabasics;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the name");
		String s = scanner.next();
		String s1 = " ";
		for (int i = s.length() - 1; i >= 0; i--) {
			s1 = s1+s.charAt(i);
		}
		System.out.println(s1);
		if(s.equals(s1)) {
			System.out.println("it is a palindrome");
		}
		else {
			System.out.println("it is not a palindrome");
			
		}
	}
}
