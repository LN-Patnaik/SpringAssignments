package assign9;

public class Chocolate {
	

	private String name;
	
	public void init()
	{
		
		System.out.println("init method initialized");
		System.out.println("----------------------------------------");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void chocoName()
	{
		System.out.println("Chocolate name is:"+getName());
	}
	public void destroy()
	{
		System.out.println("----------------------------------------");
		System.out.println("Destroy method initialized");
	}
}
