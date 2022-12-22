package dAY1;


public class A {
	
	{
		System.out.println("inside non-static block");
	}
	
	static{
		System.out.println("inside static block");
	}
	
	
	public A() {
		System.out.println("inside constructor of A");
	}
	
	public void funA() {
		System.out.println("inside funA of A");
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("inside main method");
		
		A a1= new A();
		a1.funA();
		
	}

}
