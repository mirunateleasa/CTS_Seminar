package chainOfResponsability.classes;

public class Case
{
	private int caseId;
	private String caseLocation;
	private double caseFunds;
	private int casePersonsInNeed;
	
	public Case(int caseId, String caseLocation, double caseFunds, int casePersonsInNeed)
	{
		super();
		this.caseId = caseId;
		this.caseLocation = caseLocation;
		this.caseFunds = caseFunds;
		this.casePersonsInNeed = casePersonsInNeed;
	}

	public String getCaseLocation()
	{
		return caseLocation;
	}

	public void setCaseLocation(String caseLocation)
	{
		this.caseLocation = caseLocation;
	}

	public double getCaseFunds()
	{
		return caseFunds;
	}

	public void setCaseFunds(double caseFunds)
	{
		this.caseFunds = caseFunds;
	}

	public int getCaseId()
	{
		return caseId;
	}

	public int getCasePersonsInNeed()
	{
		return casePersonsInNeed;
	}

	public void setCasePersonsInNeed(int casePersonsInNeed)
	{
		this.casePersonsInNeed = casePersonsInNeed;
	}

	@Override
	public String toString()
	{
		return "Case [caseId=" + caseId + ", caseLocation=" + caseLocation + ", caseFunds=" + caseFunds
		                    + ", casePersonsInNeed=" + casePersonsInNeed + "]";
	}
}
