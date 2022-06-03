package decorator.classes;

public class CaseBasic extends ACase
{

	public CaseBasic(int caseId, String caseLocation, double caseFundsNeeded)
	{
		super();
		this.getCaseProblems().add("SOCIAL");
		this.setAdminId(-1);
	}
	
}
