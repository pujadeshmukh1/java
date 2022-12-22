package com.masai.usecase;

import java.util.Scanner;

import com.masai.Dao.Dao;
import com.masai.Dao.DaoImpl;
import com.masai.exception.StudentException;

public class GetStudent {
public static void main(String[] args) throws StudentException {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter roll_no");
		int roll=sc.nextInt();
		
		Dao dao=new DaoImpl();
		
		
		dao.getStudent(roll);
		
}
}
