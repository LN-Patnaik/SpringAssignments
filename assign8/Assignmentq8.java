package assign8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Assignmentq8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context=new ClassPathXmlApplicationContext("spring8.xml");
		((AbstractApplicationContext) context).registerShutdownHook();
		Color obj=(Color) context.getBean("color");
		obj.display();
	}

}
