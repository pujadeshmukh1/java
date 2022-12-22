package com.masai.Usecases;

import com.masai.Dao.TrainingDao;
import com.masai.Dao.TrainingDaoImpl;
import com.masai.exceptions.TeacherException;
import com.masai.entity.Course;

public class AddCourse {

	public static void main(String[] args) {
		TrainingDao td= new TrainingDaoImpl();
		
		Course c= new Course();
		
		c.setCourseName("Fullstack");
		c.setDuration(1);
		c.setFee(7000);
	
			td.addCourse(c);
		
			// TODO Auto-generated catch block
		
		
		System.out.println("done");
		
	}
	
}
