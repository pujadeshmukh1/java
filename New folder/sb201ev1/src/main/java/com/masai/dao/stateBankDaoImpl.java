package com.masai.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.masai.model.Account;
import com.masai.utility.EMUtility;

public class stateBankDaoImpl implements stateBankDao{
	
	
	public Account findAccountById(int id) {
		// TODO Auto-generated method stub
		EntityManager em=EMUtility.provideEntityManager();
		
		Account ac=em.find(Account.class, id);
		
		if(ac!=null) {
			return ac;
		}
		
		
		em.close();
		return null;
	}

	public String saveAccount(Account account) {
		// TODO Auto-generated method stub
		
		String msg="Not inserted...";
		EntityManager em=EMUtility.provideEntityManager();
		em.getTransaction().begin();
		
	      em.persist(account);
	      
	      msg="inserted..";
		
		em.getTransaction().commit();
		
		
		em.close();
		
		return msg;
	}

	public String deleteAccountById(int id) {
		// TODO Auto-generated method stub
		
		
		String msg="Not deleted...";
		EntityManager em=EMUtility.provideEntityManager();
		
	Account ac=	em.find(Account.class, id);
		
		em.getTransaction().begin();
		
	       if(ac!=null) {
	    	   
	    	   em.remove(ac);
	       }
	      
	      msg="deleted..";
		
		em.getTransaction().commit();
		
		em.close();
		
		
		return msg;
		
		 
	}

	public String withdrawFromAccount(double amount, int id) {
		// TODO Auto-generated method stub
		
		String msg="Not withdrwal...";
		EntityManager em=EMUtility.provideEntityManager();
		
	Account ac=	em.find(Account.class, id);
		
		em.getTransaction().begin();
		
	       if(ac!=null&&ac.getBalance()>amount) {
	    	   
	    	    ac.setBalance(ac.getBalance()-amount);
	    	    em.merge(ac);
	       }
	      
	      msg="withdrawl succesfull..";
		
		em.getTransaction().commit();
		
		em.close();
		
		
		return msg;
		
		
		
		 
	}

	public String depositInAccount(double amount, int id) {
		// TODO Auto-generated method stub
		String msg="Not deposited...";
		EntityManager em=EMUtility.provideEntityManager();
		
	Account ac=	em.find(Account.class, id);
		
		em.getTransaction().begin();
		
	       if(ac!=null) {
	    	   
	    	    ac.setBalance(ac.getBalance()+amount);
	    	    em.merge(ac);
	       }
	      
	      msg="deposited..";
		
		em.getTransaction().commit();
		
		em.close();
		
		
		return msg;
	}

}
