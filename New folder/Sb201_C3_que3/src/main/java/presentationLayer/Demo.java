package presentationLayer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import configuration.AppConfig;
import serviceLayer.PersonService;

public class Demo {
	public static void main(String[] args)
	{
		ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		
		PersonService ss=ctx.getBean("PersonService",PersonService.class);
		ss.printAppName();
		ss.printMap();
		ss.printList();
		
	}
}
