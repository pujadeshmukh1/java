package que2;

import java.util.function.Function;

public class MyFunction implements Function<Student , String>{

	@Override
	public String apply(Student stu) {
//		if(stu.getMarks()>500) {
//			return "Pass";
//		}
//		else
//			return "false";


		return stu.getMarks()> 500 ? "Pass" : "Fail";
	
	}
}
