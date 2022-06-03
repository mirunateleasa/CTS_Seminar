package factory.factories;

import factory.classes.IOrganizationEmployee;
import factory.classes.Manager;

public class ManagerFactory implements IFactory
{

	@Override
	public IOrganizationEmployee createEmployee(int employeeId, String employeeName, int employeeOrganizationId)
	{
		return new Manager(employeeId, employeeName, employeeOrganizationId);
	}
	
}
