package com.masai.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int person_id ;
	private String name ;
	private String email ;
	private int mobile;
	
	@Embedded
	@ManyToMany(mappedBy = "Person", cascade = CascadeType.ALL)
	private List<Gym> gyms =new ArrayList<Gym>();

	public int getPerson_id() {
		return person_id;
	}

	public void setPerson_id(int person_id) {
		this.person_id = person_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	public List<Gym> getGyms() {
		return gyms;
	}

	public void setGyms(List<Gym> gyms) {
		this.gyms = gyms;
	}


	
	
}
