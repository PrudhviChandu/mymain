package com.te.javabasics;

public class Book {
	
	String author;
	String title;
	int pages;
	double price;
	public Book(String author, String title, int pages, double price) {
		this("MartinJames", "FerociousBeast", 200);
		this.price = price;
	}
	public Book(String author, String title, int pages) {
		this("PeterPaul", "The last man survived");
		this.pages = pages;
	}
	public Book(String author, String title) {
		this.author = author;
		this.title = title;
	}
	public void display() {
		System.out.println("author of the book:"+author);
		System.out.println("title of the book:"+title);
		System.out.println("pages of the book:"+pages);
		System.out.println("price of the book:"+price);
	}
	

}
