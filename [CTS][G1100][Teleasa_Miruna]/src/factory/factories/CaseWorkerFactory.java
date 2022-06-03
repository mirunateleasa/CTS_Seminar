package factory.factories;

import factory.classes.CaseWorker;
import factory.classes.IOrganizationEmployee;

public class CaseWorkerFactory implements IFactory
{

	@Override
	public IOrganizationEmployee createEmployee(int employeeId, String employeeName, int employeeOrganizationId)
	{
		return new CaseWorker(employeeId, employeeName, employeeOrganizationId);
	}
}
