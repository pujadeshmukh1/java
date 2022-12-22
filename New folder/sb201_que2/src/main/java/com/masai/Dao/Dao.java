package com.masai.Dao;

import com.masai.Entity.Course;
import com.masai.exception.CourseException;
import com.masai.exception.StudentException;

public interface Dao {

	
	public void addCourse(Course course);
	public void getStudent(int roll_no) throws StudentException;
	public void getCourse(int course_id) throws CourseException;
	
	
}
