package adapter;

import adapter.interfaces.iDiscountA;

public class DiscountA implements iDiscountA {
	
	@Override
	public double calculateDiscountA(int value) {
		System.out.println("\n METHOD A: ");
		if (value >= 100)
			return 0.1;
		if (value > 50 && value <100)
			return 0.05;
		return 0;
	}

}
