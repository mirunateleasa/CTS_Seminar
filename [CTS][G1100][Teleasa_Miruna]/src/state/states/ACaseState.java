package state.states;

import state.classes.ICase;

public abstract class ACaseState
{
	ICase iCase;

	public ACaseState(ICase iCase)
	{
		super();
		this.iCase = iCase;
	}
	
	public abstract void workOnCase (float funds);
	public abstract void startCase (int adminId);
	public abstract void finishCase();
}
