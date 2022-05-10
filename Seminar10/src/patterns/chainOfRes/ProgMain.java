package patterns.chainOfRes;

import patterns.chainOfRes.classes.Order;
import patterns.chainOfRes.handlers.AHandler;
import patterns.chainOfRes.handlers.Chef;
import patterns.chainOfRes.handlers.Waiter;

public class ProgMain
{
	public static void main(String[] args)
	{
		Order food = new Order("Pizza", 15);
		Order beverage = new Order("Coffee", 3);
		
		AHandler waiter = new Waiter();
		AHandler chef = new Chef();
		waiter.setSuccesor(chef);
		
		waiter.processOrder(beverage);
		waiter.processOrder(food);
	}
}
