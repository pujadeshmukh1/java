package Match_summingInt;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SummingInt {
	
	public static void main(String[] args) {
		
	
List<Student> students= new ArrayList<>();
	
	
	students.add(new Student(10, "N1",500));
	students.add(new Student(12, "N2",400));
	students.add(new Student(13, "N3",420));
	students.add(new Student(14, "N4",440));
	students.add(new Student(15, "N5",600));
	students.add(new Student(16, "N6",380));

	int allSum= students.stream().collect(Collectors.summingInt(s->s.getMarks()));
	System.out.println(allSum);
	}
}