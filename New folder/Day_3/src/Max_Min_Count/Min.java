package Max_Min_Count;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Min {

	public static void main(String[] args) {
		
		List <Student> students = new ArrayList();
		
		students.add(new Student(10, "N1",500));
		students.add(new Student(12, "N2",400));
		students.add(new Student(13, "N3",420));
		students.add(new Student(14, "N4",440));
		students.add(new Student(15, "N5",600));
		students.add(new Student(16, "N6",380));
		
		
		Optional<Student> opt=students.stream().min((s1,s2)->s1.getMarks() > s2.getMarks() ? +1 :-1);
		
		Student minStu=opt.get();
		System.out.println(minStu);
		
		
	}
	
}
