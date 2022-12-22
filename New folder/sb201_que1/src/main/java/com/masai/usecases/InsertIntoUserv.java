package com.masai.usecases;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import com.masai.EMUtil.EMUtil;
import com.masai.entity.PhoneNumber;
import com.masai.entity.User;

public class InsertIntoUserv {
	public static void main(String[] args) {
		
		
		
		
		

		EntityManager em = EMUtil.getEM();
		em.getTransaction().begin();
		  User phoneUser = new User();
		phoneUser.setUsername("Prateek");
		phoneUser.setUseremail("Prateek@mail.com");
		phoneUser.setUserid(1);
		
		
		PhoneNumber phone1=new PhoneNumber();
		phone1.setPhoneNumber(235677);
		phone1.setPhonetype("Home");
		phone1.setUserid(1);
		
		PhoneNumber phone2=new PhoneNumber();
		phone2.setPhoneNumber(4678);
		phone2.setPhonetype("LandLine");
		phone2.setUserid(1);
		
		PhoneNumber phone3=new PhoneNumber();
		phone3.setPhoneNumber(4678);
		phone3.setPhonetype("office");
		phone3.setUserid(1);
		
		List<PhoneNumber> list = new ArrayList<>();
		list.add(phone1);
		list.add(phone2);
		list.add(phone3);
		
		phoneUser.setPhoneTables(list);
		em.persist(phoneUser);
		em.getTransaction().commit();
		em.getTransaction().begin();
		// User can access Phone Number
		
		User u = em.find(User.class, 1);
		System.out.println("userId is "+u.getUserid());
		System.out.println("UserName is "+u.getUsername());
		List<PhoneNumber> list1 = u.getPhoneTables();
		for(PhoneNumber p:list1){
		System.out.println("Phone Number is "+p.getPhoneNumber());
		System.out.println("phone Type is "+p.getPhonetype());
		}

	}
	
	
		}

