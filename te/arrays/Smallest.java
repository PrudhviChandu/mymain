package com.te.arrays;
import java.util.Arrays;
//second largest
import java.util.Scanner;

public class Smallest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		System.out.println("enter the size");
		int size = scanner.nextInt();
		int a[] = new int[size];
		System.out.println("enter the array elements");
		for(int i=0;i<=size-1;i++) {
			a[i]=scanner.nextInt();
		}		
		Arrays.sort(a);
		int smallest=a[0];
		int secondSmallest=a[0];
		for(int i=0;i<=size-1;i++) {
			if(a[i] != a[i+1]) {
				secondSmallest=a[i+1];
				
				smallest=a[i];
				break;
			}
		}
		System.out.println("second largest number is"+secondSmallest+"\nsmallest number is:"+smallest);
			
		
		
	}

}
