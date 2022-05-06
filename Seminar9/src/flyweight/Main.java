package flyweight;

public class Main
{
	public static void main(String[] args)
	{
		Receipt[] listReceipt = new Receipt [50];
		ReceiptData[] listReceiptData = new ReceiptData [50];
		
		for (int i = 0; i < 50; i++)
		{
			listReceipt[i] = FlyWeight_Factory.getReceipt(ReceiptTypes.valueOf("FORMAT" +( i%3+1)));
			ReceiptData data = new ReceiptData (100+i);
		}
		
		for (int i = 0; i<50; i++)
		{
			listReceipt[i].printReceipt(listReceiptData[i]);
		}
		
	
	}
}
