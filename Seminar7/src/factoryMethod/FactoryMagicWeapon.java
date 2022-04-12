package factoryMethod;

public class FactoryMagicWeapon implements IFactory {

	@Override
	public IWeapon create() {
		return new MagicWeapon();
	}

}
