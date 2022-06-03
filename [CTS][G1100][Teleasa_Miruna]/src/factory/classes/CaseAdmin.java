package factory.classes;

import java.util.ArrayList;

public class CaseAdmin implements IOrganizationEmployee
{
	private int employeeId;
	private String employeeName;
	private int employeeOrganizationId;
	private int currentCase;
	private ArrayList<CaseWorker> subordinates = new ArrayList<CaseWorker>();

	public CaseAdmin(int employeeId, String employeeName, int organizationId)
	{
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeOrganizationId = organizationId;
	}

	public CaseAdmin(int employeeId, String employeeName, int currentCase, ArrayList<CaseWorker> subordinates)
	{
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.currentCase = currentCase;
		this.subordinates = subordinates;
	}

	public int getEmployeeId()
	{
		return employeeId;
	}

	public String getEmployeeName()
	{
		return employeeName;
	}

	public void setEmployeeName(String employeeName)
	{
		this.employeeName = employeeName;
	}

	public int getCurrentCase()
	{
		return currentCase;
	}

	public void setCurrentCases(int currentCase)
	{
		this.currentCase = currentCase;
	}

	public ArrayList<CaseWorker> getSubordinates()
	{
		return subordinates;
	}

	public void setSubordinates(ArrayList<CaseWorker> subordinates)
	{
		this.subordinates = subordinates;
	}

	@Override
	public String getJob()
	{
		return "\n CASE ADMIN";
	}
}
