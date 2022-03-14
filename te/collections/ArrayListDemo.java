package com.te.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {
public static void main(String[] args) {
	ArrayList arraylist =new ArrayList();
	arraylist.add(10);
	arraylist.add(20);
	arraylist.add(30);
	arraylist.add(40);
	arraylist.add(50);
	arraylist.add("sam"  
			);
	System.out.println(arraylist);
	System.out.println("-------for----------");
	//1st way of iterating
	for(int i=0;i<arraylist.size();i++) {
		System.out.println(arraylist.get(i));
	}
	System.out.println("---foreach-------");
	//2nd way of iterating  
	for (Object object : arraylist) {
		System.out.println(object);
	}
	//3rd way of iterating
	System.out.println("----------iterator()-----");
	Iterator iterator =arraylist.iterator();
	while(iterator.hasNext()) {
		System.out.println(iterator.next());
	}
	System.out.println("----------");
	// 4th way of iterator
	ListIterator listIterator =arraylist.listIterator();
	while(listIterator.hasNext()) {
		System.out.println(listIterator.next());
	}
	System.out.println("--------------");
	// 5th way of iterator
		ListIterator iterator1 =arraylist.listIterator(arraylist.size());
		while(listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
		
			
}
}
