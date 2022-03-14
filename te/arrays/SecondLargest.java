package com.te.arrays;
//second largest
import java.util.Scanner;

public class SecondLargest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the size");
		int size = scanner.nextInt();
		int a[] = new int[size];
		System.out.println("enter the array elements");
		for(int i=0;i<=size-1;i++) {
			a[i]=scanner.nextInt();
		}		
		int largest=a[0];
		int secondLargest=a[0];
		for(int i=0;i<=size-1;i++) {
			if(a[i]>largest) {
				secondLargest=largest;
				largest=a[i];
			}
		}
		System.out.println("second largest number is"+secondLargest);
			
		
		
	}

}
