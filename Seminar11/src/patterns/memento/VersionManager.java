package patterns.memento;

import java.util.ArrayList;

public class VersionManager
{
	private ArrayList<ContractVersion> versions = new ArrayList<>();
	
	public void addContractVersion (ContractVersion version)
	{
		this.versions.add(version);
	}
	
	public ContractVersion recoverVersion (int versionPosition)
	{
		return this.versions.get(versionPosition);
	}
}
