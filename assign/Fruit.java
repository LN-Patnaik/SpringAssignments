package assign;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Fruit implements ApplicationContextAware{
	
	void fruitName()
	{
		System.out.println("Fruit name is apple");
	}

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println(applicationContext);
	}

	
}
