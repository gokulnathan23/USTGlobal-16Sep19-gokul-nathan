package com.ustglobal.objectclass;

public class TestG {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(1, "gokul", 29000);
		
		Employee e2 = new Employee(2, "mohan", 25000);
		
		Employee e3 = new Employee(3, "kavin", 22000);
		
		Employee e4 = e3;
		
		System.out.println(e1.equals(e2));
		System.out.println(e2.equals(e3));
		System.out.println(e3.equals(e4));
		System.out.println(e1.equals(e4));
		
	}

}
