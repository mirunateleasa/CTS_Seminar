package adapter;

import adapter.adapters.AdapterB2A;
import adapter.interfaces.iDiscountB;

public class Main
{
	public static void main(String[] args)
	{
		int []orders = new int[2];
		orders[0] = 100;
		orders[1] = 150;
		Client client = new Client("Miruna", 2, orders);
		iDiscountB discount = new AdapterB2A();
		
		discount.calculateDiscountB (client);
	}

}
