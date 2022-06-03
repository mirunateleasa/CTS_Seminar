package chainOfResponsability;

import chainOfResponsability.classes.ACaseHandler;
import chainOfResponsability.classes.Case;
import chainOfResponsability.classes.CaseAdmin;
import chainOfResponsability.classes.CaseWorker;
import chainOfResponsability.classes.Manager;

public class Main
{
	public static void main(String[] args)
	{
		Case case1 = new Case(0, "Romania", 500, 4);
		Case case2 = new Case(1, "Sudan", 5000, 4);
		Case case3 = new Case(2, "Syria", 500, 10);
		Case case4 = new Case(3, "Israel", 10000, 40);
		
		ACaseHandler worker = new CaseWorker(1);
		ACaseHandler admin = new CaseAdmin(1);
		ACaseHandler manager = new Manager(1);
		
		worker.setSuccessor(admin);
		admin.setSuccessor(manager);
		
		worker.handleCase(case1);
		worker.handleCase(case2);
		worker.handleCase(case3);
		worker.handleCase(case4);
	}
}
