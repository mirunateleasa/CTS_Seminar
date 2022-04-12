package factoryMethod;

public class CheapWeapon implements IWeapon {

	@Override
	public void power() {
		System.out.println("This weapon has no power.");
	}
	
}
