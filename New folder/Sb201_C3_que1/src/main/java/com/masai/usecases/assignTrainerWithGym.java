package com.masai.usecases;

import com.masai.Dao.FitnessDao;
import com.masai.Dao.FitnessDaoImpl;

import Exception.GymExcpetion;
import Exception.TrainerException;

public class assignTrainerWithGym {

	public static void main(String[] args) {
		FitnessDao ft= new FitnessDaoImpl();
		
		int trainer_id=2;
		int gym_id=1;
		try {
			ft.assignTrainerWithGym(trainer_id, gym_id);
			
			System.out.println("assignTrainer succ....");
		} catch (TrainerException | GymExcpetion e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
