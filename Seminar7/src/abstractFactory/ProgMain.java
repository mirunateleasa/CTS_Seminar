package abstractFactory;

public class ProgMain {
	public static void main(String[] args) {
		Shop shop = new Shop(new HighBudgetFactory());
		shop.createPackage();
	}
}
