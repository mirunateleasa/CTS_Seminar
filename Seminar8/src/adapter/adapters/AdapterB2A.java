package adapter.adapters;

import adapter.Client;
import adapter.DiscountA;
import adapter.interfaces.iDiscountB;

public class AdapterB2A extends DiscountA implements iDiscountB{
	@Override
	public double calculateDiscountB(Client client)	//the method from B
	{
		System.out.println("\nMETHOD B 2 A: ");
		//ORI
                		//varianta in care pastram DOAR functia din A
                		//this.calculateDiscountA(client.getNoOrders());
                	//ORI
                		//varianta in care pastram logica din B
                		int total = 0;
                		for (int i = 0; i < client.getNoOrders(); i++)
                		{
                			total += client.getOrders()[i];
                		}
                		this.calculateDiscountA(total);
                		return 0;
	}
	
}
