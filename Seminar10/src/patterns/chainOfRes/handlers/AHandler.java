package patterns.chainOfRes.handlers;

import patterns.chainOfRes.classes.Order;

public abstract class AHandler
{
	public AHandler succesor = null;
	
	public abstract void processOrder (Order order);
	
	public void setSuccesor (AHandler succesor) {
		this.succesor = succesor;
	}
}
