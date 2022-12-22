package Que3;

public class ThreadB implements Runnable{
	
	@Override
	public void run() {
		for(int i=1; i<20; i++) {
			if(i%2==1) {
			
				System.out.println(i +" is running ThreadB");
			}
		}
	}
	
}
