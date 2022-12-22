package com.masai.usecases;

import com.masai.dao.stateBankDao;
import com.masai.dao.stateBankDaoImpl;
import com.masai.model.Account;

public class Main {
	public static void main(String[] args) {
		stateBankDao adao = new stateBankDaoImpl();
		Account ac = adao.findAccountById(10);
		System.out.println(ac);
		
		Account a = new Account(10, "abc@gmail.com", "pune", 33000.00, 2022-11-11);
		System.out.println(adao.saveAccount(a));
		String del = adao.deleteAccountById(20);
		System.out.println(del);
		String withdraw = adao.withdrawFromAccount(2000, 10);
		System.out.println(withdraw);
		String deposit = adao.depositInAccount(3000, 10);
		System.out.println(deposit);

	}

}
