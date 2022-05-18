package patterns.memento;

public class ContractVersion	//the memento
{
	private String contractClause;

	public ContractVersion(String contractClause)
	{
		super();
		this.contractClause = contractClause;
	}

	public ContractVersion()
	{
		super();
	}

	public String getContractClause()
	{
		return contractClause;
	}

	public void setContractClause(String contractClause)
	{
		this.contractClause = contractClause;
	}
	
	
}
