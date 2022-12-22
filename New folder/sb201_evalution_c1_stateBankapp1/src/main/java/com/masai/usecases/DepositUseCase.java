package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.stateBankDao;
import com.masai.dao.stateBankDaoImpl;
import com.masai.model.Account;

public class DepositUseCase {

public static void main(String[] args) {
		
	stateBankDao dao=new stateBankDaoImpl();
		
	Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Account number");
		int accno=sc.nextInt();
		
		Account acc= dao.findAccountById(accno);
		
		if(acc == null)
			System.out.println("Account does not exist..");
		else{
			
			
			System.out.println("Enter the Amount to Deposit");
			int amt=sc.nextInt();
			
			acc.setBalance(acc.getBalance()+amt);
			
			String f =dao.saveAccount(acc);
			
			if(f != null)
				System.out.println("Deposited Sucessfully...");
			else
				System.out.println("Technical Error .....");
					
		}		
	}
}
