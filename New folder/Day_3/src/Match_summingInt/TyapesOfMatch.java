package Match_summingInt;

import java.util.ArrayList;
import java.util.List;

public class TyapesOfMatch {
	public static void main(String[] args) {
		
	
	List<Student> students= new ArrayList<>();
	
	
	students.add(new Student(10, "N1",500));
	students.add(new Student(12, "N2",400));
	students.add(new Student(13, "N3",420));
	students.add(new Student(14, "N4",440));
	students.add(new Student(15, "N5",600));
	students.add(new Student(16, "N6",380));
	
 boolean b= students.stream().anyMatch(s -> s.getMarks() < 500);	
 boolean b1= students.stream().allMatch(s -> s.getMarks() < 500);	
 boolean b2= students.stream().noneMatch(s -> s.getMarks() < 500);	
	
	
 System.out.println(b);
 System.out.println(b1);
 System.out.println(b2);
}
}