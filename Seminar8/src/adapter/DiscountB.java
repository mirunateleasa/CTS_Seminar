package adapter;

import adapter.interfaces.iDiscountB;

public class DiscountB implements iDiscountB {
	@Override
	public double calculateDiscountB(Client client) {
		System.out.println("\n METHOD B: ");
		int total = 0;
		for (int i = 0; i < client.getNoOrders(); i++)
		{
			total += client.getOrders()[i];
		}
		if (total >= 1000)
			return 0.3;
		if (total > 500 && total < 1000)
			return 0.2;
		return 0;
	}
	
}
