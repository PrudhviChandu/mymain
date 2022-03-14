package com.te.arrays;
//largest number in an array
public class Largest {
public static void main(String[] args) {
	int a[]= {100,90,60,80,50};
	int largest=a[0];
	for(int i=0;i<=a.length-1;i++) {
		if(a[i]>largest) {
			largest=a[i];
		}
	}
	System.out.println(largest);
}
}
