package Que2;

public class ThradProduct extends Thread{

	int product=1;
	
	public void run() {
		synchronized (this) {
		for(int i=1; i<=10;i++) {
			product*=i;
		}
			this.notify();
		}
	}

	

	
	
}
