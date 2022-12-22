package com.masai.usecase;

import java.util.Scanner;

import com.masai.Dao.Dao;
import com.masai.Dao.DaoImpl;
import com.masai.Entity.Course;
import com.masai.exception.CourseException;

public class getCourse {
	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
		
		System.out.println("enter course_id");
		int id=sc.nextInt();
		
		Dao dao=new DaoImpl();
		
		
		 try {
			dao.getCourse(id);
		} catch (CourseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
