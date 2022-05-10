package patterns.command;

import patterns.command.handlers.Chef;
import patterns.command.handlers.Waiter;
import patterns.command.orders.PastaOrder;
import patterns.command.orders.PizzaOrder;

public class Main
{
	public static void main(String[] args)
	{
		Chef chef1 = new Chef("Michael");
		Chef chef2 = new Chef("Rose");
		
		Waiter waiter = new Waiter();
		
		waiter.takeOrder(new PizzaOrder(chef2, "diavola"));
		waiter.takeOrder(new PastaOrder(chef2, "carbonara"));
		waiter.takeOrder(new PizzaOrder(chef1, "margherita"));
		
		waiter.sendOrderToChef();
	}
}
