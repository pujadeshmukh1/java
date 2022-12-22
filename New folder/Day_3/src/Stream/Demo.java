package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo {
public static void main(String[] args) {
	

	List <String> list = Arrays.asList("one","two","three");
	
	Stream<String> str1 = list.stream();
	str1.forEach(s -> System.out.println(s.toUpperCase()));//ternminal method.
	
	
	//str1.forEach(s -> System.out.println(s)); //exception
}
}