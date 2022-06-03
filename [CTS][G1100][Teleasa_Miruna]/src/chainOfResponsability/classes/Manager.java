package chainOfResponsability.classes;

public class Manager extends ACaseHandler
{
	private int managerId;

	public Manager(int managerId)
	{
		super();
		this.managerId = managerId;
	}

	public int getManagerId()
	{
		return managerId;
	}


	@Override
	public void handleCase(Case caseToHandle)
	{
		System.out.println("\t\tManager is handling the case " + caseToHandle.getCaseId());
	}
}
