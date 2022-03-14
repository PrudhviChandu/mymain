package com.te.exception;
//checked
import java.util.Scanner;

public class VoteTest {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter the age");
	int age =scanner.nextInt();
	Vote vote = new Vote();
	try {
		vote.vote(age);
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
}
}
