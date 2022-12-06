package com.jsp.mobile;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GetAllMobile {
	public static void main(String [] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("rutuja");
    EntityManager entityManager= entityManagerFactory.createEntityManager();
    
    
    	String sql="Select m from Mobile m";
    
    	Query query=entityManager.createQuery(sql);
    	
         List <Mobile> mobile=query.getResultList();
    	
    	for(Mobile m : mobile) {
    		System.out.println("=============");
    		System.out.println(m.getBrand());
    		System.out.println(m.getName());
    		System.out.println(m.getId());
    	}
    	
}
}