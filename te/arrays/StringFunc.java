package com.te.arrays;

public class StringFunc {
	public static void main(String[] args) {
		String s1 = "hello world";
		String s2 = "Radhe Shyam";
		String s3="hi hi all";
		int i=10;
		System.out.println(s1.length());
		System.out.println(s1.toUpperCase());
		System.out.println(s2.toLowerCase());
		System.out.println(s1.charAt(4));
		char[] charArray=s1.toCharArray();
		System.out.println(charArray);
		System.out.println(s1.contentEquals(s2));
		System.out.println(s1.concat(s2));
		System.out.println(s1.contains("hello"));
		System.out.println(s1.isEmpty());
		System.out.println(s1.replace('l', 'a'));
		System.out.println(s2.replaceFirst("hi", "bye"));
		System.out.println(s1.toString());
		
	}
}
