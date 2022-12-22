package serviceLayer;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.masai.model.Gym;
import com.masai.model.Person;

@Service
public class PersonService {
	@Autowired
	private Map<Person, Gym>theMap;
	
	@Autowired
	private List<Person> theList;
	
	@Value("${appname}")
	private String appName;
	
	public void printMap(){
		System.out.println("inside print map.......!\n");
		theMap.entrySet().stream().forEach(s->{
			System.out.println("==================\n");
			System.out.println("Person : "+s.getKey());
			System.out.println("Gym : "+s.getValue());
		});
	
	}
	public void printList(){
		System.out.println("inside print list.......!\n");
	theList.sort((a,b)->a.getAge()>b.getAge()?1:-1);
	theList.forEach(s->{
		System.out.println("======================\n");
		System.out.println(s);
	});
	}
	public void printAppName(){
		System.out.println("================================\n");
	System.out.println("App name is : "+appName);
	}
	
}
