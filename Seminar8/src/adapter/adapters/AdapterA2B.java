package adapter.adapters;

import adapter.DiscountB;
import adapter.interfaces.iDiscountA;

public class AdapterA2B extends DiscountB implements iDiscountA
{
	@Override
	public double calculateDiscountA(int value)
	{
		//this cannot be done (because we cannot create a client with only a value as the number of orders
		// TODO Auto-generated method stub
		return 0;
	}

}
