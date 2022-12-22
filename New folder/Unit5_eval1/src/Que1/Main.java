package Que1;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
	
	public static void main(String[] args) {
		
		//Predicate using Functional interfaces
		Predicate<Student> st1 =new MyPred();
		System.out.println(st1.test(new Student(13,"h1",700)));
		
		//Predicate using Le
		Predicate<Student> st2 =s->s.getMarks()>500;
		System.out.println(st2.test(new Student(13,"h1",700)));
		
		
		
		//Consumer using Functional interfaces
		Consumer<Student> Stu= new MyConsumer();
		Stu.accept(new Student(11,"h2",606));
		
		//Consumer using LE
		Consumer<Student> conStu2 =s->{
			System.out.println(" My Roll is : " + s.getRoll());
			System.out.println("My Name is : " + s.getName());
			System.out.println("My Marks is : " + s.getMarks());
			
			
		};
		conStu2.accept(new Student(12,"h2",506));
		
		
		
		//Consumer using LE
		Supplier<Student> supStu = ()->new Student (11,"h1",777);
		System.out.println(supStu.get());
		
		
		

		//Function using LE
		
		Function<String , Integer> fun = Integer::parseInt;
		System.out.println(fun.apply("300"));
	}

}
