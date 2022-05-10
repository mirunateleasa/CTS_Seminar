package patterns.template.classes;

public abstract class AInsuranceProcedure
{
	protected abstract void identifyDamage();
	protected abstract void evaluateDamage();
	protected abstract void calculateInsurance();
	
	public void templateGiveInsurance ()
	{
		identifyDamage();
		evaluateDamage();
		calculateInsurance();
	}
}
