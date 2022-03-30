package designPatterns.singleton.early.notExceptionSafe;

public class Main {

	public static void main(String[] args) {
		Database d1 = Database.getInstance();
	}

}
