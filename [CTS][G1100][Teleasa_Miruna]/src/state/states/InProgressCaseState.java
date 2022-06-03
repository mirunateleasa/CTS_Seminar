package state.states;

import state.classes.ICase;

public class InProgressCaseState extends ACaseState
{
	public InProgressCaseState(ICase iCase)
	{
		super(iCase);
	}

	@Override
	public void workOnCase(float funds)
	{
		System.out.println("Working on case " + this.iCase.getCaseId() + " - remaining $" + (this.iCase.getFunds() - funds));
		this.iCase.setFunds(this.iCase.getFunds() - funds);
	}

	@Override
	public void startCase(int adminId)
	{
		System.out.println("You cannot start already started case " + this.iCase.getCaseId() + " - in Progress");
	}

	@Override
	public void finishCase()
	{
		System.out.println("Finishing case " + this.iCase.getCaseId() + ". Congratulations!");
		this.iCase.setAdminId(-1);
		this.iCase.setState(new SolvedCaseState(iCase));
	}


}
