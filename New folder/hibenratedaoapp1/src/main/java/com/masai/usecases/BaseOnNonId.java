package com.masai.usecases;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.masai.model.Account;
import com.masai.utility.EMUtil;

public class BaseOnNonId {
public static void main(String[] args) {
	
	//search on non-pk:-
	EntityManager em= EMUtil.provideEntityManager();
	
	
	//String jpql= "select a from Account a where a.name='Ram' ";
	String jpql= "from Account where name='Ramesh'";
	Query q= em.createQuery(jpql);
	
	List<Account> list= q.getResultList();
	
	for(Account acc:list){
		System.out.println(acc);
	}	
	
//
//if we conform that only one row will come then :-
//-------------------------------------------------------
//
//	EntityManager em= EMUtil.provideEntityManager();
//		
//		
//		//String jpql= "select a from Account a where a.name='Ram' ";
//		String jpql= "from Account where name='Ram'";
//		Query q= em.createQuery(jpql);
//		
//		//Object obj= q.getSingleResult();
//		//Account acc= (Account)obj;
//		
//		Account acc= (Account)q.getSingleResult();
//		
//		System.out.println(acc);
//	
//	
	
}

}

