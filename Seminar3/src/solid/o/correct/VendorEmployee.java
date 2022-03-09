package solid.o.correct;

public class VendorEmployee extends Employee implements iBonusCalculator{
	
	public float salary;

	public VendorEmployee() {
		super();
	}

	public VendorEmployee(int iD, String name, float salary) {
		super(iD, name);
		this.salary = salary;
	}

	@Override
	public float calculateBonus() {
		return this.salary*.05f;
	}

	@Override
	public String toString() {
		return "VendorEmployee [salary=" + salary + "]";
	}
	
	
}
