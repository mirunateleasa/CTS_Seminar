package patterns.state.states;

public class WorkingState implements IState
{

	@Override
	public void doTask(String task)
	{
		System.out.println("This employee is currently working on - " + task);
	}
}
