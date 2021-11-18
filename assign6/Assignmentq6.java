package assign6;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
@Configuration
@ComponentScan
@PropertySource("classpath:app.properties")
public class Assignmentq6 {

	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Assignmentq6.class);
		Service service=context.getBean(Service.class);
		System.out.println(service.toString());
	}
}
