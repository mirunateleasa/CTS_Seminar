package patterns.chainOfRes.handlers;

import patterns.chainOfRes.classes.Order;

public class Chef extends AHandler
{
	@Override
	public void processOrder(Order order)
	{
		if (order.getDifficulty() > 5)
		{
			System.out.println("\tChef is processing order - " + order.getFoodName());
		}
	}
}
