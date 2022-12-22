package Que1;

import java.util.function.Consumer;

public class MyConsumer implements Consumer<Student>{

	@Override
	public void accept(Student s) {
		
		System.out.println("Roll is : " + s.getRoll());
		System.out.println("Name is : " + s.getName());
		System.out.println("Marks is : " + s.getMarks());
	}

}
