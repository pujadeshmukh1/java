package com.masai.entities;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Demo3 {
	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("studentUnit");
		
		EntityManager em= emf.createEntityManager();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter roll to give grace marks ");
		int roll=sc.nextInt();
		
		Student student=em.find(Student.class, roll); 
		//if it returns the obj then the obj will be in p.state
		
		if(student == null){
		System.out.println("Student does not exist..");
		}
		else
		{
		System.out.println("Enter the grace marks");
		int marks=sc.nextInt();
		
		em.getTransaction().begin();
		
		student.setMarks(student.getMarks()+marks);
		
		em.getTransaction().commit();
		
		System.out.println("Marks is graced...");
		}
		em.close();
		System.out.println("done");
		}
		}
		