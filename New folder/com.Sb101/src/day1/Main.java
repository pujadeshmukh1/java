package day1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Create example students and fill an ArrayList.
       
        List<Student> students = new ArrayList<Student>();
        
        students.add(new Student(10, "akash","andhra", 500));
		students.add(new Student(12, "bhupesh","maharashtra", 520));
		students.add(new Student(10, "akash","andhra", 500));
		students.add(new Student(14, "dhiraj","punjab", 530));
		students.add(new Student(13, "chetan","delhi", 550));
//	
		

        // List before any changes
        System.out.println(students);
        System.out.println(students.size());
        

        // Set data structure will only allow unique elements inside by definition, so
        // lets just add our arraylist into the set.
        Set<Student> s = new HashSet<Student>(students);
        for(Student i:students) {
        	s.add(i);
        	
        }
        System.out.println(s);
        System.out.println(s.size());
        
        //or
        //Set<Student> s = new HashSet<Student>(students);
        // Empty your student list
//        students.clear();
//        // Refill the student list only with the unique elements from the set
//        students.addAll(s);
//
//        // Test our new list of students without duplicates
//        System.out.println(students);
       // System.out.println(students.size());
    }
}
