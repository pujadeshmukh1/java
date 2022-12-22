package LiveClass;

import java.util.Comparator;

public class StudentRollComp implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		
		
		return s1.getRoll() > s2.getRoll() ? +1 : -1;
	}

}
