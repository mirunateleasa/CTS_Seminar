package abstractFactory;

public class Shop {
	IFactory factoryCategory;
	
	public Shop(IFactory category) {
		this.factoryCategory=category;
	}
	
	public void createPackage() {
		ISuit suit = this.factoryCategory.createSuit();
		IWeapon weapon = this.factoryCategory.createWeapon();
	}
}
