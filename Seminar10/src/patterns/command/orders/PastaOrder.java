package patterns.command.orders;

import patterns.command.handlers.Chef;

public class PastaOrder implements IOrder
{
	private Chef chef;
	private String pastaType;

	public PastaOrder(Chef chef, String pastaType)
	{
		super();
		this.chef = chef;
		this.pastaType = pastaType;
	}

	public Chef getChef()
	{
		return chef;
	}



	public void setChef(Chef chef)
	{
		this.chef = chef;
	}



	public String getPastaType()
	{
		return pastaType;
	}



	public void setPastaType(String pastaType)
	{
		this.pastaType = pastaType;
	}



	@Override
	public void processOrder()
	{
		this.chef.cookPasta(this.pastaType);
	}
}
