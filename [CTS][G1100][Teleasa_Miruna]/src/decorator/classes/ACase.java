package decorator.classes;

import java.util.ArrayList;

public abstract class ACase
{
	private int caseId;
	private String caseLocation;
	private double caseFundsNeeded;
	private int adminId;
	private ArrayList<String> caseProblems = new ArrayList<>();
	
	public String getCaseLocation()
	{
		return caseLocation;
	}
	public void setCaseLocation(String caseLocation)
	{
		this.caseLocation = caseLocation;
	}
	public double getCaseFundsNeeded()
	{
		return caseFundsNeeded;
	}
	public void setCaseFundsNeeded(double caseFundsNeeded)
	{
		this.caseFundsNeeded = caseFundsNeeded;
	}
	public int getAdminId()
	{
		return adminId;
	}
	public void setAdminId(int adminId)
	{
		this.adminId = adminId;
	}
	public ArrayList<String> getCaseProblems()
	{
		return caseProblems;
	}
	public void setCaseProblems(ArrayList<String> caseProblems)
	{
		this.caseProblems = caseProblems;
	}
	public int getCaseId()
	{
		return caseId;
	}
	
	public String describeProblems ()
	{
		return this.getCaseProblems().toString();
	}
}
