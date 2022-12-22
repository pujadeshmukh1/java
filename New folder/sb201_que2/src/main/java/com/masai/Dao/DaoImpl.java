package com.masai.Dao;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.masai.Entity.Course;
import com.masai.Entity.Student;
import com.masai.exception.CourseException;
import com.masai.exception.StudentException;


public class DaoImpl implements Dao{

	@Override
	public void addCourse(Course course) {
		// TODO Auto-generated method stub
		EntityManager em=	EMUtil.getEM();
		
		em.getTransaction().begin();
		
		em.persist(course);
		
		em.getTransaction().commit();
			em.close();
	}

	@Override
	public void getStudent(int roll_no) throws StudentException {
		// TODO Auto-generated method stub
EntityManager em=	EMUtil.getEM();
		
		Query q   =	 em.createQuery("from Student where rollNo=?1");
		q.setParameter(1,  roll_no);
		
		Student s=(Student) q.getSingleResult();
		
		if(s==null) {
			
			throw new StudentException("student not found");
		}
		
		System.out.println(s.getName());
		System.out.println(s.getEmail());
		System.out.println(s.getMobile());
		System.out.println(s.getCourse());
	}

	@Override
	public void getCourse(int course_id) throws CourseException {
		// TODO Auto-generated method stub
		EntityManager em=EMUtil.getEM();

		
		Query q   =	 em.createQuery("from Course where courseId=?1");
		q.setParameter(1,  course_id);

		 Course s=(Course) q.getSingleResult();

		if(s==null) {
			
			throw new CourseException("course not found");
		}

		System.out.println(s.getCourseName());
		System.out.println(s.getDuration());
		System.out.println(s.getFee());
	}

	
}
