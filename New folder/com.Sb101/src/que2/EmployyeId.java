package que2;

import java.util.*;

public class EmployyeId implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.getEmpId()<o2.getEmpId())
			return -1;
		if(o1.getEmpId()>o2.getEmpId())
			return +1;
		else
			return 0;
	}
	
}

