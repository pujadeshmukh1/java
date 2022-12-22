package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.stateBankDao;
import com.masai.dao.stateBankDaoImpl;
import com.masai.model.Account;

public class WithdrawUseCase {
public static void main(String[] args) throws IllegalAccessException {
		
	stateBankDao dao=new stateBankDaoImpl();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Account number");
		int ano=sc.nextInt();
		
		Account acc= dao.findAccountById(ano);
		
		if(acc == null)
			System.out.println("Account does not exist..");
		else{
		
			System.out.println("Enter the withdrawing amount");
			int amt=sc.nextInt();
			
			if(amt <= acc.getBalance()){
				
				acc.setBalance(acc.getBalance()-amt);
				String f=dao.saveAccount(acc);
				if(f != null)
					System.out.println("please collect the cash...");
				else
					System.out.println("Technical Error...");
				
				
			}else
				System.out.println("Insufficient Amount..");	
		}		
	}

}
