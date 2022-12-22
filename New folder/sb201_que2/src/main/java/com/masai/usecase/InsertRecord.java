package com.masai.usecase;

import com.masai.Dao.Dao;
import com.masai.Dao.DaoImpl;
import com.masai.Entity.Course;
import com.masai.Entity.Student;

public class InsertRecord {
public static void main(String[] args) {
	
		
	   Course c=new Course();
		c.setCourseId(1);
		c.setCourseName("spring");
		c.setDuration("6m");
		c.setFee(50000);
		
		
		 Course c1=new Course();
			c1.setCourseId(1);
			c1.setCourseName("spring");
			c1.setDuration("6m");
			c1.setFee(50000);
			
		
		Student s=new Student();
		
		 s.setRollNo(2);
		 s.setName("abi");
		 s.setEmail("a@gami");
		 s.setMobile(4654465);
		 
		
		
		s.setCourse(c);
		c.getList().add(s);
		
		Dao dao=new DaoImpl();
		dao.addCourse(c);
		
	}
}
