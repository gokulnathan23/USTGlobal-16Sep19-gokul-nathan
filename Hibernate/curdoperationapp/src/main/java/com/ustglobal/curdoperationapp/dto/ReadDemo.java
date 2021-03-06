package com.ustglobal.curdoperationapp.dto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ReadDemo {

	public static void main(String[] args) {

		EntityManager entityManager = null;

		try {
			EntityManagerFactory entityManagerFactory =  Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			ProductInfo productDetails = entityManager.find(ProductInfo.class, 101);
			System.out.println("ID = "+productDetails.getPid());		
			System.out.println("Name = "+productDetails.getPname());		
			System.out.println("Quantity = "+productDetails.getQuantity());
		} catch (Exception e) {
			e.printStackTrace();
		}	
		entityManager.close();
	}	// end of main method

}	// end of class
