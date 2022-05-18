package patterns.observer;

import patterns.observer.handlers.AndreeaHandler;
import patterns.observer.handlers.MariaHandler;
import patterns.observer.handlers.MirunaHandler;

public class Main
{
	public static void main(String[] args)
	{
		RainEvent rain = new RainEvent();
		
		IObserver miruna = new MirunaHandler();
		IObserver andreea = new AndreeaHandler();
		IObserver maria = new MariaHandler();
		
		rain.subscribeObserver(miruna);
		rain.subscribeObserver(andreea);
		rain.subscribeObserver(maria);
		
		rain.publishEvent();
	}
}
