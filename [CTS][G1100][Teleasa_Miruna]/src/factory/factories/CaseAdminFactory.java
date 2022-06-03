package factory.factories;

import factory.classes.CaseAdmin;
import factory.classes.IOrganizationEmployee;

public class CaseAdminFactory implements IFactory
{

	@Override
	public IOrganizationEmployee createEmployee(int employeeId, String employeeName, int employeeOrganizationId)
	{
		return new CaseAdmin(employeeId, employeeName, employeeOrganizationId);
	}
}
