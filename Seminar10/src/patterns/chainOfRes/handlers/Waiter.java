package patterns.chainOfRes.handlers;

import patterns.chainOfRes.classes.Order;

public class Waiter extends AHandler
{
	@Override
	public void processOrder(Order order)
	{
		if (order.getDifficulty() > 5)
		{
			System.out.println("Waiter can't handle this. Passing it forward...");
			this.succesor.processOrder(order);
		}
		else
		{
			System.out.println("Waiter is processing order - " + order.getFoodName());
		}
	}
}
