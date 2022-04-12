package decorator;

public abstract class DecoratorPizza extends APizza
{
	//we need a concrete object to modify it at runtime
	protected APizza aPizza; 
	
	public DecoratorPizza (APizza aPizza)
	{
		this.aPizza = aPizza;
	}
	
	@Override
	public void getIngredients()
	{
		aPizza.getIngredients();
	}

	@Override
	public void calculateCost()
	{
		aPizza.calculateCost();
	}
}
