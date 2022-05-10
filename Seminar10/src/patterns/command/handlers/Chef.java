package patterns.command.handlers;

public class Chef
{
	private String name;

	public Chef(String name)
	{
		super();
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	
	public void cookPizza (String pizzaType)
	{
		System.out.println("Chef - " + this.name + " is cooking pizza - " + pizzaType);
	}
	
	public void cookPasta (String pastaType)
	{
		System.out.println("Chef - " + this.name + " is cooking pasta - " + pastaType);
	}
}
