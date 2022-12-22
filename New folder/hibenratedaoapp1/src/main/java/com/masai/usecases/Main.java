package com.masai.usecases;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.masai.model.Account;
import com.masai.utility.EMUtil;

public class Main {
public static void main(String[] args) {
		
		EntityManager em= EMUtil.provideEntityManager();
		
		
		//String jpql= "select a from Account a";
		String jpql= "from Account";
		Query q= em.createQuery(jpql);
		
		@SuppressWarnings("unchecked")
		List<Account> list= q.getResultList();
		
		for(Account acc:list){
			System.out.println(acc);
		}		
	}
}
