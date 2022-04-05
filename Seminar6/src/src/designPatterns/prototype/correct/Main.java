package src.designPatterns.prototype.correct;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		BookStore carturesti = BookStore.loadDataFromDB("Carturesti");
		System.out.println(carturesti);
		
		//deep copy
		BookStore diverta = (BookStore) carturesti.clone();
		diverta.setName("Diverta");
		diverta.getListBooks().remove(2);
		System.out.println(diverta);
		System.out.println(carturesti);
	}

}
