package patterns.memento;

public class Main
{
	public static void main(String[] args)
	{
		VersionManager vManager = new VersionManager();
		Contract contract = new Contract("Miruna");
		
		contract.addClauses("increase salary");
		System.out.println(contract);
		vManager.addContractVersion(contract.saveVersion());
		
		contract.addClauses("work from home");
		System.out.println(contract);
		vManager.addContractVersion(contract.saveVersion());
		
		contract.addClauses("manager role");
		System.out.println(contract);
		vManager.addContractVersion(contract.saveVersion());
		
		//go back to version 1
		contract.restoreFromVersion(vManager.recoverVersion(0));
		System.out.println(contract);
	}
}
