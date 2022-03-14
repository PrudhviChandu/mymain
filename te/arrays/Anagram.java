package com.te.arrays;

import java.util.Arrays;

public class Anagram {
public static void main(String[] args) {
	String s1= "raj";
	String s2= "jar";
	
	s1=s1.toLowerCase();
	s2=s2.toLowerCase();
	
	char[] charArray1 =s1.toCharArray();
	char[] charArray2 =s2.toCharArray();
	
    Arrays.sort(charArray1);
    Arrays.sort(charArray2);
	
		/*
		 * boolean result =Arrays.equals(charArray1, charArray2); if(result) {
		 * System.out.println("anagram"); } else { System.out.println("not an anagram");
		 * }
		 */
	String str1=" ";
	String str2=" ";
	
	for(int i=0;i<=charArray1.length-1;i++) {
		str1=str1+charArray1[i];
	}
	for(int i=0;i<=charArray2.length-1;i++) {
		str2=str2+charArray2[i];
	}
	if(str1.equals(str2)){
		System.out.println("it is an anagram");
	}
	else {
		System.out.println("it is not an anagram");
	}
}
}
