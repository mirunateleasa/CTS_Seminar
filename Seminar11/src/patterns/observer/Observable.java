package patterns.observer;

import java.util.ArrayList;

public class Observable
{
	private ArrayList<IObserver> observers = new ArrayList<>();
	
	public void subscribeObserver (IObserver observer)
	{
		observers.add(observer);
	}
	
	public void removeObserver (IObserver observer)
	{
		observers.remove(observer);
	}
	
	public void notifyObservers ()
	{
		for (IObserver observer : observers)
		{
			observer.act();
		}
	}
}
