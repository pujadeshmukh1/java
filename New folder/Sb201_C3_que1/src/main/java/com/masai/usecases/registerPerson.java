package com.masai.usecases;

import com.masai.Dao.FitnessDao;
import com.masai.Dao.FitnessDaoImpl;
import com.masai.entity.Person;

import Exception.GymExcpetion;

public class registerPerson {

	public static void main(String[] args) {
		
		FitnessDao ft= new FitnessDaoImpl();
		
		Person p= new Person();
		
		p.setName("raju");
		p.setEmail("raju@gmail.com");
		p.setMobile(6784343);
		
		int gym_id=1;
		
		
		try {
			ft.registerPerson(p, gym_id);
			System.out.println("resord inserted succesfuly");
		} catch (GymExcpetion e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
	}
}
