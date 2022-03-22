package solid.d.correct;

public class Calculator {
	public enum Operation { ADD, SUBSTRACT, DIVIDE, MULTIPLY }
	
	public static void calculate (double a, double b, AddNumbers op)
	{
		double result = 0;
		result = op.calculate(a, b);
		System.out.println("RESULT: " + result);
	}
	
	public static void calculate (double a, double b, SubstractNumbers op)
	{
		double result = 0;
		result = op.calculate(a, b);
		System.out.println("RESULT: " + result);
	}
}

