package com.masai.usecases;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;

import com.masai.EMUtil.EMUtil;
import com.masai.entity.Course;
import com.masai.entity.student;

public class insertRecord {
public static void main(String[] args) {
	EntityManager em = EMUtil.provideEntityManager();
	em.getTransaction().begin();
  
	Course c1 = new Course();
	c1.setCourseName("Java");
	c1.setDuration(2);
	c1.setFee(23333);
	
	
	student s1 = new student();
	s1.setName("usha");
	s1.setEmail("usha@gmail.com");
	s1.setMobile(5638993);
	
	s1.setCourse(c1);
	
	student s2= new student();
	s2.setName("disha");
	s2.setEmail("disha@gmail.com");
	s2.setMobile(89638993);
	
	s2.setCourse(c1);
	
	
	Set<student> s = new HashSet<>();
	s.add(s1);
	s.add(s2);
	
	
	//ASSOCIATE student WITH course
	c1.setStu(s);
	em.persist(c1);
	em.getTransaction().commit();
	
	// course CAN ACCESS student
	Course d = em.find(Course.class, 1);
	System.out.println("Department id is " + d.getCourseId());
	System.out.println("Department name is " + d.getCourseName());
	System.out.println("Department Duration is " + d.getDuration());
	System.out.println("Department Fee is " + d.getFee());
	
	Set<student> st = d.getStu();
	
	for(student stu1: st) {
		System.out.println("student rollno is  "+stu1.getRollNo());
		System.out.println("student Name is  "+stu1.getName());
		System.out.println("student Email is  "+stu1.getEmail());
		System.out.println("student Moblie is  "+stu1.getMobile());
	}
	
	// student CAN ACCESS course BECAUSE IT IS BIDRECTIONAL
	student emp = em.find(student.class, 2);
	System.out.println("student roll is " + emp.getRollNo());
	System.out.println("student name is " + emp.getName());
	System.out.println("student email is " + emp.getEmail());
	System.out.println("student courseID is "+emp.getCourse().getCourseId());
	System.out.println("student courseName is "+emp.getCourse().getCourseName());
	System.out.println("student courseDuration is "+emp.getCourse().getDuration());
	System.out.println("student courseFee is "+emp.getCourse().getFee());
	em.getTransaction().commit();
	
}
}
