package que2;

import java.util.function.Supplier;

public class MySupplier implements Supplier<String>{

	@Override
	public String get() {
		return "This msg from the external class";
	}

}


