package com.masai.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Gym {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int gym_id; 
	private String gym_name ;
	private int monthly_fee;
	
	@Embedded
	@ManyToMany(mappedBy = "Gym", cascade = CascadeType.ALL)
	private List<Person> per = new ArrayList<Person>();
	
	@Embedded
	@ManyToOne
	private Trainer t;

	public int getGym_id() {
		return gym_id;
	}

	public void setGym_id(int gym_id) {
		this.gym_id = gym_id;
	}

	public String getGym_name() {
		return gym_name;
	}

	public void setGym_name(String gym_name) {
		this.gym_name = gym_name;
	}

	public int getMonthly_fee() {
		return monthly_fee;
	}

	public void setMonthly_fee(int monthly_fee) {
		this.monthly_fee = monthly_fee;
	}

	

	public List<Person> getPer() {
		return per;
	}

	public void setPer(List<Person> per) {
		this.per = per;
	}

	public Trainer getT() {
		return t;
	}

	public void setT(Trainer t) {
		this.t = t;
	}
	
	
	
	
}
