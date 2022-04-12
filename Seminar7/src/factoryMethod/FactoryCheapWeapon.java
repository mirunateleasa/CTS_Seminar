package factoryMethod;

public class FactoryCheapWeapon implements IFactory {

	@Override
	public  IWeapon create() {
		
		return new CheapWeapon();
	}

}
