package flyweight;

public class Receipt implements iReceipt
{
	private ReceiptTypes type;
	
	public Receipt(ReceiptTypes type)
	{
		super();
		this.type = type;
	}
	
	public ReceiptTypes getType ()
	{
		return this.type;
	}

	@Override
	public String printReceipt(ReceiptData data)
	{
		String info = "RECEIPT: " +  this.type.toString();
		info += " with price: " + data.getPrice();
		return info;
	}
}
