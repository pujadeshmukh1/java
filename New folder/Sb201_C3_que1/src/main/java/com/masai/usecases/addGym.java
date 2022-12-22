package com.masai.usecases;

import com.masai.Dao.FitnessDao;
import com.masai.Dao.FitnessDaoImpl;
import com.masai.entity.Gym;

public class addGym {

	public static void main(String[] args) {
		
		FitnessDao ft = new FitnessDaoImpl();
		Gym gy= new Gym();
		gy.setGym_id(1);
		gy.setGym_name("ashaGym");
		gy.setMonthly_fee(2344);
		
		ft.addGym(gy);
		System.out.println("done......");
		
	}
}
