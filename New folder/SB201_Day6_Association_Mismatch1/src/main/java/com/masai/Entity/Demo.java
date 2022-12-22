package com.masai.Entity;

import javax.persistence.EntityManager;

import com.masai.Utility.EMUtil;

public class Demo {
public static void main(String[] args) {
	EntityManager em= EMUtil.getEM();
	Employee emp = new Employee();
	emp.setName("Ram1");
	emp.setSalary(12345);
	Employee emp1 = new Employee();
	emp1.setName("Ramesh1");
	emp1.setSalary(62345);
	
	Department de = new  Department();
	de.setDname("HR");
	de.setLocation("pune");
	
	de.getEmps().add(emp);
	de.getEmps().add(emp1);
	
    em.getTransaction().begin();
	
	em.persist(emp);
	em.persist(emp1);
	em.persist(de);
	
	em.getTransaction().commit();
	
	em.close();
	
	System.out.println("done...");
}
}
