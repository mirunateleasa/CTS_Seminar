package patterns.state.states;

public class BreakState implements IState
{
	@Override
	public void doTask(String task)
	{
		System.out.println("This employee is on break and will work on task when returning - " + task);
	}
}
