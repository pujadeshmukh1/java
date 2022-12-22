package com.masai.usecases;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import com.masai.Entity.EMUtil;





public class FullTimeInstructor {

	public static void main(String[] args) {
		
		EntityManager em = EMUtil.getEM();
		
		String jpql = "from SalariedEmployee";
		
		TypedQuery<FullTimeInstructor> q = em.createQuery(jpql, FullTimeInstructor.class);
		
		List<FullTimeInstructor> se = q.getResultList();
		se.forEach(s->{
			System.out.println("FullTimeInstructor id is :"+ se.getInstructorId());
			
			System.out.println("FullTimeInstructor Name is :"+ se.getInstructorName());
			
			System.out.println("FullTimeInstructor email is :"+ se.getEmail());
			
			System.out.println("FullTimeInstructor salary is :"+ se.getSalary());
			
			System.out.println("================================");
			
		});
	

	}
	
	
}
