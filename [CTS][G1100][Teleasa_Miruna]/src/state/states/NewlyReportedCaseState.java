package state.states;

import state.classes.ICase;

public class NewlyReportedCaseState extends ACaseState
{

	public NewlyReportedCaseState(ICase iCase)
	{
		super(iCase);
	}

	@Override
	public void workOnCase(float funds)
	{
		System.out.println("You cannot work on case " + this.iCase.getCaseId() + " - newly reported");
	}

	@Override
	public void finishCase()
	{
		System.out.println("You cannot finish not-yet-started case " + this.iCase.getCaseId() + " - newly reported");
	}

	@Override
	public void startCase(int adminId)
	{
		System.out.println("Starting case " + this.iCase.getCaseId() + " by admin " + adminId);
		this.iCase.setAdminId (adminId);
		this.iCase.setState(new InProgressCaseState(iCase));
	}
}
