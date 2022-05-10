package patterns.template.classes;

public class InsuranceProcedure extends AInsuranceProcedure
{
	@Override
	protected void identifyDamage()
	{
		System.out.println("Identifying the damage...");
	}

	@Override
	protected void evaluateDamage()
	{
		System.out.println("Evaluating the damage...");
	}

	@Override
	protected void calculateInsurance()
	{
		System.out.println("Computing total damage cost...");
	}
}
