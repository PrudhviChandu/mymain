package com.te.javabasics;

import java.util.Scanner;

public class StringReve {
	public static void main(String[] args) {
		//user input string reverse
		/*
		 * Scanner scanner = new Scanner(System.in);
		 * System.out.println("enter the name"); String s =scanner.next(); String
		 * s1=" ";
		 * 
		 * 
		 * for(int i=s.length()-1;i>=0;i--) { s1=s1+s.charAt(i); System.out.print(s1); }
		 */
		//hardcoded string reverse
		String s= "java";
for(int i=s.length()-1;i>=0;i--) {
System.out.print(s.charAt(i));
	}
}
}
