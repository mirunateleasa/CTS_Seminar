package src.designPatterns.prototype.wrong;

public class Main {

	public static void main(String[] args) {
		BookStore Carturesti = BookStore.loadDataFromDB("carturesti");
		System.out.println(Carturesti);
		
		//shallow copy!!!!!
		BookStore Diverta = Carturesti;
		System.out.println(Diverta);
	}

}
