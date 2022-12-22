package com.masai.Dao;

import javax.persistence.EntityManager;

import com.masai.EMUtil.EMUtil;
import com.masai.entity.Course;
import com.masai.ex.CourseException;
import com.masai.ex.StudentException;

public class DaoImpl implements Dao{

	@Override
	public void addCourse(Course course) {
		// TODO Auto-generated method stub
		EntityManager em = EMUtil.provideEntityManager();
        em.getTransaction().begin();
		
		em.persist(course);
		
		em.getTransaction().commit();
			em.close();
		
	}

	@Override
	public void getStudent(int roll_no) throws StudentException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getCourse(int course_id) throws CourseException {
		// TODO Auto-generated method stub
		
	}

}
