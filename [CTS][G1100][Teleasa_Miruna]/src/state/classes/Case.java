package state.classes;

import java.util.ArrayList;

import state.states.ACaseState;
import state.states.NewlyReportedCaseState;

public class Case implements ICase
{
	private int caseId;
	private String caseLocation;
	private double funds;
	private int personsInNeed;
	private int adminId;
	private ArrayList<Integer> caseWorkersId = new ArrayList<>();
	
	private ACaseState state;
	
	public void setState(ACaseState state)
	{
		this.state = state;
	}

	public Case(int caseId, String caseLocation, double caseFunds, int casePersonsInNeed)
	{
		super();
		this.caseId = caseId;
		this.caseLocation = caseLocation;
		this.funds = caseFunds;
		this.personsInNeed = casePersonsInNeed;
		this.adminId = -1;
		
		//initial state
		this.setState(new NewlyReportedCaseState(this));
	}
	
	public String getCaseLocation()
	{
		return caseLocation;
	}

	public void setCaseLocation(String caseLocation)
	{
		this.caseLocation = caseLocation;
	}

	public double getFunds()
	{
		return funds;
	}

	public void setFunds(double funds)
	{
		this.funds = funds;
	}

	public int getPersonsInNeed()
	{
		return personsInNeed;
	}

	public void setPersonsInNeed(int personsInNeed)
	{
		this.personsInNeed = personsInNeed;
	}

	public int getAdminId()
	{
		return adminId;
	}

	public void setAdminId(int adminId)
	{
		this.adminId = adminId;
	}

	public ArrayList<Integer> getCaseWorkersId()
	{
		return caseWorkersId;
	}

	public void setCaseWorkersId(ArrayList<Integer> caseWorkersId)
	{
		this.caseWorkersId = caseWorkersId;
	}

	public void addWorkerToCase (int workerId)
	{
		this.caseWorkersId.add(Integer.valueOf(workerId));
	}
	
	public void removeWorkerFromCase (int workerId)
	{
		this.caseWorkersId.remove(Integer.valueOf(workerId));
	}

	public int getCaseId()
	{
		return caseId;
	}

	@Override
	public void workOnCase(float funds)
	{
		this.state.workOnCase(funds);
	}

	@Override
	public void startCase(int adminId)
	{
		this.state.startCase(adminId);
	}

	@Override
	public void finishCase()
	{
		this.state.finishCase();
	}
	
	

}
