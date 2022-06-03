package template;

import java.util.ArrayList;
import java.util.Random;

public class CaseTakingProcedure extends ACaseTakingProcedure
{
	int adminId;
	int managerId;
	double availableFunds;
	String caseLocation;
	ArrayList<Integer> availableCases = new ArrayList<>();
	ArrayList<Integer> selectedWorkers = new ArrayList<>();

	public CaseTakingProcedure(double desiredFunds, String desiredLocation, int managerId,
	                    ArrayList<Integer> availableWorkers, int adminId, ArrayList<Integer> availableCases)
	{
		super(desiredFunds, desiredLocation,  availableWorkers);
		this.adminId = adminId;
		this.managerId = managerId;
		this.availableFunds = desiredFunds;;
		this.desiredLocation = desiredLocation;
		this.availableCases = availableCases;
	}

	@Override
	protected int lookForCase()
	{
		System.out.println("Admin " + this.adminId + " looking for a case");
		return (int)(Math.random() * availableCases.size());
	}

	@Override
	protected boolean sendCaseRequestToManager(int caseId, int managerId)
	{
		System.out.println("Admin " + this.adminId + " asking for manager " + this.managerId + " for case " + caseId);
		return new Random().nextBoolean();
	}

	@Override
	protected void startCase(int caseId)
	{
		System.out.println("Manager accepted - admin " + this.adminId + " starting case" );
	}

	@Override
	protected ArrayList<Integer> selectWorkersForCase(ArrayList<Integer> availableWorkers)
	{
		System.out.println("Admin " + this.adminId + " selecting workers");
		selectedWorkers = new ArrayList<>();
		for (int i = 0; i < availableWorkers.size(); i+=3)
		{
			if (availableWorkers.contains(Integer.valueOf(i)))
			{
				selectedWorkers.add(i);
				availableWorkers.remove(i);
			}
		}
		return selectedWorkers;
	}

	@Override
	protected void appendWorkers(ArrayList<Integer> workersToAppend, int caseId)
	{
		System.out.println("Appending workers: " + this.selectedWorkers.toString() + " to the case   " + caseId);
	}

	@Override
	protected void giveUpCase(int caseId)
	{
		System.out.println("Admin " + this.adminId + " is giving up case " +caseId);
	}
}
