package Que1;

public class Thread1 extends Thread{
	
	  int prod = 1;
	  
		@Override
		public void run() {
			synchronized (this) {
			
				for(int i =1;i<10;i++) {
					prod*=i;
				}
				this.notify();
			}
		}

	}

