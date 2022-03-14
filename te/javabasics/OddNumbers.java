package com.te.javabasics;

import java.util.Scanner;

public class OddNumbers {

	Scanner scanner = new Scanner(System.in);
	int n = scanner.nextInt();
//first way
	public void test1() {
		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
	}
//second way
	public void test2() {

		for (int j = 1; j <= n; j = j + 2) {
			System.out.println(j);
		}
	}
//third way
	public void test3() {

		for (int k = 0; k <= n; k++) {
			if (k % 2 == 0) {
				continue;
			}
			System.out.println(k);
		}
	}
//fourth way
	public void test4() {
		for (int l = 1; l < 20; l++) {
			System.out.println(l);
			l += l;//this equals l+l
		}
	}

	public static void main(String[] args) {
		OddNumbers odd = new OddNumbers();
		odd.test1();
		odd.test2();
		odd.test3();
		odd.test4();
	}

}
//output is generating we have to enter input value in the empty space only
