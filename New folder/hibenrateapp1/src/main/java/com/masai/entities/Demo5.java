package com.masai.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Demo5 {

	public static void main(String[] args) {
		
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("studentUnit");
		EntityManager em= emf.createEntityManager();
		Student student= new Student(63,"dina", 870);
		
		em.getTransaction().begin();
		
		em.persist(student);
		
		em.getTransaction().commit();
		
		em.close();
		
		System.out.println("done");
		
		}
		}

