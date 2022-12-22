package com.masai.Usecases;

import com.masai.Dao.TrainingDao;
import com.masai.Dao.TrainingDaoImpl;
import com.masai.entity.Student;
import com.masai.exceptions.CourseException;

public class RegisterStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TrainingDao td= new TrainingDaoImpl();
		
		Student s= new Student();
		
		s.setName("asha");
		s.setEmail("asha@gmail.com");
		s.setMobile("9876543210");
		
		
		int course_id=1;
		
		try {
			td.registerStudent(s, course_id);
			System.out.println("record inserted succesfully!!");
		} catch (CourseException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		

	}
	
}
