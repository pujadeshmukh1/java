package Que2;

public class Main {

	
	public static void main(String[] args) {
		ThradProduct mt= new ThradProduct();
		
		mt.start();
		
		synchronized (mt) {
			
			try {
				System.out.println("Main thread on wait...");
				mt.wait();
				System.out.println("Main thread notified...");
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
		
		System.out.println("Product is  : "+mt.product);
	}

}
