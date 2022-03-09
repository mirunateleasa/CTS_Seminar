package solid.o.correct;

public class FTEEmployee extends Employee implements iBonusCalculator {

	public float salary;
	
	public FTEEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FTEEmployee(int iD, String name, float salary) {
		super(iD, name);
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "FTEEmployee [salary=" + salary + "]";
	}

	@Override
	public float calculateBonus() {
		return this.salary*.1f;
	}

		
}
