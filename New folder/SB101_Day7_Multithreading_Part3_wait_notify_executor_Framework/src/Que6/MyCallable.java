package Que6;
import java.util.concurrent.Callable;

public class MyCallable implements Callable<String>{
	

	
		int num;
		



		public MyCallable(int num) {
			super();
			this.num = num;
		}




		@Override
		public String call() throws Exception {
			
			if(num%2==0) {
				return "Number is even " + num;
			}
			return "Number is odd " + num;
		}

	}
