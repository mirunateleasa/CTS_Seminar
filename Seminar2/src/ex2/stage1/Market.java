package ex2.stage1;

public class Market {
	
	public float computeDiscountedPrice(int productType, float initialPrice, int period)
	  {
	    float discountByPeriod = 0;
	    float discount = (period > 10) ? (float)30/100 : (float)period/100; 
	    if (productType == 1)
	    {
	    	discountByPeriod = initialPrice;
	    }
	    else if (productType == 2)
	    {
	    	discountByPeriod = (initialPrice - (0.1f * initialPrice)) - discount * (initialPrice - (0.1f * initialPrice));
	    }
	    else if (productType == 3)
	    {
	    	discountByPeriod = (initialPrice - (0.25f * initialPrice)) - discount * (initialPrice - (0.25f * initialPrice));
	    }
	    else if (productType == 4)
	    {
	    	discountByPeriod = (initialPrice - (0.35f * initialPrice)) - discount * (initialPrice - (0.35f * initialPrice));
	    }
	    return discountByPeriod;
	  }
}
