package patterns.strategy.strategies;

public class StrategyMinNo implements IStrategyFindSpecificNo
{

	@Override
	public int process(int[] vector)
	{
		int min = vector[0];
		for (int i = 1; i < vector.length; i++)
		{
			if (vector[i] < min)
				min = vector[i];
		}
		return min;
	}
}
