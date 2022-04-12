package abstractFactory;

public class HighBudgetFactory implements IFactory {

	@Override
	public ISuit createSuit() {
		return new MagicSuit();
	}

	@Override
	public IWeapon createWeapon() {
		return new MagicWeapon();
	}

}
