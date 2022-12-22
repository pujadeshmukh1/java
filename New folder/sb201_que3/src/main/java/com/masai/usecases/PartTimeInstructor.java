package com.masai.usecases;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.masai.Entity.EMUtil;



public class PartTimeInstructor {

	public static void main(String[] args) {
		EntityManager em = EMUtil.getEM();
		String jpql = "from ConractualEmployee";
		TypedQuery<PartTimeInstructor> q = em.createQuery(jpql, PartTimeInstructor.class);
		
		List<PartTimeInstructor> ce = q.getResultList();
		ce.forEach(c->{
			System.out.println(c);
		});

	}
	
	
}
