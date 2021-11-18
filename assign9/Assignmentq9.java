package assign9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Assignmentq9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context =new ClassPathXmlApplicationContext("Spring9.xml");
		((AbstractApplicationContext) context).registerShutdownHook();
		Chocolate obj=(Chocolate) context.getBean("chocolate");
		obj.chocoName();
			
	}

}
