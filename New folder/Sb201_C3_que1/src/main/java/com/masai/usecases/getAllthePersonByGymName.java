package com.masai.usecases;

import java.util.List;

import com.masai.Dao.FitnessDao;
import com.masai.Dao.FitnessDaoImpl;
import com.masai.entity.Person;

import Exception.GymExcpetion;

public class getAllthePersonByGymName {

	public static void main(String[] args) {
		FitnessDao ft= new FitnessDaoImpl();
		
		try {
			List<Person> p=ft.getAllthePersonByGymName("ahaGym");
			
			p.forEach(s -> System.out.println(s));
		} catch (GymExcpetion e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
	}
}
