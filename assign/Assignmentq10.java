package assign;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Assignmentq10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		Fruit obj=(Fruit) context.getBean("fruit");
		obj.fruitName();
		
	}

}
