package day3;



	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.List;
	import java.util.stream.Collectors;
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
			
			// from the above list give the 50 grace marks to all the students
			//and get the another list of updated students.
			
			
			//Stream<Student> str1= students.stream();
			
//			Stream<Student> str2= str1.map(s -> {
//				
//							Student s2 = new Student(s.getRoll(), s.getName(), s.getMarks()+50);
//							return s2;
//				
//			});
			
			
			//Stream<Student> str2= str1.map(s -> new Student(s.getRoll(), s.getName(), s.getMarks()+50));
			
			
			//List<Student> modifiedStudents= str2.collect(Collectors.toList());
			
//			
//			List<Student> modifiedStudents= students
//												.stream()
//												.map(s -> new Student(s.getRoll(), s.getName(), s.getMarks()+50))
//												.collect(Collectors.toList());
//			
			
			
			
		List<Student> modifiedStudents= students
												.stream()
												.filter(s -> s.getMarks() < 500)
												.map(s -> new Student(s.getRoll(),s.getName(),s.getMarks()+50))
												.collect(Collectors.toList());	
												
			
		modifiedStudents.forEach(s -> System.out.println(s));	
					
		}
	}
