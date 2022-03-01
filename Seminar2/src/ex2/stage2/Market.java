package ex2.stage2;

public class Market {
	public float computeDiscountedPrice(Constants.CLIENT_TYPES productType, float initialPrice, int period)
	  {
	    float discountByPeriod = 0;
	    float discount = (period > Constants.PRODUCT_TIME_LIMIT) ? (float)30/100 : (float)period/100; 
	    if (productType == Constants.CLIENT_TYPES.NEW_CLIENT)
	    {
	    	discountByPeriod = initialPrice;
	    }
	    else if (productType == Constants.CLIENT_TYPES.NORMAL_CLIENT)
	    {
	    	discountByPeriod = (initialPrice - (Constants.DISCOUNT_SMALL * initialPrice)) - discount * (initialPrice - (Constants.DISCOUNT_SMALL * initialPrice));
	    }
	    else if (productType == Constants.CLIENT_TYPES.FREQUENT_CLIENT)
	    {
	    	discountByPeriod = (initialPrice - (Constants.DISCOUNT_MEDIUM * initialPrice)) - discount * (initialPrice - (Constants.DISCOUNT_MEDIUM * initialPrice));
	    }
	    else if (productType == Constants.CLIENT_TYPES.EMAG_GENIUS)
	    {
	    	discountByPeriod = (initialPrice - (Constants.DISCOUNT_HIGH * initialPrice)) - discount * (initialPrice - (Constants.DISCOUNT_HIGH * initialPrice));
	    }
	    return discountByPeriod;
	  }
}
