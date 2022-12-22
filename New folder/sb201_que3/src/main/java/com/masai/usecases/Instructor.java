package com.masai.usecases;

import javax.persistence.EntityManager;

import com.masai.Entity.EMUtil;
import com.masai.Entity.FullTimeInstructor;
import com.masai.Entity.PartTimeInstructor;


public class Instructor {
public static void main(String[] args){
		
		EntityManager em = EMUtil.getEM();
		
		FullTimeInstructor f1 = new FullTimeInstructor();
		FullTimeInstructor f2 = new FullTimeInstructor();
		FullTimeInstructor f3 = new FullTimeInstructor();
		FullTimeInstructor f4 = new FullTimeInstructor();
		
		
		
		f1.setInstructorName("asha");
		f1.setEmail("asha@gmail.com");
		f1.setSalary(10000);
		
		f2.setInstructorName("annu");
		f2.setEmail("anu@gmail.com");
		f2.setSalary(11000);
		
		f3.setInstructorName("disha");
		f3.setEmail("disha@gmail.com");
		f3.setSalary(12000);
		
		f4.setInstructorName("uma");
		f4.setEmail("uma@gmail.com");
		f4.setSalary(9000);
		
		PartTimeInstructor ce = new PartTimeInstructor();
		PartTimeInstructor ce1 = new PartTimeInstructor();
		PartTimeInstructor ce2 = new PartTimeInstructor();
		PartTimeInstructor ce3 = new PartTimeInstructor();
		
	    ce.setInstructorName("Aju");
	    ce.setCostofperday(500);
	    ce.setMobileNumber("1234567890");
	    ce.setNoOfWorkingDays(5);
	    
	    ce1.setInstructorName("Shub");
	    ce1.setCostofperday(600);
	    ce1.setMobileNumber("1234567890");
	    ce1.setNoOfWorkingDays(4);
	    
	    ce2.setInstructorName("Hari");
	    ce2.setCostofperday(700);
	    ce2.setMobileNumber("9874563210");
	    ce2.setNoOfWorkingDays(7);
	    
	    ce3.setInstructorName("Ram");
	    ce3.setCostofperday(400);
	    ce3.setMobileNumber("9012507749");
	    ce3.setNoOfWorkingDays(8);
	    
	    em.getTransaction().begin();
	    em.persist(f1);
	    em.persist(f2);
	    em.persist(f3);
	    em.persist(f4);
	    
	    em.persist(ce);
	    em.persist(ce1);
	    em.persist(ce2);
	    em.persist(ce3);
	    em.getTransaction().commit();
	    System.out.println("Done...");
	    em.close();
	    
	}
	
	
}
