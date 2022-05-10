package patterns.state.states;

public class VacationState implements IState
{

	@Override
	public void doTask(String task)
	{
		System.out.println("This employee is in vacantion and cannot work on task - " + task);
	}
}
