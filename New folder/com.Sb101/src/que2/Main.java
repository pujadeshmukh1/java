package que2;

import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		
		int number = sc.nextInt();
		if(number == 1) {
			EmployyeId id = new EmployyeId();
			TreeSet<Employee> Em = new TreeSet<>(id);
			
			Em.add(new Employee(102,"Manoj","Uttar pradesh",2000));
			Em.add(new Employee(104,"Kanoj","Himachal pradesh",3000));
			Em.add(new Employee(106,"Ramesh","Madhya pradesh",4000));
			Em.add(new Employee(101,"Suresh","Andhra pradesh",5000));
			Em.add(new Employee(104,"Ashish","Maharashtra",6000));
			Em.add(new Employee(103,"Paresh","Panjab",8000));
			
			System.out.println(Em);
		}
		else if(number == 2) {
			EmployeeAdress ea = new EmployeeAdress();
			TreeSet<Employee> Em = new TreeSet<>(ea);
			
			Em.add(new Employee(100,"Manoj","Uttar pradesh",2000));
			Em.add(new Employee(101,"Kanoj","Himachal pradesh",3000));
			Em.add(new Employee(102,"Ramesh","Madhya pradesh",4000));
			Em.add(new Employee(103,"Suresh","Andhra pradesh",5000));
			Em.add(new Employee(104,"Ashish","Maharashtra",6000));
			Em.add(new Employee(105,"Paresh","Panjab",8000));
			
			System.out.println(Em);
		}
		else if(number == 3) {
			EmployeeSalary es = new EmployeeSalary();
			TreeSet<Employee> Em = new TreeSet<>(es);
			
			Em.add(new Employee(100,"Manoj","Uttar pradesh",2000));
			Em.add(new Employee(101,"Kanoj","Himachal pradesh",3000));
			Em.add(new Employee(102,"Ramesh","Madhya pradesh",4000));
			Em.add(new Employee(103,"Suresh","Andhra pradesh",4000));
			Em.add(new Employee(104,"Ashish","Maharashtra",6000));
			Em.add(new Employee(105,"Paresh","Panjab",2000));
			
			System.out.println(Em);
		}
		
		//System.out.println("number is: "+number);
			
	}

}

