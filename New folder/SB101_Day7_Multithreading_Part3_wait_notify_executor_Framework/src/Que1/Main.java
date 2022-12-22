package Que1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread1 t1 = new Thread1();
		
		
		t1.start();
	
		
		synchronized (t1) {
			
			try {
				t1.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("the product  is "+ t1.prod);
		}
	}

}
