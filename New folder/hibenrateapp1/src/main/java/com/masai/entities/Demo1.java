package com.masai.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("studentUnit");
		
		EntityManager em= emf.createEntityManager();
		Student student= new Student(55, "ssham", 570);
		
//		 EntityTransaction et= em.getTransaction();
//		
//		 et.begin();
//		
//		 em.persist(student);
//		
//		 et.commit();
//		 em.close();
		
		em.getTransaction().begin();
		em.persist(student);
		em.getTransaction().commit();
		
		em.close();
		System.out.println("done...");
		
	}

}
