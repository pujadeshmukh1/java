package Filter_Method;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Demo {
public static void main(String[] args) {

	List<Student> students= new ArrayList<>();
	
	
	students.add(new Student(10, "N1",500));
	students.add(new Student(12, "N2",400));
	students.add(new Student(13, "N3",420));
	students.add(new Student(14, "N4",440));
	students.add(new Student(15, "N5",600));
	students.add(new Student(16, "N6",380));
	
	
	//from the above list get another list of students whose marks is less than 500.
	
	
	Stream<Student> str1= students.stream();
	Stream<Student> str2 = str1.filter(s->s.getMarks() < 500);
	str2.forEach(s->System.out.println(s));
	
//	output:-
//	Student [roll=12, name=N2, marks=400]
//			Student [roll=13, name=N3, marks=420]
//			Student [roll=14, name=N4, marks=440]
//			Student [roll=16, name=N6, marks=380]
	System.out.println("======================================");
	
	//InSigle line
	
	students.stream().filter(s->s.getMarks() <500).forEach(s->System.out.println(s));
	
	
//	output:-
//	Student [roll=12, name=N2, marks=400]
//			Student [roll=13, name=N3, marks=420]
//			Student [roll=14, name=N4, marks=440]
//			Student [roll=16, name=N6, marks=380]
}
}
