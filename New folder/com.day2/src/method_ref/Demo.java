package method_ref;

public class Demo {
	public static void main(String[] args) {

		Intr i1 = number ->	 Integer.parseInt(number); //using LE
			
		Intr i2= Integer::parseInt;// refering to the parseInt method of Integer class	
			
		
		
		
		System.out.println(i1.getTheNumber("100")+50);
		System.out.println(i2.getTheNumber("100")+50);
		
	}
}
