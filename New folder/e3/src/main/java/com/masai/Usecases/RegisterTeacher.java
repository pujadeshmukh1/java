package com.masai.Usecases;

import com.masai.Dao.TrainingDao;
import com.masai.Dao.TrainingDaoImpl;
import com.masai.entity.Teacher;

public class RegisterTeacher {
	public static void main(String[] args) {
		TrainingDao td= new TrainingDaoImpl();
		
		Teacher t= new Teacher();
		t.setEmail("teacher@gmail.com");
		t.setNoYearOfExperince(5);
		t.setTeacherName("sumit");
		td.registerTeacher(t);
		
		System.out.println("Done!!");
	}
	
	
}
