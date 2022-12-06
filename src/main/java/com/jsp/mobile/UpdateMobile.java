package com.jsp.mobile;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateMobile {
	public static void main(String[]args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("rutuja");
	    EntityManager entityManager= entityManagerFactory.createEntityManager();
	    EntityTransaction entityTransaction=entityManager.getTransaction();
	
	    Mobile mobile=entityManager.find(Mobile.class,1);
	    
	    if(mobile !=null) {
	    	System.out.println(mobile.getId());
	    	System.out.println(mobile.getBrand());
	    	System.out.println(mobile.getName());
	    }
	    else {
	    	System.out.println("NO Mobile Object Found");
	    }
	    
	    
}
}
