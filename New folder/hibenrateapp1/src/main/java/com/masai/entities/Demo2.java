package com.masai.entities;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Demo2 {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("studentUnit");
		EntityManager em= emf.createEntityManager();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter roll to delete ");
		int roll=sc.nextInt();
		Student student= em.find(Student.class, roll);
		if(student != null){
		em.getTransaction().begin();
		em.remove(student);
		em.getTransaction().commit();
		System.out.println("Student removed....");
		}else
		System.out.println("Student not found...");
		em.close();
		System.out.println("done");
}
}