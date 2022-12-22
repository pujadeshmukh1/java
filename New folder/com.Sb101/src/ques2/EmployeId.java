package ques2;

import java.util.Comparator;

import que2.Employee;

public  class EmployeId implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.getEmpId()> o2.getEmpId()) {
			return +1;
		}
		else if(o1.getEmpId()< o2.getEmpId()) {
			return -1;
		}
		return 0;
		
	}

	
	
}