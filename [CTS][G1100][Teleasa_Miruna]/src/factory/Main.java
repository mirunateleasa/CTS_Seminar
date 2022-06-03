package factory;

import factory.classes.CaseAdmin;
import factory.classes.IOrganizationEmployee;
import factory.factories.CaseAdminFactory;
import factory.factories.CaseWorkerFactory;
import factory.factories.ManagerFactory;

public class Main
{
	public static void main(String[] args)
	{
		IOrganizationEmployee employee1 = new ManagerFactory().createEmployee(0, "Miruna", 1);
		IOrganizationEmployee employee2 = new CaseAdminFactory().createEmployee(1, "Ionel", 1);
		IOrganizationEmployee employee3 = new CaseAdminFactory().createEmployee(2, "Andreea", 1);
		IOrganizationEmployee employee4 = new CaseWorkerFactory().createEmployee(3, "Paula", 1);
		
		System.out.println(employee1.getJob());
		System.out.println(employee2.getJob());
		System.out.println(employee3.getJob());
		System.out.println(employee4.getJob());
	}
}
