package com.masai.Usecases;

import java.util.List;

import com.masai.Dao.TrainingDao;
import com.masai.Dao.TrainingDaoImpl;
import com.masai.entity.Student;
import com.masai.exceptions.CourseException;

public class GetStudentListByCourseName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		TrainingDao td= new TrainingDaoImpl();
		
		try {
			List<Student> st=td.getAlltheStudentsByCourseName("Fullstack");
		st.forEach(s -> System.out.println(s));
		} catch (CourseException e) {
			// TODO Auto-generated catch block
		System.out.println(e.getMessage());
		}
	}
	
	
}
