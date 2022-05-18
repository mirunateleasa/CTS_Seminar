package patterns.observer;

public class RainEvent extends Observable
{
	private String info = "raining";
	private boolean started = false;

	public void startEvent ()
	{
		if (this.started == false)
		{
			this.started = true;
			this.notifyAll();
		}
	}
	
	public void publishEvent ()
	{
		this.startEvent();
	}
}
