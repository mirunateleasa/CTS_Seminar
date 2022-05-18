package patterns.observer.handlers;

import patterns.observer.IObserver;

public class MirunaHandler implements IObserver
{

	@Override
	public void act()
	{
		System.out.println("Close window of the house");
	}
}
