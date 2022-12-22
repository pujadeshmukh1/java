package comparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Domo_Min_And_Max {
	public static void main(String[] args) {
		List<Student> stu=new ArrayList<>();
		
		stu.add(new Student(1, "p1", 45));
		stu.add(new Student(1, "p1", 458));
		stu.add(new Student(2, "p2", 458));
		
		
		Student stu_min=Collections.min(stu, new StudentMarksComp());
		//Student stu_max=Collections.max(stu, new StudentMarksComp());
		
		System.out.println(stu_min);
}
}