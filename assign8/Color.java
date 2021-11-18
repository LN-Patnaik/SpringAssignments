package assign8;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Color implements InitializingBean,DisposableBean{
private String Color;

public Color(String color) {
	super();
	Color = color;
}

	@PostConstruct
	public void Postinit()
	{
	
	System.out.println("Post constructor initialized");
	System.out.println("----------------------------------------");
	}
public void display()
{
	System.out.println("color is:"+Color);
}

public void afterPropertiesSet() throws Exception {
	// TODO Auto-generated method stub
	System.out.println("InitializingBean method");
	
}

public void destroy() throws Exception {
	// TODO Auto-generated method stub
	System.out.println("DisposableBean method");
}
@PreDestroy
public void destroyPre()
{
	System.out.println("----------------------------------------");
	System.out.println("PreDestroy initialized");
}
}
