package day1;

import java.util.Objects;

public class Student {
	private int roll;
	private String name;
	private String address;
	private int marks;
	public Student(int roll, String name, String address, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
		this.marks = marks;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", address=" + address + ", marks=" + marks + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(address, marks, name, roll);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(address, other.address) && marks == other.marks && Objects.equals(name, other.name)
				&& roll == other.roll;
	}
	
	
	
	
	
	
   // @Override
//    public boolean equals(Object o) {
//        // Check if the object given is a student.
//        if (o instanceof Student) {
//            // Create a temporary student object so we avoid casting later.
//            Student stu = (Student) o;
//
//            // If the names are the same then it is the same student. If you want you can do the
//            // exact same thing with the ID
//            if (this.name.equals(stu.getName())) {
//                return true;
//            }
//        }
//        // If its not a student, print something to be aware of what happened
//        else {
//            System.out.println("Object provided is NOT  a type of Student.");
//        }
//
//        return false;
//    }

    // Required for using a set as part of the solution
   // @Override
//    public int hashCode() {
//        return name.hashCode();
//    }

    // Optional, but allows you to view the output properly

}
