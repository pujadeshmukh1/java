package com.masai.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.masai.EMUtil.EMUtil;
import com.masai.entity.Gym;
import com.masai.entity.Person;
import com.masai.entity.Trainer;

import Exception.GymExcpetion;
import Exception.TrainerException;

public class FitnessDaoImpl implements FitnessDao{

	@Override
	public void addGym(Gym gym) {
		// TODO Auto-generated method stub
		EntityManager em = EMUtil.getEntityManager();
		em.getTransaction().begin();
		em.persist(gym);
		em.getTransaction().commit();
		em.close();
		
	}

	@Override
	public void registerPerson(Person person, int gym_id) throws GymExcpetion {
		// TODO Auto-generated method stub
		
		EntityManager em = EMUtil.getEntityManager();
		
		Gym g=em.find(Gym.class, gym_id);
		if(g==null)throw new GymExcpetion();
		person.getGyms().add(g);
		
		em.getTransaction().begin();
	   g.getPer().add(person);
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public void registerTrainer(Trainer trainer) {
		// TODO Auto-generated method stub
		EntityManager em = EMUtil.getEntityManager();
		
		em.getTransaction().begin();
		em.persist(trainer);
		em.getTransaction().commit();
	}

	@Override
	public void assignTrainerWithGym(int trainer_id, int gym_id) throws TrainerException, GymExcpetion {
		// TODO Auto-generated method stub
		EntityManager em = EMUtil.getEntityManager();
		
		Trainer t = em.find(Trainer.class, trainer_id);
		if(t==null)throw new TrainerException();
		
		Gym g1=em.find(Gym.class, gym_id);
		if(g1==null)throw new GymExcpetion();
		
		em.getTransaction().begin();
		t.getGym_t().add(g1);
		g1.setT(t);
		em.getTransaction().commit();
		
		
	}

	@Override
	public List<Person> getAllthePersonByGymName(String gym_name) throws GymExcpetion {
		// TODO Auto-generated method stub
		EntityManager em = EMUtil.getEntityManager();
		
		String jpql="from Gym where gym.gym_name=:per";
		TypedQuery<Gym> tgym=em.createQuery(jpql,Gym.class);
		tgym.setParameter("per", gym_name);
		
		
		return tgym.getSingleResult().getPer();
	}

}
