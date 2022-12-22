package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.AccountDao;
import com.masai.dao.AccountDaoImpl;
import com.masai.model.Account;

public class createAccount {
public static void main(String[] args) throws IllegalAccessException {
		
		AccountDao dao = new AccountDaoImpl();
		
		Account acc1 = new Account();
		
		acc1.setName("umesh");
		acc1.setBalance(700);
		
		boolean f = dao.createAccount(acc1);
		
		if(f)
			System.out.println("Account created");
		else
			System.out.println("Not created....");
	

	}
	
}
