package Lamda_expression;

public class Demo {

	public static void main(String[] args) {
		//using External class
		//using External class
				Intr i1= new IntrImpl();		
				i1.sayHello("Ram");
				
				//using Annonymous Inner class
				Intr i2 = new Intr() {

					@Override
					public void sayHello(String name) {
						System.out.println("Welcome Using Annonymous inner class "+name);
						
					}
					
				};

				i2.sayHello("Ram");
				
				//using Lambda expression
				Intr i3= n -> System.out.println("Welcome Using LE :"+n);
				
				i3.sayHello("Ram");
					
		
	}
	
}
