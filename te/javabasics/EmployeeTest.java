package com.te.javabasics;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setId(07);
		employee.setName("chandu");
		employee.setAddress("Akividu");
		System.out.println(employee.getId());
		System.out.println(employee.getName());
		System.out.println(employee.getAddress());
	}
}
