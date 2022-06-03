package chainOfResponsability.classes;

public class CaseWorker extends ACaseHandler
{
	private int workerId;
	
	public CaseWorker(int workerId)
	{
		super();
		this.workerId = workerId;
	}

	public int getWorkerId()
	{
		return workerId;
	}

	@Override
	public void handleCase(Case caseToHandle)
	{
		if (caseToHandle.getCaseFunds() < 1000 && caseToHandle.getCasePersonsInNeed() < 5)
			{
				System.out.println("This case " + caseToHandle.getCaseId() + " will be handled by the worker with id: " + this.workerId);
			}
			else
			{
				System.out.println("This case " + caseToHandle.getCaseId() + " cannot be handled only by this worker. Sending it to an admin...");
				this.successor.handleCase(caseToHandle);;
			}
	}
}
