package comparator;

import java.util.Comparator;

public class StudentRollComp implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		if(o1.getRoll() > o2.getRoll()) {
			return +1;
		}
		else if(o1.getRoll() > o2.getRoll()) {
			return +1;
		}
		return 0;
	}

}
