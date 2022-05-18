package patterns.memento;

public class Contract
{
	private String empName;
	private String contractClauses;
	
	public Contract(String empName, String contractClauses)
	{
		super();
		this.empName = empName;
		this.contractClauses = contractClauses;
	}
	
	public Contract(String empName)
	{
		super();
		this.empName = empName;
	}

	public String getEmpName()
	{
		return empName;
	}
	public void setEmpName(String empName)
	{
		this.empName = empName;
	}
	public String getContractClauses()
	{
		return contractClauses;
	}
	public void setContractClauses(String contractClause)
	{
		this.contractClauses = contractClause;
	}

	public void addClauses (String newClause)
	{
		this.contractClauses += "\n" + newClause;
	}

	@Override
	public String toString()
	{
		return "Contract [empName=" + empName + ", contractClauses=" + contractClauses + "]";
	}
	
	public ContractVersion saveVersion ()	//createMemento
	{
		return new ContractVersion(this.contractClauses);
	}
	
	public void restoreFromVersion  (ContractVersion version)	//setMemento
	{
		this.contractClauses = version.getContractClause();
	}
}
