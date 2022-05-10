package patterns.command.handlers;

import java.util.ArrayList;

import patterns.command.orders.IOrder;

public class Waiter
{
	private ArrayList<IOrder> takenOrders = new ArrayList<>();
	
	public void takeOrder (IOrder order)
	{
		takenOrders.add(order);
	}
	
	public void sendOrderToChef ()
	{
		for (IOrder order : takenOrders)
		{
			order.processOrder();
		}
		takenOrders.clear();
	}
}
