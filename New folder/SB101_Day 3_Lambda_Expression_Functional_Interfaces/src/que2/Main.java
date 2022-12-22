package que2;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

 public static void main(String[] args) {
	 //Predicate using function interface or External class Predicate
     //Predicate<Integer> p = new MyPredicate();
     //System.out.println(p.test(12));
	//System.out.println(p.test(-12));
	 
	 //
		//Predicate using LE
	 
	 
	Predicate<Integer> p = pre -> pre>=0;
	  System.out.println(p.test(12)); 
	  System.out.println(p.test(-12)); 
	  
	  
	//Supplier using function interface or External class 
	  Supplier<String> supp = new MySupplier();
	  String str = supp.get();
	  System.out.println(str);
	  
	  //Supplier using LE 
	  Supplier<String> sup = ()->"this msg from LE";
	  System.out.println(sup.get());
	  
	  
	//Supplier using function interface or External class 
	  Consumer<String> con = new MyConsumer();
	  con.accept("pd");
	  
	  
	//Consumer using LE 
	  
	  Consumer<String> str1 = s -> System.out.println("welcome LE :" + s);
	  str1.accept("amit");
	  
	//Function  using function interface or External class 
	  
	  Function<Student, String> fun = new MyFunction();
	  String result = fun.apply(new Student(10,"Ram",789));
	  System.out.println(result);
	  
	//Function using LE 
	  Function<Student, String> funt = s -> s.getMarks() > 500 ? "Pass" : "Fail";
	  System.out.println(funt.apply(new Student(10,"ram",456)));
	  
	  
}
	
}
