package com.masai.Dao;

import java.util.List;

import com.masai.entity.Gym;
import com.masai.entity.Person;
import com.masai.entity.Trainer;

import Exception.GymExcpetion;
import Exception.TrainerException;

public interface FitnessDao {
	public void addGym(Gym gym);
	public void registerPerson(Person person, int gym_id)throws GymExcpetion;
	public void registerTrainer(Trainer trainer);
	public void assignTrainerWithGym(int trainer_id, int gym_id) throws TrainerException,GymExcpetion;
    List<Person> getAllthePersonByGymName(String gym_name)throws GymExcpetion;
}
