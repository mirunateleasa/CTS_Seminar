package state.classes;

import state.states.ACaseState;
import state.states.InProgressCaseState;

public interface ICase
{
	public abstract int getCaseId();

	public abstract void setAdminId(int adminId);

	public abstract void setState(ACaseState state);

	public abstract int getAdminId();

	public abstract double getFunds();
	
	public void setFunds(double funds);
	
	public abstract void workOnCase (float funds);
	public abstract void startCase (int adminId);
	public abstract void finishCase();
}
