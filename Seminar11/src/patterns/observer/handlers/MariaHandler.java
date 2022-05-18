package patterns.observer.handlers;

import patterns.observer.IObserver;

public class MariaHandler implements IObserver
{

	@Override
	public void act()
	{
		System.out.println("Dance in the rain");
	}
}
