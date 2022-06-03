package state.states;

import state.classes.ICase;

public class SolvedCaseState extends ACaseState
{
	public SolvedCaseState(ICase iCase)
	{
		super(iCase);
	}

	@Override
	public void workOnCase(float funds)
	{
		System.out.println("You cannot work on case " + this.iCase.getCaseId() + " - solved");
	}

	@Override
	public void startCase(int adminId)
	{
		System.out.println("You cannot start case " + this.iCase.getCaseId() + " - solved");
	}

	@Override
	public void finishCase()
	{
		System.out.println("You cannot finish case " + this.iCase.getCaseId() + " - solved");
	}


}
