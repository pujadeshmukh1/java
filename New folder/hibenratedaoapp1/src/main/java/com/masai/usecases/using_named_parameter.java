package com.masai.usecases;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.masai.utility.EMUtil;

public class using_named_parameter {

	public static void main(String[] args) {
EntityManager em= EMUtil.provideEntityManager();
		
		
		String jpql= "update Account set balance=balance+:bal where name=:nm";
		
		Query q= em.createQuery(jpql);
		
		q.setParameter("bal", 600);
		q.setParameter("nm", "Ramesh");
		
		em.getTransaction().begin();
		int x=q.executeUpdate();
		em.getTransaction().commit();
		
		
		System.out.println(x+" record updated...");

	}

}
