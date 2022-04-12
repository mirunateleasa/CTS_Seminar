package decorator;

public class PizzaBasic extends APizza
{
	@Override
	public void getIngredients()
	{
		System.out.println("\t dough " + "ketchup " + "mozzarela ");
	}

	@Override
	public void calculateCost()
	{
		System.out.println("\t" + 20);		
	}

}
