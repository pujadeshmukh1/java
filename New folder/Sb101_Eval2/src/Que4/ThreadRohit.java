package Que4;

public class ThreadRohit extends Thread{

	long pro=1;
	public void run() {
	 for(int i=1; i<=10; i++) {
		 pro*=i;
	 }
	 System.out.println("inside ThreadRohit "+currentThread().getName()+"Product : "+pro);
	}
}
