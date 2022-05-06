package flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyWeight_Factory
{
	private static Map <ReceiptTypes, Receipt> listReceipt = new HashMap<ReceiptTypes, Receipt>();
	
	public static Receipt getReceipt(ReceiptTypes type)
	{
		Receipt receipt = new Receipt (type);
		listReceipt.put(type, receipt);
		return receipt;
	}
	
	public static int getNoReceipt()
	{
		return listReceipt.size();
	}
}
