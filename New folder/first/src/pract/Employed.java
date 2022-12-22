package pract;

public class Employed {

	int salary;
	String name;
	
	
	public Employed (int salary,String name) {
		this.salary=salary;
		this.name=name;
	}
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary=salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public static void main(String[] args) {
		Employed emp = new Employed(40000,"Akshay");
		System.out.println("Salary -"+emp.getSalary());
		System.out.println("Name -"+emp.getName());
	}
}
