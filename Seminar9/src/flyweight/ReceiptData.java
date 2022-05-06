package flyweight;

public class ReceiptData	//this is temporal (extrinsec) data
{
	private float price;

	public ReceiptData(float price)
	{
		super();
		this.price = price;
	}

	public float getPrice()
	{
		return price;
	}

	public void setPrice(float price)
	{
		this.price = price;
	}
}
