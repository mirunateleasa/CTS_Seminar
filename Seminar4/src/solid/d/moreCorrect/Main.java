package solid.d.moreCorrect;

public class Main {

	public static void main(String[] args) {
			Calculator calculator = new Calculator();
			double calculation = calculator.calculate(10, 15, new SubstractNumbers());
	}

}
