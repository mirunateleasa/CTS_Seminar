package factoryMethod;

public class ProgMain {

	public static void main(String[] args) {
		FactoryCheapWeapon factoryCheapWeapon = new FactoryCheapWeapon();
		IWeapon weapon = factoryCheapWeapon.create();
	}

}
