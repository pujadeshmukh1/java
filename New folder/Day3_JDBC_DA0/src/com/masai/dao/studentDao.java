package com.masai.dao;

import com.masai.model.Student;

public interface studentDao {

	public String insertStudentDetails(int roll, String sname, int mark);
	
	public String insertStudentDetails2(Student student);
	
}
