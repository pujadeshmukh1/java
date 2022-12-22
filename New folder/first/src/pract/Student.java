 package pract;

public class Student {
	
	int roll;
	String name;
	int marks;
	
	
	Student(int roll,String name,int marks) {
	this.roll=roll;
	this.name=name;
	this.marks=marks;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll=roll;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks=marks;
	}
	public static void main(String[] args) {
		Student stud = new Student(25,"me",468);
		System.out.println("roll - "+stud.getRoll());
		System.out.println("name - "+stud.getName());
		System.out.println("marks - "+stud.getMarks());
	}

}
