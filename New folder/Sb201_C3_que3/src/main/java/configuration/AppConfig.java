package configuration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.cfg.Environment;
import org.springframework.context.annotation.Bean;

import com.masai.model.Gym;
import com.masai.model.Person;

public class AppConfig {
	@Bean
	 public List<Person> getList(){
		
		   List<Person> list = new ArrayList<>();
	        list.add(new Person(1,"disha1","Di1@gmail.com",22,8789544));
	        list.add(new Person(2,"disha2","Di2@gmail.com",23,9789544));
	        list.add(new Person(3,"disha3","Di3@gmail.com",24,7789544));
	        list.add(new Person(4,"disha4","Di4@gmail.com",25,7389544));
	        list.add(new Person(5,"disha5","Di5@gmail.com",26,789544));
		
		return list;
	}
	
	@Bean
	 public Map <Person,Gym> getMap(){
       Map<Person,Gym> map = new HashMap<>();
       
       map.put(new Person(1,"disha1","Di1@gmail.com",22,8789544),new Gym(1,"gym1",1000));
       map.put(new Person(2,"disha2","Di2@gmail.com",23,9789544), new Gym(2,"gym2",1100));
       map.put(new Person(3,"disha3","Di3@gmail.com",23,9789544), new Gym(3,"gym3",1200));
       map.put(new Person(4,"disha4","Di4@gmail.com",23,9789544), new Gym(4,"gym4",1300));
       map.put(new Person(5,"disha5","Di5@gmail.com",23,9789544), new Gym(5,"gym5",1400));
       
	return map;
	
	}
	
	@Bean
	public String appName() {
		
		String name="";
		name=Environment.getProperties("");
		return null;
		
	}
}
