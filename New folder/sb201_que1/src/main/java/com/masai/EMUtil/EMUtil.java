package com.masai.EMUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMUtil {
private static EntityManagerFactory emf;
	
	static {
		
	
		 emf=Persistence.createEntityManagerFactory("product");
	}

	public static EntityManager getEM() {
		
		return emf.createEntityManager();
	}
}
