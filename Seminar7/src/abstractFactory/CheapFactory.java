package abstractFactory;

public class CheapFactory implements IFactory {

	@Override
	public ISuit createSuit() {
		return new CheapSuit();
	}

	@Override
	public IWeapon createWeapon() {
		return new CheapWeapon();
	}

}
