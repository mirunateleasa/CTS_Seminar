package factory.classes;

import java.util.ArrayList;

public class Manager implements IOrganizationEmployee
{
	private int employeeId;
	private String employeeName;
	private int employeeOrganizationId;
	private ArrayList<IOrganizationEmployee> subordinates = new ArrayList<>();

	public Manager(int employeeId, String employeeName, int organizationId)
	{
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeOrganizationId = organizationId;
	}

	public Manager(int employeeId, String employeeName, int organizationId,
	                    ArrayList<IOrganizationEmployee> subordinates)
	{
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeOrganizationId = organizationId;
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

	public int getOrganizationId()
	{
		return employeeOrganizationId;
	}

	public void setOrganizationId(int organizationId)
	{
		this.employeeOrganizationId = organizationId;
	}

	public ArrayList<IOrganizationEmployee> getSubordinates()
	{
		return subordinates;
	}

	public void setSubordinates(ArrayList<IOrganizationEmployee> subordinates)
	{
		this.subordinates = subordinates;
	}

	@Override
	public String getJob()
	{
		return "\n MANAGER";
	}	
}
