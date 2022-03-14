package com.te.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {
public static void main(String[] args) {
	LinkedList linkedlist =new LinkedList();
	linkedlist.add(10);
	linkedlist.add(20);
	linkedlist.add(30);
	linkedlist.add(40);
	linkedlist.add(50);
	  Iterator iterator =linkedlist.iterator();
	  while(iterator.hasNext()) {
		  System.out.println(iterator.next());
}
	  System.out.println("==================");
	  ListIterator listiterator =linkedlist.listIterator();
	  while(listiterator.hasNext()) {
		  System.out.println(listiterator.next());
	  }
	  System.out.println("==================");
	  ListIterator iterator1 =linkedlist.listIterator(linkedlist.size());
	  while(listiterator.hasPrevious()) {
	  System.out.println(iterator1.previous());
	  }
}
}

