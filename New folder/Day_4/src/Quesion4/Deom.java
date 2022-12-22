package Quesion4;

import java.util.HashSet;
import java.util.Set;

import quesion2.Student;

public class Deom {

	public static void main(String[] args) {
		Set<Student> stu = new HashSet<Student> (); 
		

		stu.add(new Student(10, "N1",540));
		stu.add(new Student(12, "N2",440));
		stu.add(new Student(13, "N3",250));
		stu.add(new Student(14, "N4",340));
		stu.add(new Student(15, "N5",640));
		stu.add(new Student(16, "N6",945));
		

		stu.stream().filter(s->s.getMarks() < 500).forEach(s -> System.out.println(s));
	}

}
