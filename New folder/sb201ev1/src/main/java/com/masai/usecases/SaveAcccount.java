package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.stateBankDao;
import com.masai.dao.stateBankDaoImpl;
import com.masai.model.Account;

public class SaveAcccount {
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter email");
		String email=sc.next();
		
   System.out.println("enter address");
		String address=sc.next();
		
		  System.out.println("enter balance");
			double balance=sc.nextInt();
		
			stateBankDao dao=new stateBankDaoImpl(); 
			
			System.out.println(dao.saveAccount(new Account(email, address, balance)));
	}
}
