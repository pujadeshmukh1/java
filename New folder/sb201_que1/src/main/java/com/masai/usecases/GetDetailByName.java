package com.masai.usecases;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.masai.EMUtil.EMUtil;
import com.masai.entity.User;

public class GetDetailByName {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		EntityManager em=	EMUtil.getEM();
		
		
		System.out.println("enter name");
		String name=sc.next();
		
	Query qc=	em.createQuery("from User where userName=?1");
	qc.setParameter(1, name);
	
	User u= (User) qc.getSingleResult();
	
	System.out.println(u);
		
		
	}

}