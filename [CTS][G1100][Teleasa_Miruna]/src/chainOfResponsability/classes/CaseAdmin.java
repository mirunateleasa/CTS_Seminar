package chainOfResponsability.classes;

public class CaseAdmin extends ACaseHandler
{
	private int adminId;

	public CaseAdmin(int adminId)
	{
		super();
		this.adminId = adminId;
	}
	
	public int getAdminId()
	{
		return adminId;
	}

	@Override
	public void handleCase(Case caseToHandle)
	{
		if (caseToHandle.getCaseFunds() < 1000)
		{
			System.out.println("\tThis case " + caseToHandle.getCaseId() + " will be handled by the admin with id: " + this.adminId);
		}
		else
		{
			System.out.println("\tThis case " + caseToHandle.getCaseId() + " cannot be handled only by admin. Sending it to a manager...");
			this.successor.handleCase(caseToHandle);;
		}
	}
}
