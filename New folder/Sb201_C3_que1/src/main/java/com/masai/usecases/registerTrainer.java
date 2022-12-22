package com.masai.usecases;

import com.masai.Dao.FitnessDao;
import com.masai.Dao.FitnessDaoImpl;
import com.masai.entity.Trainer;

public class registerTrainer {

	public static void main(String[] args) {
		FitnessDao ft= new FitnessDaoImpl();
		
		Trainer t= new Trainer();
		t.setEmail("trai1@gmail.com");
		t.setTrainer_name("ramu");
		t.setYear_of_experience(2);
		
		ft.registerTrainer(t);
		
		System.out.println("done....");
	}
	
}
