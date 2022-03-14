package com.te.arrays;

import java.util.Arrays;

public class ForEach {
public static void main(String[] args) {
	Object arr[] = {1,2,3,4};
	Object temp[]=new Object[4];
	System.out.println("arr"+Arrays.toString(arr));
	System.out.println("arr"+Arrays.toString(temp));
	System.out.println("-------------");
	//one way of copying
	for (int i=0;i<arr.length;i++) {
		temp[i]=arr[i];
	}
		System.out.println("temp"+Arrays.toString(temp));
	//second way of copying
	System.arraycopy(arr, 0, temp, 0, 2);
	System.out.println("temp"+Arrays.toString(temp));
	//one way of iterating
	for(int i=0;i<arr.length;i++){
		System.out.println(arr[i]);
	}
	System.out.println("--------");
	//second way of iterating
	for (Object object : arr) {
		System.out.println(object);
	}
	}
}

