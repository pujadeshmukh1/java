package quesion2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {
	

	public static void main(String[] args) {
	

		List<Student> students= new ArrayList<>();
		
		
		students.add(new Student(10, "N1",50));
		students.add(new Student(12, "N2",40));
		students.add(new Student(13, "N3",80));
		students.add(new Student(14, "N4",30));
		students.add(new Student(15, "N5",60));
		students.add(new Student(16, "N6",95));
		
Optional<Student> opt = students.stream().max( (s1,s2) -> s1.getMarks() > s2.getMarks() ? +1 :-1);
		
		
		Student maxStudent= opt.get();
		
		System.out.println(maxStudent);
			
		
	}
}

