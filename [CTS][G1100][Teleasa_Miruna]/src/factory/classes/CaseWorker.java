package factory.classes;

import java.util.ArrayList;

public class CaseWorker implements IOrganizationEmployee
{
	private int employeeId;
	private String employeeName;
	private int employeeOrganizationId;
	private ArrayList<Integer> currentCases = new ArrayList<Integer>();

	public CaseWorker(int employeeId, String employeeName, int organizationId)
	{
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeOrganizationId = organizationId;
	}

	public CaseWorker(int employeeId, String employeeName, ArrayList<Integer> currentCases)
	{
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.currentCases = currentCases;
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


	public ArrayList<Integer> getCurrentCases()
	{
		return currentCases;
	}


	public void setCurrentCases(ArrayList<Integer> currentCases)
	{
		this.currentCases = currentCases;
	}


	@Override
	public String getJob()
	{
		return "\n CASE WORKER";
	}
	
}
