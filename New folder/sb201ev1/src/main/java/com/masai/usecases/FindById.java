package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.stateBankDao;
import com.masai.dao.stateBankDaoImpl;

public class FindById {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println(" Enter id");
		int id=sc.nextInt();
		

		stateBankDao dao=new stateBankDaoImpl(); 
		
		System.out.println(dao.findAccountById(id));
		
		
	}
	
	

}
