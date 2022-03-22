package solid.d.correct;

import solid.d.correct.Calculator.Operation;

public class Main {

	public static void main(String[] args) {
			Operation add = Calculator.Operation.ADD;
			Calculator.calculate(10, 15, new SubstractNumbers());
	}

}
