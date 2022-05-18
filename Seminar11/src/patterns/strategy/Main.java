package patterns.strategy;

import patterns.strategy.strategies.StrategyMaxNo;

public class Main
{
	public static void main(String[] args)
	{
		int [] vector = new int [10];
		for (int i = 0; i < 10; i++)
		{
			if (i%2 == 0)
			{
				vector [i] = -i*2+3;
			}
			else
			{
				vector[i] = i*3+5;
			}
			System.out.print(vector[i] + ", ");
		}
		
		Data data = new Data(vector, new StrategyMaxNo());
		System.out.println("\nRESULT: " + data.processVector());
	}
}
