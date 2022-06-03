package template;

import java.util.ArrayList;

public abstract class ACaseTakingProcedure
{
	double desiredFunds;
	String desiredLocation;
	ArrayList<Integer> availableWorkers = new ArrayList<>();
	
	public ACaseTakingProcedure(double desiredFunds, String desiredLocation,
	                    ArrayList<Integer> availableWorkers)
	{
		super();
		this.desiredFunds = desiredFunds;
		this.desiredLocation = desiredLocation;
		this.availableWorkers = availableWorkers;
	}
	
	protected abstract int lookForCase();
	protected abstract boolean sendCaseRequestToManager (int caseId, int managerId);
	protected abstract void startCase(int caseId);
	protected abstract ArrayList <Integer> selectWorkersForCase (ArrayList <Integer> availableWorkers);
	protected abstract void appendWorkers (ArrayList<Integer> workersToAppend, int caseId);
	protected abstract void giveUpCase (int caseId);
	
	public void templateCaseTakingProcedure (int managerId)
	{
		int caseId = lookForCase();
		if (sendCaseRequestToManager(caseId, managerId) == true)
		{
			startCase(caseId);
			ArrayList<Integer> selectedWorkers = selectWorkersForCase(this.availableWorkers);
			if (selectedWorkers != null)
			{
				appendWorkers(selectedWorkers, caseId);
			}
			else
			{
				System.out.println("You haven't selected any workers! You need to repeat the case taking procedure");
				giveUpCase(caseId);
			}
		}
		else System.out.println("Sorry! Your manager didn't approve you taking this case! Look again");
	}
}
