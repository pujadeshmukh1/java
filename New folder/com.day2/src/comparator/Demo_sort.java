package comparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Demo_sort {

	public static void main(String[] args) {
		List<Student> stu=new ArrayList<>();
		
		stu.add(new Student(1, "p1", 458));
		stu.add(new Student(1, "p1", 458));
		stu.add(new Student(1, "p1", 458));
		stu.add(new Student(1, "p1", 458));
		stu.add(new Student(1, "p1", 458));
		
		Collections.sort(stu, new StudentMarksComp());
		//Collections.sort(stu, new StudentRollComp());

		System.out.println(stu);
		
		
//		or
//		StudentMarksComp mcomp=new StudentMarksComp();
//		Collections.sort(stu, mcomp);
//		System.out.println(stu);
		
		
		
		
		
		
	}

	
}
