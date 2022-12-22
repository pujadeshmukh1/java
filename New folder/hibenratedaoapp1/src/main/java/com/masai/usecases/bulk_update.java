package com.masai.usecases;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.masai.utility.EMUtil;

public class bulk_update {

	public static void main(String[] args) {
EntityManager em= EMUtil.provideEntityManager();
		
		String jpql= "update Account set balance=balance+500";
		
		Query q= em.createQuery(jpql);
		
		em.getTransaction().begin();
		int x= q.executeUpdate();
		em.getTransaction().commit();
		
		System.out.println(x+" row updated...");
	}

}
