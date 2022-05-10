package patterns.state;

import patterns.state.states.BreakState;
import patterns.state.states.EStateTypes;
import patterns.state.states.IState;
import patterns.state.states.VacationState;
import patterns.state.states.WorkingState;

public class Employee
{
	public IState currentState;


	public IState getCurrentState()
	{
		return currentState;
	}

	//setter-ul generat:
//	public void setCurrentState(IState currentState)
//	{
//		this.currentState = currentState;
//	}
	
	//setter-ul corect:
	public void setCurrentState (EStateTypes stateType)
	{
		switch (stateType)
		{
		case WORKING:
			this.currentState = new WorkingState();
			break;
		case BREAK:
			this.currentState = new BreakState();
			break;
		case VACATION:
			this.currentState = new VacationState();
			break;
		default:
			throw new UnsupportedOperationException();
		}
	}
	
	public void act (String task)
	{
		this.currentState.doTask(task);
	}
}
