package com.masai.utility;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMUtil {

	//private static EntityManagerFactory emf =Persistence.createEntityManagerFactory("account-unit");

	private static EntityManagerFactory emf;
	
	static{
		emf=Persistence.createEntityManagerFactory("account-unit");
	}
	
	
		//EntityManager em= emf.createEntityManager();
		//return em;
		
		
	

	public static EntityManager provideEntityManager() {
		// TODO Auto-generated method stub
		return emf.createEntityManager();
	}


	
	
}
