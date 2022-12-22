package com.masai.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Demo4 {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("studentUnit");
		
		EntityManager em= emf.createEntityManager();
		
		Student s= em.find(Student.class, 20); //persistence state
		
		em.clear(); //detached state
		
		em.getTransaction().begin();
		
		s.setMarks(500);
		
		//em.persist(s);// it will throw duplicate ID related exception
		
		em.merge(s); //persistence state
		em.getTransaction().commit();
		em.close();
		System.out.println("done");
		}
}
