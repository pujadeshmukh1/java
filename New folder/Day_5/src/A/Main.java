package A;

public class Main {
 public static void main(String[] args) {
	A a1 = new A();
	B b1 = new B();
	
	Thread tr1 = new Thread(a1);
	Thread tr2 = new Thread(b1);
	
	tr1.start();
	tr2.start();
	
	
	 
	
}
}
