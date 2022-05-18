package patterns.observer.handlers;

import patterns.observer.IObserver;

public class AndreeaHandler implements IObserver
{

	@Override
	public void act()
	{
		System.out.println("Close windows of the car");
	}
}
