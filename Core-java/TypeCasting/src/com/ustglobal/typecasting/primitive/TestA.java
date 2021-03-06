package com.ustglobal.typecasting.primitive;

public class TestA {
	public static void main(String[] args) {
		byte a = 10;
		int b = a; //Implicit casting
		System.out.println("b is "+b);
		
		int p = 20;
		double q = p;
		System.out.println("q is "+q);
		System.out.println("=================================");
		
		double x = 20.67;
		int y = (int) x; //Explicit casting
		System.out.println("y is "+y);
		
		byte w = (byte) x;
		System.out.println("w is "+w);
		
		char c = (char) x;
		System.out.println("c is "+c);
	}
}
