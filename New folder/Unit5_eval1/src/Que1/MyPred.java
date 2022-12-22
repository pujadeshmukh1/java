package Que1;

import java.util.function.Predicate;

public class MyPred implements Predicate<Student>{

	@Override
	public boolean test(Student stu) {
		return stu.getMarks() > 500;
	}

}
