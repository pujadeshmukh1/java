package que2;

import java.util.Objects;
import java.util.*;

public class Employee {
	public static final int EmployeId = 0;
	private int empId;
	private String empName;
	private String address;
	private int salary;
	
	public Employee(int empId, String empName, String address, int salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.address = address;
		this.salary = salary;
	}
	public Employee() {
		
		// TODO Auto-generated constructor stub
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", address=" + address + ", salary=" + salary
				+ "]";
	}
//	@Override
//	public int compareTo(Object obj) {
//		// TODO Auto-generated method stub
//		Employee E1 = this;
//		Employee E2 = (Employee)obj;
//		
//		if(E1.getAddress() > E2.getAddress())
//			return +1;
//		else if(E1.getAddress() < E2.getAddress())
//			return -1;
//		else
//			return 0;
//	}
//		
	
	
}
