package com.masai.usecases;



import com.masai.dao.stateBankDao;
import com.masai.dao.stateBankDaoImpl;
import com.masai.model.Account;

public class createAccount {
	stateBankDao dao=new stateBankDaoImpl();
	
	Account acc1 = new Account(1, abcd6@gmail.com, pune, 446.80, 2022-11-11);
	
	
	String f = dao.saveAccount(acc1);
	
	if(f)
		System.out.println("Account created");
	else
		System.out.println("Not created....");


}

}
