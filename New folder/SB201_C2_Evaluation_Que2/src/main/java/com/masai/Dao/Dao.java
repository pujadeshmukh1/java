package com.masai.Dao;

import com.masai.entity.Course;
import com.masai.ex.CourseException;
import com.masai.ex.StudentException;

public interface Dao {
	
	public void addCourse(Course course);
	public void getStudent(int roll_no) throws StudentException;
	public void getCourse(int course_id) throws CourseException;
	
}
