package que3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class Main {
	

	public static void main(String[] args) {
		
		HashMap<String , Student> stu = new HashMap<>();
		stu.put("India", new Student(10,"n1",870,"a12@gmail"));
		stu.put("USA", new Student(11,"n2",890,"ab12@gmail"));
		stu.put("Brazil", new Student(12,"n3",860,"abc12@gmail"));
		stu.put("ToKIYO", new Student(13,"n4",840,"abcd12@gmail"));
		stu.put("Chine", new Student(14,"n5",830,"abce12@gmail"));
		
		
		
		
		
		Collection<Student> s = stu.values();
		List<Student> st = new ArrayList(s);
		
		
		Collections.sort(st, (s1,s2) -> s1.getName().compareTo(s2.getName()));
		for(Student stud:st) {
			System.out.println("Roll :" + stud.getRoll());
			System.out.println("Name :" + stud.getName());
			System.out.println("Marks :" + stud.getMarks());
			System.out.println("Email" + stud.getMarks());
			System.out.println("++++++++++++++++++++++++++++++++++++");
		}
		
	}

}
