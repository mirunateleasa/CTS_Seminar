package factory.factories;

import factory.classes.IOrganizationEmployee;

public interface IFactory
{
	public IOrganizationEmployee createEmployee(int employeeId, String employeeName, int employeeOrganizationId);
}
