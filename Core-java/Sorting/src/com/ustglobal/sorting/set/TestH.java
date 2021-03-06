package com.ustglobal.sorting.set;

import java.util.TreeSet;
import java.util.Iterator;

public class TestH {

	public static void main(String[] args) {
		
		TreeSet<Employee> ts = new TreeSet<Employee>();
		
		Employee e1 = new Employee(12, "gokul", 45000);
		Employee e2 = new Employee(34, "mohan", 50000);
		Employee e3 = new Employee(5, "kavin", 25000);
		Employee e4 = new Employee(25, "sathi", 10000);
		Employee e5 = new Employee(25, "sathi", 10000);
		
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		ts.add(e5);
		
		System.out.println(ts.size());
		
		System.out.println("------------- Using iterator ---------------");
		
		Iterator<Employee> it = ts.iterator();
		while (it.hasNext()) {
			Employee e = it.next();
			System.out.println("Id is "+e.id);
			System.out.println("Name is "+e.name);
			System.out.println("Salary is "+e.salary);
			
			System.out.println("-------------------------------");
			
		}
	}

}
