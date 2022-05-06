package composite;

public class Main
{
	public static void main(String[] args) throws Exception
	{
		Structure menu = new Structure("Menu");
		Structure drinks = new Structure ("Drinks");
		Structure foods = new Structure("Foods");
		Structure alcoholic = new Structure ("Alcoholic Drinks");
		Structure nonAlcoholic = new Structure ("NonAlcoholic Drinks");
		
		menu.addNode(foods);
		menu.addNode(drinks);
		drinks.addNode(nonAlcoholic);
		drinks.addNode(alcoholic);
		
		Node pizzaCarbonara = new Node ("Pizza Carbonara", 25);
		foods.addNode(pizzaCarbonara);
		Node pizzaMargherita = new Node ("Pizza Margherita", 20);
		foods.addNode(pizzaMargherita);
		
		System.out.println(menu.getInfo());
	}
}
