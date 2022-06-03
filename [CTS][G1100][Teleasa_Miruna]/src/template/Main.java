package template;

import java.util.ArrayList;

import factory.classes.CaseAdmin;
import factory.classes.Manager;

public class Main
{
	public static void main(String[] args)
	{
		CaseAdmin admin = new CaseAdmin(3, "Miruna", 3);
		Manager manager = new Manager(2, "Alina", 3);
		ArrayList<Integer> availableCases = new ArrayList<>();

		availableCases.add(1);
		availableCases.add(3);
		availableCases.add(7);
		availableCases.add(4);
		availableCases.add(10);
		availableCases.add(6);
		availableCases.add(9);
		availableCases.add(12);
		availableCases.add(13);
				
		ArrayList<Integer> availableWorkers = new ArrayList<>();
		availableWorkers.add(1);
		availableWorkers.add(3);
		availableWorkers.add(7);
		availableWorkers.add(4);
		availableWorkers.add(10);
		availableWorkers.add(6);
		availableWorkers.add(9);
		availableWorkers.add(12);
		availableWorkers.add(13);
		
		CaseTakingProcedure procedure = new CaseTakingProcedure(3000, "Romania", manager.getEmployeeId(), availableWorkers, admin.getEmployeeId(), availableCases);
		procedure.templateCaseTakingProcedure(manager.getEmployeeId());
	}
}
