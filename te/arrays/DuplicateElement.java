package com.te.arrays;

import java.util.Arrays;
import java.util.Scanner;

//duplicate element in the array
public class DuplicateElement {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the array size");
		int size =scanner.nextInt();
		int a[] =new int[size];
		System.out.println("enter the array elemnts");
		for(int i=0;i<=size-1;i++) {
			a[i]=scanner.nextInt();
		}
		Arrays.sort(a);
		System.out.print("duplicate elements are:");
		for(int i=0;i<=size-1;i++) {
			for(int j=i+1;j<=size-1;j++) {
				if(a[i]==a[j]){
					System.out.print(a[i]+" ");
				}
			}
		}
	}

}
