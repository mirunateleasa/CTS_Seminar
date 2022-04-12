package decorator;

public class Main
{
	public static void main(String[] args)
	{
		APizza pizzaBasic = new PizzaBasic();
		System.out.println("PIZZA BASIC: ");
		pizzaBasic.getIngredients();
		pizzaBasic.calculateCost();
		
		APizza aPizza = new DecoratorChickenPizza(pizzaBasic);
		System.out.println("CHICKEN PIZZA: ");
		aPizza.getIngredients();
		aPizza.calculateCost();
	}
}
